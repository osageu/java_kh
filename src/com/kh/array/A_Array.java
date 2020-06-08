package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author user1
 *
 */
public class A_Array {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	// 배열 : "같은 자료형의 값"들을 하나의 공간에 담을 수 있는 개념
	// 				저장된 값마다 index가 지정됨 (index는 0부터 시작됨)
	//[표현법]
	// 자료형 배열명 [] ;
	// 자료형 [] 배열명 ;
	public void method1() {
		// 배열을 왜 쓰는지
		// 대량의 데이터를 보관하고자할 때, 각각의 변수를 만들어서 관리해야됨...
		
		// 1. 변수 선언
		int arr1 [];
//		int [] arr2;
		
		// 2. 배열 할당 (이 배열에 몇 개의 값들을 보관할건지 크기지정하는 과정, 그 갯수만큼 방이 만들어짐)
		//		배열명 = new 자료형[배열크기];
		arr1 = new int[5];
		
		// 3. 선언 및 할당
		int arr[] = new int[5];
		
		// 4. 값 초기화(대입)
		// 		배열명[index] = 값;
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
//		arr[3] = 3;
//		arr[4] = 4;
		
		// 배열 장점 : 반복문을 사용할 수 있다는 장점 
//		for (int i = 0 ; i <= 4 ; i++) // 0에서 부터 4까지 1씩 증가하는 동안 반복수행
		
		// ver.1 배열 전부 호출
		for (int i = 0 ; i <= arr.length-1 ; i++) { // int i = 0 ; i < arr.length ; i++
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		
		// ver.2 배열 전부 호출
		for (int i = 0 ; i <=arr.length-1 ; i++) { // int i = 0 ; i < arr.length ; i++
			System.out.print(arr[i] + " ");
		}
	}	
	
	public void method2() {
		
		int i = 10;
		int iArr [] = new int[5]; // 5칸의 index로 구성하겠다.
		/*
		 * 값을 바로 담을 수 있는 변수 : 일반변수
		 * 주소값을 담고 있는 변수 : 참조변수(reference variable)
		 * 
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double ==> 8가지.. 
		 * 					--> 진짜 값을 바로 담는 변수 (일반 변수)
		 * 그 외 자료형 : String, int[], char[], double[], Scanner ...etc 
		 * 					--> 주소값을 담는 변수 (reference variable)
		 * 					ex) iArr의 주소값 : @15db9742
		 */
		System.out.println("i : " + i); // 10
		System.out.println("iArr : " + iArr); // [I@15db9742 --> @뒤의 것이 주소값, I는 int형이라는 뜻
		double dArr[] = new double[10];
		System.out.println("dArr : " + dArr); // [D@6d06d69c --> @뒤의 것이 주소값, D는 double형이라는 뜻
		// heap안에서 절대 중복된 주소값은 생성되지 않는다. 
		
		int j[] = {1};
		int h[] = {1};
		System.out.println(j); // --> [I@7852e922
		System.out.println(h); // --> [I@4e25154f
		// 내용이 같아도 주소값은 다름
	}
	
	public void method3() {
		
		int iArr[] = new int[3]; // 0~2
		double dArr[] = new double[5]; // 0~4
		// 배열 선언하고 크기지정(할당)까지 한 상태
		
		for (int i = 0 ; i <iArr.length ; i++) { // int i = 0 ; i < arr.length ; i++
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr));
		System.out.println();
		
		for (int i = 0 ; i <dArr.length ; i++) { // int i = 0 ; i < arr.length ; i++
			System.out.print(dArr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(dArr));
		
		// JVM(java virtual machine)을 통해 코드(.class)가 실행됨.
		// 그래서 어떤 OS 든 간에 실행이 가능해짐.
		// 우리가 설정을 하지 않으면 JVM이 초기설정을 해줌 ==> 여기선 [0, 0, 0]
		// 만약 강제로 0을 넣는 것과 초기값 0은 같나?
	}
	
	public void method4() {
		int iArr[] = new int[5];
		/*
		 * iArr[0] = 1;
		 * iArr[1] = 2;
		 * iArr[2] = 3;
		 * iArr[3] = 4;
		 * iArr[4] = 5;
		 */
		
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i]=i+1;
		}
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr));
		System.out.println(iArr.hashCode()); // 주소값을 10진수로 바꿔줌.
	}
	
	public void method5() {
		// 사용자에게 입력받은 수 만큼 배열의 크기 지정하기!
		System.out.print("배열의 크기 : "); // 0과 음수는 안 됨
		int size = sc.nextInt()	;
		
		double dArr[] = new double[size];
//		for (int i = 0 ; i < arr.length ; i++) {
//			arr[i] = i+1;
//		}
		System.out.println(dArr);
		System.out.println(dArr.hashCode());
		System.out.println(dArr.length);
		System.out.println(dArr[0]);
		System.out.println(Arrays.toString(dArr));
	}
	
	public void method6() {
		int iArr [] = new int[5];
		
//		iArr[0] = 2;
//		iArr[1] = 4;
//		iArr[2] = 6;
//		iArr[3] = 8;
//		iArr[4] = 10;
		
		int num = 2;
		for (int i = 0 ; i < iArr.length ; i++) { // 초기 num을 2로 주고 반복할 때마다 2씩 증가시키게..
			iArr[i] = num;
			num +=2;
		}
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(iArr[i] + "  ");
		}
		System.out.println();
		System.out.println("iArr의 해시코드 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println(Arrays.toString(iArr));
		
//		iArr[5]=12;
		/*
		 * 배열의 가장 큰 단점
		 * 1. 한 번 지정한 배열의 크기는 변경이 불가해서 배열의 크기를 변경하고자 한다면 다시 만들어야 함
		 * 
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
		 * 연결이 끊어진 기존 배열은 heap영역에 둥둥떠다님
		 * ==> 일정 시간이 지나면 "garbage collector"가 지워줌(자동 메모리 관리)
		 * 
		 */
		iArr = new int[7];
		System.out.println("\n=====  변경 후 iArr  =====\n");
		System.out.println("iArr의 해시코드 : " + iArr.hashCode()); // ==> 주소값이 바뀜
		System.out.println("iArr길이 : " + iArr.length); // ==> 길이가 바뀜
		//지금 연결되어있는 고리를 끊고자 한다면 어떻게?
		iArr = null; // ==> 주소값이 사라짐
		System.out.println("\n=====  삭제 후 iArr  =====\n");
		System.out.println(iArr);
		System.out.println(iArr.length);
		System.out.println(iArr.hashCode());
		
		// null.xxx() => NullPointerException
		
	}
	
	public void method7() {
		// 배열 선언 및 할당 및 초기화를 동시에
		int[] iArr1 = {1, 2, 3, 4}; // 값이 갯수만큼 자동으로 크기가 할당됨(내부적으로 수행됨)
		int[] iArr2 = new int[] {1, 2, 3, 4}; // 값이 갯수만큼 자동으로 크기가 할당됨(내부적으로 수행됨)
		
		System.out.println("arr1의 길이 : " + iArr1.length);
		System.out.println("arr1의 길이 : " + iArr2.length);
		
		System.out.println(iArr1 == iArr2);
		System.out.println(iArr1.hashCode()); // 685325104 서로 다른 주소값
		System.out.println(iArr2.hashCode()); // 460141958 서로 다른 주소값
	}
	
	public void method8() {
		
		String[] sArr = new String[5];
		for(int i = 0 ; i < sArr.length ; i++) {
			System.out.print("과일 : ");
			sArr[i] = sc.nextLine();
		}
		for(int i = 0 ; i < sArr.length ; i++) {
			System.out.print(sArr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(sArr));
	}
	
	public void method9() {
		
		int[] iArr = new int[10];
		for (int i = 0 ; i < iArr.length ; i++) {
//			int nansu = ran.nextInt(100)+1;
			iArr[i] = (int)(Math.random()*100 +1);
		}
		for(int i = 0 ; i < iArr.length ; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
	}
	
	public void method10() {
		
		double[] dArr = new double[3];
		double sum = 0.0;
		for (int i = 0 ; i < dArr.length ; i++) {
			System.out.print("키 : ");
			dArr[i] = sc.nextDouble();
			sum += dArr[i];
		}
		System.out.println(Arrays.toString(dArr));
		System.out.printf("키의 합계 : %.1fcm\n", sum);
		System.out.printf("키의 평균 : %.1fcm", sum/dArr.length);
	}
	
	public void method11() {
		
		// 1. 사용자에게 입력받은 수만큼 배열의 크기를 지정 후 
		// 2. 0~마지막 index까지 랜덤값 담은 후
		// 3. 0~마지막 index까지의 값 출력 하면서 짝수들의 총합 계산
		// 4. 총합 출력
		System.out.print("배열의 크기 : ");
		int input = sc.nextInt();
		int[] iArr = new int[input];
		
		int sum = 0;
		for (int i = 0 ; i < iArr.length ; i++) {
			int nansu = ran.nextInt(100) + 1;
			iArr[i] = nansu;
			if (iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("짝수의 총합 : " + sum);
		
//		String aa = null;
//		for (int i = 1 ; i <= 5 ; i++) {
//			aa += "*";
//		}
//		System.out.println(aa);
		
	}
	
	public void method12() {
		
		// 사용자에게 문자열 입력받은 후 각 문자들을 char배열에 담기
		
		System.out.print("문자열 : ");
		String string = sc.nextLine();
		char[] sArr = new char[string.length()];
		
		for (int i = 0 ; i < string.length() ; i++) {
			sArr[i] = string.charAt(i);
		}
		System.out.println(Arrays.toString(sArr));
		
//		char[] cArr = new char[5];
//		System.out.println(Arrays.toString(cArr));
	}
	
	
	
}

