package test1;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Suzuki", 20);
		Person person2 = new Person("Soto", 25);
		
		person1.printName();
		person2.printName();
		Person.printCount();
	}
}
