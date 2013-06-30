/*  
 * ===================AJAX异步分页================= 
 * 假设id为pageWidget的div是你放置分页控件的容器，则按如下形式调用：  
 * $("#pageWidget").asynPage("/user/findUser_asyn.action","#tbody",buildHtml,totalRowSize,{"pageRowSize":10});  
 * 参数说明：  
 * ------------Required-----------  
 * 参数一url: 请求URL
 * 参数二params: 查询的条件,拼装成K1=V1&K2=V2的形式
 * 参数三contentContainer: 渲染结果集的页面容器
 * 参数四buildHtml_fun: 负责渲染结果集到页面的函数
 * 参数五pageRowSize: 每页显示数据条数
 * 参数六callBackListName: action中定义的返回集合数据的名称
 * 参数七callBackTotalSizeName: action中定义的返回总条数的名称
 * 参数六七是ajax返回数据后(91,92行)为struts2服务,如果为struts1可自行改动,甚至去掉这两个参数
 */
(function($){
    var settings;
    var page;
    var paramStr;
       
    $.fn.asynPage1 = function(url,params,contentContainer,buildHtml_fun,pageRowSize,callBackListName,callBackTotalSizeName){
    	
        settings = $.extend({
            currPageNum:1,
            pageRowSize:null,
			param:params
        },{});
        
        settings.contentContainer = $(contentContainer);
        settings.url = url;
        settings.pageWidget = this;
        settings.pageRowSize = pageRowSize;
        settings.buildHtml_fun = buildHtml_fun;
        settings.callBackListName = callBackListName;
        settings.callBackTotalSizeName = callBackTotalSizeName;
        
        page = new Page(settings.currPageNum,0,settings.pageRowSize);
        
        paramStr = settings.param==null ? "" : settings.param;
        
        //开始获取数据   
        fetchData(page.getCurrPageNum());
        
        return this;   
    };
       
    /*   
     * 负责获取后台数据，获取完毕后会触发构建分页控件  
     */  
    var fetchData = function(currPageNum){
        page.setCurrPageNum(currPageNum);
        var firstResult = page.getFirstResult();
        var maxResult = page.getMaxResult();
		var pageRowSize = page.getPageRowSize();
		
		var data = null;
		
		if(paramStr){
           data = paramStr + "&currPageNum="+currPageNum+"&pageRowSize="+pageRowSize+"&firstResult="+firstResult+"&maxResult="+maxResult;
		}else{
           data = "currPageNum="+currPageNum+"&pageRowSize="+pageRowSize+"&firstResult="+firstResult+"&maxResult="+maxResult;
		}
		
		$.ajax({
           type :"POST",
           async:true,
           url : settings.url,
           data :data,
           dataType:"JSON",
           success:function(datas,msg,xmlHttp){
				var list = settings.callBackListName;
				var totalSize = settings.callBackTotalSizeName;
				var data = JSON.parse(datas);
				settings.contentContainer.empty();
				settings.buildHtml_fun(data.stuList);
				page.setTotalRowSize(data.totalSize);
				buildPageWidget(page);//触发构建分页控件
           },
           error:function(xmlHttpRequest,textStatus,errorThrown){
               if(textStatus == "error"){
                   var error = eval('('+xmlHttpRequest.responseText+')');
                   alert("Sorry："+error.errorCode+"，"+error.message+"！");
                }
            }
        });
    };
       
    /* 为分页控件绑定事件 */  
    var bindEvent = function(){
        var links = settings.pageWidget.find("a");
        $.each(links,function(i,link){
            var link = $(link);
            var pageNum = link.attr("pageNum");
            link.click(function(){
                fetchData(pageNum);
            });
        });
    }
       
    /* 构建分页控件的具体算法实现 */  
    var buildPageWidget = function(page){
        //构建分页控件前，先清理现有控件   
        settings.pageWidget.empty();
        settings.pageWidget.append("<ul>");
		
        /* --------------- 1.开始：构建“首页”和“上一页”控件 ------------- */
        var currPageNum = Number(page.getCurrPageNum());
        var totalPageNum = Number(page.getTotalPageNum());
        
        if(currPageNum==1){
            //如果你希望当前页是第一页的时候，也允许“首页”和“上一页”控件出现，则可以在这里进行补充
        }else{
            settings.pageWidget.find("ul").append("<li><a id='' pageNum='1' href='javascript:void(0);' title='首页' class='first'>首页</a>&nbsp;</li>");
            settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+(currPageNum-1)+"' href='javascript:void(0);' title='上一页' class='prev'>&lt;上一页</a>&nbsp;</li>");
        }
           
        /* --------------- 2.开始：构建分页数字控件 -------------- */
        if(totalPageNum<10){
            for(var i=1;i<=totalPageNum;i++){
                if(i==currPageNum){
                    settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class='current'>"+i+"</a>&nbsp;</li>");
                }else{
                    settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class='javascript:trunTargetPage("+i+");'>"+i+"</a>&nbsp;</li>");  
                }
            }
        //如果总页数>=10     
        }else{
            //如果当前页小于5，则显示1-9项，且记忆当前项 
            if(currPageNum<5){
                for(var i =1;i<10;i++){
                    if(i==currPageNum){
                        settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class='current'>"+i+"</a>&nbsp;</li>");
                    }else{
                        settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class=''>"+i+"</a>&nbsp;</li>");
                    }
                }
            //如果当前页>=5，且总页数与当前页的差<4
            }else if(totalPageNum-currPageNum<4){
                for(var i=totalPageNum-8;i<=totalPageNum;i++){
                    if(i==currPageNum){
                        settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class='current'>"+i+"</a>&nbsp;</li>");
                    }else{
                        settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class=''>"+i+"</a>&nbsp;</li>");
                    }
                }
            //如果当前页>=5，则显示围绕当前页的9项，且记忆当前项
            }else{
               for(var i=currPageNum-4;i<currPageNum+5;i++){
                    if(i==currPageNum){
                        settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void(0);' title='' class='current'>"+i+"</a>&nbsp;</li>");
                    }else{
                        settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+i+"' href='javascript:void("+i+");' title='' class=''>"+i+"</a>&nbsp;</li>");
                    }
                }
            }
        }
           
        /* --------------- 3.开始：构建“下一页”和“尾页”控件 ------------- */
        if(totalPageNum==currPageNum){
            //如果你希望当前页是最后一页的时候，也允许“尾页”和“下一页”控件出现，则可以在这里进行补充
        }else{
            settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+(currPageNum+1)+"' href='javascript:void(0);' title='下一页' class='next'>下一页&gt;</a>&nbsp;</li>");
            settings.pageWidget.find("ul").append("<li><a id='' pageNum='"+totalPageNum+"' href='javascript:void(0);' title='末页' class='last'>末页</a>&nbsp;</li>");
        }
        /* --------------- 4.开始：构建描述信息（如“共？页，？条记录”） ----------------- */
        settings.pageWidget.append("<div class='total'>共&nbsp;<span>"+page.getTotalPageNum()+"</span>页/<span>"+page.getTotalRowSize()+"</span>条&nbsp;记录</div>");
        
        //还要为控件绑定点击事件
        bindEvent();
    }
    
})(jQuery);

/*  
 * Page类
 */
function Page(currPageNum,totalRowSize,pageRowSize){
    this.currPageNum = currPageNum;
    this.totalRowSize = totalRowSize;
    this.pageRowSize = pageRowSize;
}
Page.prototype.getCurrPageNum = function(){
    return this.currPageNum;
};
Page.prototype.setCurrPageNum = function(currPageNum){
    this.currPageNum = currPageNum;
};
Page.prototype.getTotalPageNum = function(){
    return (this.totalRowSize%this.pageRowSize==0)?(this.totalRowSize/this.pageRowSize):(Math.floor(this.totalRowSize/this.pageRowSize)+1);
};
Page.prototype.getTotalRowSize = function(){
    return this.totalRowSize;
};
Page.prototype.setTotalRowSize = function(totalRowSize){
    this.totalRowSize = totalRowSize;
};
Page.prototype.getPageRowSize = function(){
    return this.pageRowSize;
};
Page.prototype.setPageRowSize = function(pageRowSize){
    this.pageRowSize = pageRowSize;
};
Page.prototype.getFirstResult = function(){
    if(this.getCurrPageNum()<=0) return 0;
    return this.getPageRowSize() * (this.getCurrPageNum() - 1);
};
Page.prototype.getMaxResult = function(){
    return this.getFirstResult() + this.getPageRowSize();
};