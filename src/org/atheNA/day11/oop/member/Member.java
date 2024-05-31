package org.atheNA.day11.oop.member;

public class Member {
	private String memberName;
	private String memberEmail;
	private String memberPhone;;
	private String memberAddress;

	public Member() {}
	
	public Member(String memberName, String memberEmail, String memberPhone, String memberAddress) {
		super();
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
	}
// 게터 세터 만들기 : 우클릭-소스-generate getter, setter
// 우클릭 - 소스 - generate constructor using field
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}


	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", memberEmail=" + memberEmail + ", memberPhone=" + memberPhone
				+ ", memberAddress=" + memberAddress + "]";
	}
}
