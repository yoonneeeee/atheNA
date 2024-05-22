package org.atheNA.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단항 연산자
		// a++, ++a -> a=a+1;
		int a1 =1;
		System.out.println(++a1);
		System.out.println(a1++);
		// 후위 연산자 : 왼쪽에 있는 게 먼저 실행되기 때문에 출력해도 더해진 게 볼 수 없음
		System.out.println(a1);
		
		
	// 문제1 //
		// a가 10, b는 20, c는 30입니다. 
		// a++;
			// a : 11, b : 20, c: 30
		// b = (--a) + b;
			// a : 10, b : 30, C : 30
		// c = (++a) + (--b);
				// a = 11, b=29, c=39
		// a, b, c의 값은 얼마일까요?
	// 문제 1 	
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a : " + a + ", b : " + b + ", c : "  + c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	// 문제 2
		boolean flag = true;
//		flag = !!!!flag;
		System.out.println(!!!!flag);
		
		
	// 문제 2
		int x =100;
		int y = 33;
		int z = 0;
		x--;
		z=x-- + --y;
		x= 99 + x++ + x;
		y=y-- + y + ++y;
	// x : 99, y : 33, z : 0
	// x : 98, y : 32, z : 99+32 = 131
	// x : 99+98+99=296 , y : 32, z : 131
	// x : 296, y : 32+31+32=95, z=131
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("x : "+x+", y : "+y+", z : "+z);
	}

}
