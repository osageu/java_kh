package com.kh.chap01_list.part02_mvc.controller;
import com.kh.chap01_list.part02_mvc.model.vo.*;
import com.kh.chap01_list.part02_mvc.model.sort.*;

import java.util.*;


// controller : 사용자가 요청한 기능을 처리하는 역할
public class MusicController {
	
	// field
	private ArrayList<Music> list = new ArrayList<>();
	
	// constructor
	public MusicController() {
		
	}
	// method
	
	/**
	 * 1. 곡 추가
	 * @param title
	 * @param artist
	 */
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	/**
	 *  2. 곡 조회
	 * @return
	 */
	public ArrayList<Music> showAllMusic() {
		return list;
	}
	
	/**
	 *  3. 곡 검색
	 * @param select
	 * @param search
	 * @return
	 */
	public ArrayList<Music> searchMusic(int select, String search) {
		ArrayList<Music> copy = new ArrayList<>();
		
		switch(select) { // switch open
		case 1 : for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getTitle().contains(search)) {
				copy.add(list.get(i));
			}
		} break;

		case 2 : for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getArtist().contains(search)) {
				copy.add(list.get(i));
			}
		} break;

		case 3 : for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getTitle().contains(search) || list.get(i).getArtist().contains(search)) {
				copy.add(list.get(i));
			}
		} break;
		} // swtich close
		return copy;
	}
	
	/**
	 *  4. 곡 삭제
	 * @param delete
	 * @return
	 */
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
	
	/**
	 *  5. 곡 수정
	 * @param edit
	 * @param title
	 * @param artist
	 * @return
	 */
	public int editMusic(String edit, String title, String artist) {
		int result = 0;
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getTitle().equals(edit)) {
				list.set(i, new Music(title, artist));
				// list.get(i).setArtist(artist); 
				// list.get(i).setTitle(title); 
				result = 1;
			} 
		}
		return result;
	}
	
	/**
	 *  6. 곡 정렬
	 */
	public ArrayList<Music> sortMusic(int select) {
		
		 ArrayList<Music> copy = new ArrayList<>();
		 copy.addAll(list);
		
		switch(select) {
		case 1 : Collections.sort(copy); break; // 가수 오름
		case 2 : Collections.sort(copy, new ArtistDesc()); break; // 가수 내림
		case 3 : Collections.sort(copy, new TitleAsc()); break; // 곡 오름
		case 4 : Collections.sort(copy, new TitleDesc()); break; // 곡 내림
		}
		
		return copy;
		
	}
	
}
















