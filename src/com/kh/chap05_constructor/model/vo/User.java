package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 아이디, 비밀번호, 이름, 나이, 성별
	
	// field
	private String userId;         // 회원 아이디
	private String userPwd;      // 회원 비밀번호
	private String userName;    // 회원 이름
	private int userAge;            // 회원 나이
	private char userGender;    // 회원 성별
	
	// constructor
	// [접근제한자] [클래스명( )] {   }
	/*
	 *  public User (parameter, pratemeter, ... ){
	 *  
	 *  }
	 *  # 생성자를 작성하는 목적
	 *  1. 객체를 생성해주기 위해
	 *  2. parameter로 전달된 값들을 해당 필드에 바로 초기화하기 위해
	 *  
	 *  # 생성자 작성 시 주의할 점
	 *  1. 반환형이 없어야 함
	 *  2. 반드시 생성자명은 클래스명과 일치해야 함
	 *  3. parameterized constructor를 명시적으로 기술한 순간 JVM이 자동으로 기본 생성자를 만들지 않음
	 *  
	 */
	 public User() { // 기본 생성자
		// 기본 생성자 (매개변수가 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 사용 (공간만 할당해줌)
		// 기본 생성자를 작성하지 않아도 JVM에서 만들어 줌
	 }
	
	// parameterized constructor (3개)
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// parameterized constructor (5개)
	public User(String userId, String userPwd, String userName, int userAge, char userGender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		this(userId, userPwd, userName); // this( ) : 또 다른 생성자 호출 , 가장 윗 줄에 호출해야 함.
		this.userId = userId;
		this.userGender = userGender;
	}
	
	// method
	// setter method : 전달되는 값 받아서 해당 필드에 초기화(대입) 시켜주는 method (값 변경)
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	// getter method : 해당 필드에 담긴 값을 반환시켜주는 method (값 조회)
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName(String test) {
		test = "hi";
		return userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	
	// information method : 해당 필드에 담긴 값들을 하나의 문자열로 합쳐서 반환시켜주는 method
	public String info() {
		return "ID = " + userId + ", PW = " + userPwd + ", NAME = " + userName + ", AGE = " + userAge + ", GENDER = " + userGender;
	}
	
	// field + default constructor + parameterized constructor + set/getter method + information method
	
}
