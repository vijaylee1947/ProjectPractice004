package ConstructorsChaining;

public class Student1 {

	String name;
	int sid;
	int age;
	Student1(){
		
		
	}
	Student1(String name){
		this.name=name;
	}
	Student1(String name,int sid){
		this(name);
		this.sid=sid;
	}
	Student1(String name,int sid,int age){
		this(name,sid);
		this.age=age;
	}

}
