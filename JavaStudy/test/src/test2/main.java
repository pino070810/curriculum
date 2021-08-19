package test2;

public class main {

	public static void main(String[] args) {
		Person person1 = new Person("Sato", 20);
		Person person2 = new Person("Suzuki", 21,"red");
		
		person1.printStatus();
		person2.setcolor("blue");
		person2.printStatus();
		System.out.println(person2.getcolor());
	}

}
