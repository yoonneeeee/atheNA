package org.atheNA.day10.oop.interfaceex;

public class Exam_Interface {

	public static void main(String[] args) {
		
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
	}

}
