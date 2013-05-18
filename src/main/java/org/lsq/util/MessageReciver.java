package org.lsq.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.UnsupportedCommOperationException;

import org.springframework.jdbc.core.JdbcTemplate;

public class MessageReciver extends Thread {
	private JdbcTemplate jdbcTemplate;
	private CommPortIdentifier portId = null;
	private SerialPort serialPort = null;
	private InputStream in = null;
	private OutputStream out = null;
	int newData;

	public void run() {
		System.out.println("new Thread...");
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
				String sql = "insert into message(id,msgTypeId,msgConctent,publisherName,publishTime,msgStatus) "
						+ "value('"
						+ IdBuilder.getNewId()
						+ "','"
						+ msg
						+ ",'串口读取'," + DateFormat.dateToString() + "',0)";

				int i=jdbcTemplate.update(sql);
				System.out.println("result="+i);
			} catch (IOException ex) {
			}
		}
	}

	public MessageReciver() {
		try {
			portId = CommPortIdentifier.getPortIdentifier("COM1");
			serialPort = (SerialPort) portId.open("Serial_Communication", 2000);
			in = serialPort.getInputStream();
			out = serialPort.getOutputStream();
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

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
