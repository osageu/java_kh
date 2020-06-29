package com.kh.chap01_list.part02_mvc.controller;
import com.kh.chap01_list.part02_mvc.model.vo.*;
import java.util.ArrayList;


// controller : 사용자가 요청한 기능을 처리하는 역할
public class MusicController {
	
	// field
	private ArrayList<Music> list = new ArrayList<>();
	
	// constructor
	public MusicController() {
		
	}
	// method
	// 1. 곡 추가
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	// 2. 곡 조회
	public ArrayList<Music> showAllMusic() {
		return list;
	}
	
	// 3. 곡 검색
	public ArrayList<Music> searchMusic(String search) {
		ArrayList<Music> copy = new ArrayList<>();
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getTitle().contains(search) || list.get(i).getArtist().contains(search)) {
				 copy.add(list.get(i));
			}
		}
		return copy;
	}
	
	// 4. 곡 삭제
	public int deleteMusic(String delete) {
		int result = 0;
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getTitle().equals(delete)) {
				list.remove(i);
				result = 1;
			} else {
				result = 2;
			}
		}
		return result;
	}
	
	// 5. 곡 수정
	public int editMusic(String edit, String title, String artist) {
		int result = 0;
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getTitle().equals(edit)) {
				list.set(i, new Music(title, artist));
				result = 1;
			} else {
				result = 2;
			}
		}
		return result;
	}
	
	// 6. 곡 정렬
	public void sortMusic() {
		
	}
	
}
