package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author user1
 *
 */
public class B_ArrayCopy {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	public void method1() {
		// 얕은 복사 : 주소값만 복사(heap box는 그대로)
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("===== 원본 배열 출력 =====");
		for (int i = 0 ; i < origin.length ; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		int[] copy = origin;
		
		System.out.println("===== 복사본 배열 출력 =====");
		for(int i = 0 ; i < copy.length ; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println();
		copy[2] = 99;
		System.out.println("***************** 복사본 배열값 변경 후 *****************");
		System.out.println();
		System.out.println("===== 원본 배열 출력 =====");
		System.out.println(Arrays.toString(origin));
		System.out.println("===== 복사본 배열 출력 =====");
		System.out.println(Arrays.toString(copy));
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		
	}
	
	public void method2() {
		// 깊은 복사 1
		// for문 이용 : 새로운 배열 생성 후 반복문을 이용해서 각 index값을 집어넣는 방법
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
		for (int i = 0 ; i < copy.length ; i++) {
			copy[i] = origin[i];
		}
		System.out.println(Arrays.toString(origin));
		System.out.println(origin.hashCode());
		System.out.println(Arrays.toString(copy));
		System.out.println(copy.hashCode());
		
		copy[2] = 99;
		System.out.println("===== 복사본 배열 수정 후 =====");
		System.out.println("원본 : " + Arrays.toString(origin));
		System.out.println("원본 주소값 : " + origin);
		System.out.println("복사본 : " + Arrays.toString(copy));
		System.out.println("복사본 주소값 : " + copy);
	}
	
	public void method3() {
		// 깊은 복사 2
		// System class에서의 arraycopy() method를 활용
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];
		System.arraycopy(origin, 0, copy, 3, origin.length);
		System.out.println(Arrays.toString(copy));
		System.out.println(origin);
		System.out.println(copy);
		// 주소값 다름 --> 다른 곳을 참조하고 있음 --> 배열 수정시 서로 영향을 받지 않음을 유추
	}
	
	public void method4() {
		// 깊은 복사 3
		// Arrays class에서의 copyOf() method를 활용
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = Arrays.copyOf(origin, 10);
		System.out.println(Arrays.toString(copy));
	}
	
	public void method5() {
		// 깊은 복사 4
		// clone() method를 활용
		int [] origin = {1, 2, 3, 4, 5};
		int [] copy = origin.clone(); // 원본 배열 통째로 복사해 새로운 배열 할당
		
		System.out.println("origin의 주소값 : " + origin);
		System.out.println("heap : " + Arrays.toString(origin));
		System.out.println("copy의 주소값 : " + copy);
		System.out.println("heap : " + Arrays.toString(copy));
	}
	
}
