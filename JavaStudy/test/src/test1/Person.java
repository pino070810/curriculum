package test1;


public class Person {
	private String name;
	private int age;
	private static int count = 0;
	
	public Person(String name, int age) {
	    this.name = name;
	    this.age = age;
	    Person.count++;
	}

	public void printName() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void printCount() {
		System.out.println(count);
	}
}
