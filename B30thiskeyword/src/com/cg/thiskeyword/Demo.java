package com.cg.thiskeyword;

public class Demo {
     void m()
     {
    	 System.out.println(this);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo obj=new Demo();
       System.out.println(obj);
       obj.m();
	}

}
