package com.new_maven_project;

public class App {
	public String something(String some) {
		return some;
	}
	
	public static void main(String[] args) {
		App a = new App();
		String news = a.something("aklen");
		System.out.println(news);
	}
}
 