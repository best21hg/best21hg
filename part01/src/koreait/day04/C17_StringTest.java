package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {

		String name="kim"; //참조형 변수(클래스타입)
		String name2="kim"; 
		String name3="lee"; 
		String name4=new String("kim");  //새로운 String객채생성
		
		System.out.println("name==name2 참조위치?"+(name==name2));
		System.out.println("name==name4 참조위치?"+(name==name4));
		System.out.println("name2==name4 참조위치?"+(name2==name4));
		
		name2="son"; 
		System.out.println("name==name2 참조위치?"+(name==name2));
		
		System.out.println("name="+name);
		System.out.println("name2="+name2);
		System.out.printf("name3= %s\n", name3);
		System.out.printf("name4= %s\n", name4);
	}
}
/*
 * 문자열:기호""를 사용하면 문자열 
 * 자바에서는String은 기본형 데이터가 아니고 String클래스
 * 
 * 
 * 
 * 
 */








