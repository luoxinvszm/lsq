package org.lsq.service.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import org.lsq.service.IImageBuilderService;
import org.lsq.vo.LsqClientSocket;

public class ImageBuilderService implements IImageBuilderService{
	private OutputStream out;
	public void createImage(String msg){
		try {
			out=LsqClientSocket.getOut();
			if(out!=null){
			System.out.println(msg);
			out.write(msg.getBytes("utf-8"));
			out.flush();
			System.out.println("flush....");
			}else{
				System.out.println("socket is null...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
