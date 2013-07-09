package org.lsq.vo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LsqClientSocket {
	private static Socket clientSocket=null;
	private static InputStream in = null;
	private static OutputStream out = null;
	
	
	public static Socket getClientSocket() {
		return clientSocket;
	}
	public static void setClientSocket(Socket clientSocket) {
		LsqClientSocket.clientSocket = clientSocket;
	}
	public static InputStream getIn() {
		return in;
	}
	public static void setIn(InputStream in) {
		LsqClientSocket.in = in;
	}
	public static OutputStream getOut() {
		return out;
	}
	public static void setOut(OutputStream out) {
		LsqClientSocket.out = out;
	}
	
}

