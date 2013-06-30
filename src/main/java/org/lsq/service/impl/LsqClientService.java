package org.lsq.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.lsq.vo.LsqClientSocket;


public class LsqClientService extends Thread {
	private ServerSocket serverSocket =null;
	public void run() {
		try {
			while(true){
				Socket socket=serverSocket.accept();
				System.out.println("client socket connection....");
				LsqClientSocket.setClientSocket(socket);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public LsqClientService() {
		try {
			serverSocket = new ServerSocket(9092);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
