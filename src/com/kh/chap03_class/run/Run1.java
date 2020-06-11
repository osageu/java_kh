package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

/**
 * @author user1
 *
 */
public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro1 = new Product();
		pro1.setpName("iphone");
		pro1.setPrice(550000);
		pro1.setPrice(pro1.getPrice()-300000);
		pro1.setBrand("apple");
		System.out.println(pro1.info());
		System.out.println(pro1);
		
		System.out.println();
		
		Product pro2 = new Product();
		pro2.setpName("galaxy");
		pro2.setPrice(1000000);
		pro2.setPrice(pro2.getPrice()-300000);
		pro2.setBrand("samsung");
		System.out.println(pro2.info());
		System.out.println(pro2);
	}

}
