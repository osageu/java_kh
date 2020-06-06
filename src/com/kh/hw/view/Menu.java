package com.kh.hw.view;
import com.kh.hw.controller.*;
import com.kh.hw.run.*;
import java.util.Scanner;

/**
 * @author osageu
 *
 */
public class Menu {
	Scanner sc = new Scanner(System.in);
	public void displayMenu() {
		Function osageu = new Function();
		while(1==1) {
			
			System.out.println("======= 메인 메뉴 =======");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아 맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int input = sc.nextInt();
			System.out.println();
			switch(input) {
			case 1 : osageu.calculator(); break;
			case 2 : osageu.totalCalculator(); break;
			case 3 : osageu.printProfile(); break;
			case 4 : osageu.printScore(); break;
			case 5 : osageu.printStarNumber(); break;
			case 6 : osageu.sumRandom(); break;
			case 7 : osageu.exceptGugu(); break;
			case 8 : osageu.diceGame(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다.다시 입력해주세요."); continue;
			}
//			if(input < 1 || input > 9) {
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//			} else if(input == 9) {
//				System.out.print("프로그램을 종료합니다."); ㅎㅎㅎ;
//				break;
//			}
			
		}
		
	}
}
