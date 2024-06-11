package org.atheNA.day16.socket.stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			socket = serverSocket.accept(); 			// 연결요청을 기다리는 중
			System.out.println("클라이언트와 연결되었습니다.");
			is = socket.getInputStream();
			int result = is.read();
			// 클라이언트에서 write가 있으면, server에 read가 있어야 함
			// 보내는 갯수만큼 읽는 갯수도 있어야 함
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
//			socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
