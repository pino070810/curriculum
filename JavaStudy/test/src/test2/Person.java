package test2;

public class Person {
	private String name;
	private int age;
	private String color;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
    public Person(String name, int age, String color) {
		this(name, age);
		this.color = color;;
	}
    
    public String getcolor() {
    	return this.color;
    }
    public void setcolor(String color) {
    	this.color = color;
    }
    
    public void printStatus() {
    	System.out.println(this.name);
    	System.out.println(this.age);
    if (this.color.equals(null)) {
	}else {
		System.out.println(this.color);
	}
     }
 }
