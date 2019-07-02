package com.sample.di.demo4;
// 인터페이스를 재정의하는 클래스를 만든다.
public class KatalkMessenger implements Messenger {

	// 재정의 1 
	public String receiveMessage() {
		System.out.println("카톡으로 메세지 수신하기");
		
		return "깨톡: 반갑습니다.";
	}
	
	// 재정의 2
	public void sendMessage(String to, String text) {
		System.out.println("카톡으로 메세지 보내기");
		System.out.println("받는사람 : " +to);
		System.out.println("메세지 내용 : " +text);
	}
}
