package com.inherit.hw2.run;
import com.inherit.hw2.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Circle[] circle = new Circle[2];
		Rectangle[] rectangle = new Rectangle[2];
		
		circle[0] = new Circle(1,2,3);
		circle[1] = new Circle(3,3,4);
		rectangle[0] = new Rectangle(-1, -2, 5, 2);
		rectangle[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for (Circle num : circle) {
			num.draw();
		}
		System.out.println("===== rectangle =====");
		for (Rectangle num : rectangle) {
			num.draw();
		}
		
	}

}
