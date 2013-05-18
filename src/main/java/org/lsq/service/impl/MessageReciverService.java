package org.lsq.service.impl;

import java.io.IOException;
import java.io.InputStream;

import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.UnsupportedCommOperationException;

import org.lsq.dao.IInsertMessageDAO;
import org.lsq.util.DateFormat;

public class MessageReciverService extends Thread{
	private IInsertMessageDAO insertMessageDAO;
	private CommPortIdentifier portId = null;
	private SerialPort serialPort = null;
	private InputStream in = null;
//	private OutputStream out = null;
	int newData;
	
	public void run() {
		System.out.println("串口监听线程开始...");
		while (newData != -1) {
			try {
				byte[] readBuffer = new byte[64];
				int numBytes = in.read(readBuffer);
				byte[] dataBuffer=new byte[numBytes];
				System.out.println("recv byte nums=" + numBytes);
				for (int i = 0; i < numBytes; i++) {
					dataBuffer[i]=readBuffer[i];
				}
				String msg = new String(dataBuffer);
				insertMessageDAO.insertMessage(msg, "读取串口", "读取串口", DateFormat.dateToString(), "");
			} catch (IOException ex) {
			}
		}
	}

	public MessageReciverService() {
		try {
			portId = CommPortIdentifier.getPortIdentifier("COM1");
			serialPort = (SerialPort) portId.open("Serial_Communication", 2000);
			in = serialPort.getInputStream();
//			out = serialPort.getOutputStream();
			serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
		} catch (NoSuchPortException e) {
			e.printStackTrace();
		} catch (PortInUseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnsupportedCommOperationException e) {
			e.printStackTrace();
		}
	}

	public void setInsertMessageDAO(IInsertMessageDAO insertMessageDAO) {
		this.insertMessageDAO = insertMessageDAO;
	}
	

}
