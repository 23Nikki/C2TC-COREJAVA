package com.cg.statickeyword;

public class Student {
	int rollno;
	String name;
	static String college="ITS";
	Student(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1=new Student(111,"Nikki");
      Student s2=new Student(222,"Puja");
      s1.display();
      s2.display();
	}

}
