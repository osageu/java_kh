package com.kh.chap01_list.part02_mvc.model.sort;
import com.kh.chap01_list.part02_mvc.model.vo.Music;
import java.util.*;

public class TitleDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o2.getTitle().compareTo(o1.getTitle());
	}

}
