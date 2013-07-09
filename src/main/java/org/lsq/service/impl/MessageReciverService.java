package org.lsq.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.lsq.dao.IInsertMessageDAO;
import org.lsq.util.DateFormat;

/**
 * 类名：MessageReciverService 
 * 功能：开启独立县城,建立ServerSocket对象，监听带有GSM模块的PC发来的信息
 * 		并插入数据库。
 * 
 * */
public class MessageReciverService extends Thread {
	private IInsertMessageDAO insertMessageDAO;
	ServerSocket serverSocket = null;
	InputStream in = null;
	OutputStream out = null;

	public void run() {
		try {
			while(true){
			byte[] tempBuf=new byte[2048];
			Socket socket=serverSocket.accept();
			in=socket.getInputStream();
			out=socket.getOutputStream();
			int recvLenght=in.read(tempBuf);
			byte[] dataBuf=new byte[recvLenght];
			for(int i=0;i<recvLenght;i++){
				dataBuf[i]=tempBuf[i];
			}
			String msg=new String(dataBuf,"GB2312");
			System.out.println(msg);
			String phoneNum=msg.substring(0,11);
			String msgText=msg.substring(11);
			insertMessageDAO.insertMessage(msgText, "待定", phoneNum, DateFormat.dateToString(), "");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MessageReciverService() {
		try {
			serverSocket = new ServerSocket(9091);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setInsertMessageDAO(IInsertMessageDAO insertMessageDAO) {
		this.insertMessageDAO = insertMessageDAO;
	}

}
