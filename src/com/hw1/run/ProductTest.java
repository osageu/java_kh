package com.hw1.run;
import com.hw1.model.vo.*;

public class ProductTest {

	public static void main(String[] args) {
		
		Product osageu1 = new Product();
		Product osageu2 = new Product();
		Product osageu3 = new Product();
		System.out.println(osageu1.info());
		System.out.println(osageu2.info());
		System.out.println(osageu3.info());
		
		// osageu1
		osageu1.setProductId("ssgnote9");
		osageu1.setProductName("갤럭시노트9");
		osageu1.setProductArea("경기도 수원");
		osageu1.setPrice(960000);
		osageu1.setTax(10.0);
		
		// osageu2
		osageu2.setProductId("lgxnote5");
		osageu2.setProductName("LG스마트폰5");
		osageu2.setProductArea("경기도 평택");
		osageu2.setPrice(780000);
		osageu2.setTax(0.7);
		
		// osageu3
		osageu1.setProductId("ktsnote3");
		osageu1.setProductName("KT스마트폰3");
		osageu1.setProductArea("서울시 강남");
		osageu1.setPrice(250000);
		osageu1.setTax(0.3);
		
		
	}

}
