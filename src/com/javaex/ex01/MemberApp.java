package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m1 = new Member("정우성","jws","50000점");
		Member m2 = new Member("유재석","yjs","30000점");
		Member m3 = new Member("이효리", "lhr", "40000점");
		
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
	}

}
