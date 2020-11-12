package com.interview.javabasic.java;
 
public class Demo4 {
	public static void main(String[] args) {
		new childrenDemo();
		new childrenDemo();
	}
}
 
class ParentDemo{
	 static	String staParentString="父类-静态-变量";
	 String parentString="父类-非静态-变量";


	 static{
		 System.out.println(staParentString);
		 System.out.println("父类 -  静态 - 初始化块");
	 }
	 {
		 System.out.println(parentString);
		 System.out.println("父类 - 非静态 - 初始化块");
	 }
	 ParentDemo(){
		 System.out.println("父类-构造方法");
	 }
}
 
class  childrenDemo extends ParentDemo{
	static	String staChildrenString="子类-静态-变量";
	 String childrenString="子类-非静态-变量";
	
	 static{
		 System.out.println(staChildrenString);
		 System.out.println("子类 -  静态 - 初始化块");
	 }
	 {
		 System.out.println(childrenString);
		 System.out.println("子类- 非静态 - 初始化块");
	 }
	 childrenDemo(){
		 System.out.println("子类-构造方法");
	 }
}