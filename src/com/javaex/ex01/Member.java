package com.javaex.ex01;

public class Member {
	// 필드
	private String name;
	private String id;
	private String point;
	
	// 생성자

	public Member(String name, String id, String point) {

		this.name = name;
		this.id = id;
		this.point = point;

		// 메소드 gs

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	// 메소드 - 일반

	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + ") ," + point);
	}

}