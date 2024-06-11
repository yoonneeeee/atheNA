package org.atheNA.day16.thirdtest.q4;

public class User {
private String userName;		//캡슐화 잘 되어있음.
private int userAge;
private String userAddr;
public User() {}
public User(String userName, int userAge, String userAddr) {
	this.userName = userName;
	this.userAge = userAge;
	this.userAddr = userAddr;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserAge() {
	return userAge;
}
public void setUserAge(int userAge) {
	this.userAge = userAge;
}
public String getUserAddr() {
	return userAddr;
}
public void setUserAddr(String userAddr) {
	this.userAddr = userAddr;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "이름 : " +userName+"\n"+"나이 : "+userAge+"\n"+"주소 : "+userAddr;
}


}
