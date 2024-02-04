package Constructors;

public class Student {

	String name;
	int sid;
	int age;
	Student(){
		
	}
	Student(String name){
		this.name=name;
	}
	Student(String name,int sid){
		this.name=name;
		this.sid=sid;
	}
	Student(String name,int sid,int age){
		this.name=name;
		this.sid=sid;
		this.age=age;
	}
}
