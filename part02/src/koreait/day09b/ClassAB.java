package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	//과연 이 클래스가 필드, 메소드 상속받았나 확인.
	//ClassA의 private , default 접근한정자 요소는 상속 못받음.
	
public void test() {
	//	System.out.println("name = "+name); /오류이유 name필드 접근한정자는 디폴트:다른페키지에서 사용못합니다
		title="momo";	//상속받은 title필드 다른 페키지이지만 protected 접근한정자로 자식클래스는 허용
		System.out.println("title= "+title);
		setName("신비");
		System.out.println("name = "+getName());
		
		
	}
}
