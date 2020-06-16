package com.kh.chap02_personMVC.controller;

import com.kh.chap02_personMVC.model.vo.Person;

/**
 * @author user1
 *
 */

// Controller : client가 view를 통해서 request를 받아서 처리해주는 기능용 class
public class PersonController {
	
	// field
	private Person[] people = new Person[3];
	private int count = 0; 
	
	// constructor
	public PersonController() {
		
	}
	// method
	public int insertPerson(String name, int age, int wealth) {
		int result = 0;
		if (count < people.length) {
			people[count++] = new Person(name, age, wealth);
			result = 1;
		} else {
			result = 0;
		}
		// result가 1 or 0 일 것!!
		return result;
	}
	
	public int selectCount() {
		return count;
	}
	
	public Person[] selectPeople() {
		return people;
	}
	
//	public Person searchPerson(String name) {
//		
//		Person searchPerson = null;
//		for (int i = 0 ; i < count ; i++) {
//			if (people[i].getName().indexOf(name) > -1) {
//				searchPerson = people[i];
//			} 
//		}
//		return searchPerson;
//		
//	}
	
	public int averageWealth() {
		int sum = 0;
		for (int i = 0 ; i < count ; i++) {
			sum += people[i].getWealth();
		}
		return sum/selectCount();
	}
}
