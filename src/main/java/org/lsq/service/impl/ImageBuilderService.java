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
			System.out.println(msg);
			out.write(msg.getBytes());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
