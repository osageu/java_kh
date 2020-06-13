package com.hw2.controller;

import java.util.*;

public class NonStaticSample {
	Random ran = new Random();
	// field
	
	// constructor
	
	// method
	public int[] intArrayAllocation (int length) {
		
		int[] iArr = new int[length];
		for (int i = 0 ; i < length ; i++) {
			iArr[i] = ran.nextInt(100) + 1;
		}
		System.out.print("크기가  " + length + "인 배열의 랜덤값 : ");
		return iArr;
		
	}
	
	public void display (int[] arr) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
		
	}
	
	public void swap (int[] arr, int idx1, int idx2) {
		
		int temp = 0;
		temp = arr[idx2];
		arr[idx2] = arr[idx1];
		arr[idx1] = temp;
		
	}
	
	public void sortDescending (int[] arr) {
		
		int temp = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			
			for (int j = 0 ; j < arr.length ; j++) {
				
				if (Math.min(arr[i], arr[j]) == arr[i]) {
					continue;
				} else if (Math.min(arr[i], arr[j]) == arr[j]) {
					swap(arr,i,j);
				}
				
			}
			
		}
		System.out.print("내림차순 출력 : ");
		display(arr);
		
	}
	
	public void sortAscending (int[] arr) {
		Arrays.sort(arr);
		System.out.print("오름차순 출력 : ");
		display(arr);
	}

	public int countChar (String str, char c) {
        
		int count = 0;
		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;

	}
	
	public int totalValue (int num1, int num2) {
		
		int sum = 0;
		for (int i = Math.min(num1, num2) + 1 ; i < Math.max(num1,num2) ; i++) {
			sum += i;
		}
		return sum;
		
	}

	public char pCharAt (String str, int index) {
		
		return str.charAt(index);
		
	}
	
	public String pConcat (String str1, String str2) {
		
		return str1 + str2;
		
	}
	
	
	
}
