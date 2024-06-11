package org.atheNA.day11.oop.member;

public class ManageMember {

	Member[] members;
	int index;

	public ManageMember() {
		members = new Member[5];
		index = 0;
	}

	// 회원정보 저장
	public void insertMember(Member member) {
		if (index < members.length) {
			members[index] = member;
			index++;
		}
	}

	// 회원 전체정보 출력
	public Member[] getAllMembers() {

		return members;
	}

	public Member searchOneEmail(String email) {
		for (Member member : members) {
			if (member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMembers() {
		members = new Member[5];
		index = 0;
//		for(Member member : members) {
//			member = null;
	}

	public void updateMember(Member member) {
		int i = 0;
		for (Member mOrigin : members) {
			if (mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if (memberEmail.equals(member.getMemberEmail())) {
//					mOrigin.setMemberAddress(member.getMemberAddress());
//					mOrigin.setMemberName(member.getMemberName());
//					mOrigin.setMemberPhone(member.getMemberPhone());
				members[i] = member;
				}
			}
			i++;
		}

	}
	
}