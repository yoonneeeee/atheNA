package org.atheNA.day10.oop.member;

import java.util.Scanner;

public class MemberRun {
	public static void main(String[] args) {
//// 회원관리 프로그램
//		1. 회원가입
//		2. 회원검색
//		3. 회원정보보기

//		4. 회원정보 수정
//		5. 회원정보 삭제
//// 1~3번까지
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		end: 
		while (true) {
			int menu = view.printMenu();
			switch (menu) {
			case 1:
				//1. 회원정보 입력
				Member member = view.inputMember();
				// 배열에 저장하기
				mng.registerMember(member);
				break;
			case 2:
				String memberId = view.inputMemberId();		// 아이디 입력
				member = mng.searchOneById(memberId);		// 배열에서 찾기
				if(member!=null)							// 찾은 거 출력하기
					view.displayMember(member);
				break;
				
			case 3:
//				member
				//membermng.allmember();
				Member[] members = mng.allMember();
				view.displayMemberList(members);
				break;
			case 4:
//			System.out.println("프로그램이 종료하겠습니다.");
				view.printMessage("프로그램을 종료하겠습니다.");
				break end;
			default:
//			System.out.println("잘못입력하셨습니다. ");
				view.printMessage("잘못입력하셨습니다. ");
			}
		}
	}
}
