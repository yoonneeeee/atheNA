package org.atheNA.day13.collection.music.controller;

import java.util.List;

import org.atheNA.day13.collection.music.model.ManageMusic;
import org.atheNA.day13.collection.music.model.Music;
import org.atheNA.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();

		while (true) {
			int choice = view.printMenu();
			Music music = null;
			List<Music> mList = null;
			String name = "";
			int index = 0;
			finish: switch (choice) {
			case 1:
				music = view.inputMusic();
				mng.registerMusic(music);
				break;
			// 첫위치에 추가
			case 2:
				music = view.inputMusic();
				mng.registerMucisAtFirst(music);
				break;

			// 전체 곡 추가
			case 3:
				mList = mng.getAllMusics();
				if (mList.size() > 0) {
					view.printMusicInfo(mList);
				} else {
					view.printMsg("정보가 존재하지 않습니다. ");
				}
				break;
			// 특정 곡 검색
			// mList에서 찾아서
			// View를 이용하여 출력
			case 4:
				name = view.inputTitle("검색");
				music = mng.searchMusicByTitle(name);
				if (music != null) {
					view.printMusicInfo(music);
				} else {
					view.printMsg("검색 결과가 없습니다.");
				}

				break;
			case 5:
				name = view.inputTitle("수정");
				// 수정 할 위치
				index = mng.searchIndexByName(name);
				// 수정할 정보
				music = mng.searchMusicByTitle(name);
				music = view.modifyMusic(music);
				mng.modifyMusic(index, music);

				break;
			case 6:
				name = view.inputTitle("삭제");
				music = mng.searchMusicByTitle(name);
				if (name != "" && name != null) {
					index = mng.searchIndexByName(name);
					// 해당 값 삭제
					mng.deleteMusic(index);
				}
				mng.deleteMusic(index);
				break;
			case 7:
				mng.sortByTitleASC();
				break;
			case 8:
				mng.sortByTitleDESC();
				break;
			case 9:
				mng.sortBySingerASC();
				break;
			case 10:
				mng.sortBySingerDESC();
				break;
			case 0:
				view.printMsg("프로그램을 종료합니다.");
				break;
			default:
				view.printMsg("메뉴를 잘못선택하셨습니다.");
				break finish;
			}
		}
	}
}
