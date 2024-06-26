package org.atheNA.day10.oop.member;

public class ManageMember {
//	private Member[] members = new Member[5];
//	Member member = new Member();

	private Member[] members;
	private int index;


	public ManageMember() {
		members = new Member[5];
		index = 0;
	}

	public void registerMember(Member member) {
//		this.member = member
		if (index < members.length - 1) {
			members[index] = member;
			index++;
		}
	}

	public Member[] allMember() {
		return members;

	}
	public Member searchOneById(String memberId) {
		for(Member member : members) {
			if(member != null && memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}
}
