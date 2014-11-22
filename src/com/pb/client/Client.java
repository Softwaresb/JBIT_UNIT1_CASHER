package com.pb.client;

import com.pb.entity.UserExt;
import com.pb.util.InputTools;
import com.pb.util.Message;

public class Client {

	public static void main(String[] args) {
		System.out.println(Message.OUTPUT_START+Message.APP_WELCOM+Message.APP_NAME+Message.OUTPUT_START);
		System.out.println(Message.SELECT_LOGIN+"\n"+Message.OUTPUT_START+"***********请选择数字1/2***********"+Message.OUTPUT_START);
		runClient();
	}
	
	public static void runClient(){
		int int_select=0;
		
		int_select=InputTools.getInt(null, Message.ERR_SELECT);
		if(int_select==2){
			return;
		}
		
		if(int_select!=1){
			System.out.println(Message.ERR_SELECT);
			runClient();
		}
		UserExt.login();//用户登录
		System.out.println(Message.OUTPUT_START+Message.OUTPUT_START+Message.OUTPUT_START);
	}
}
