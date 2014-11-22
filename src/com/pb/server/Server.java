package com.pb.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.pb.util.DEFINE;
import com.pb.util.DemoData;
import com.pb.util.Message;
import com.pb.util.Tools;

public class Server {
	
	public static void main(String[] args) {
		System.out.println(Message.APP_NAME+"服务器启动..\n.");
		//初始化服务器数据
		DemoData.init();
		ServerSocket serversocket;
			try {
				serversocket=new ServerSocket(Integer.parseInt(Tools.getValue(DEFINE.SYS_PORT)));
				while(true){
					Socket socket=serversocket.accept();
					Thread serverThread=new ServerThread(socket);
					serverThread.start();
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
