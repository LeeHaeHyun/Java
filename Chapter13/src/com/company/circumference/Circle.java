package com.company.circumference;

//원의 둘레를 계산하기 위한 클래스
public class Circle
{
	//멤버변수 : 반지름
	double rad;
	//멤버상수 : 원주율
	final double PI;
	
	//생성자 : 멤버변수를 초기화한다 (이름이 같기에 생성자)
	public Circle(double r) 
	{
		//this는 멤버를 가리킨다
		this.rad = r;
		//생성자에서는 멤버상수를 초기화할 수 있다
		PI = 3.14;
	}
	
	// 원의 둘레 길이 반환
	public double getCircumference() {
		return (rad * 2) * PI;
	}
}
