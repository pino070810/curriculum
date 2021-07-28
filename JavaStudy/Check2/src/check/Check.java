package check;

import constants.Constants;

public class Check {
	private  static String firstName = "Hino";
	private  static String lastName = "Takkumi";
	

	private static void printName(String firstName,String lastName) {
		System.out.println(firstName + lastName);
	
	}

	public static void main(String[] args) {
		String JAVA = Constants.CHECK_CLASS_JAVA;
		String HOGE = Constants.CHECK_CLASS_HOGE;
		String R2D2 = Constants.CHECK_CLASS_R2D2;
		String LUKE = Constants.CHECK_CLASS_LUKE;
		
		Pet pet = new Pet(JAVA, HOGE);
		RobotPet robotPet = new RobotPet(R2D2, LUKE);
		
		
		
		printName(firstName,lastName);
		pet.introduce();
		robotPet.introduce();
		
		
	}
	}
	
	
	


