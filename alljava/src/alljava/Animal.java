

package alljava;
/* this is my project where i will copypaste project of this guy
 * https://www.youtube.com/watch?v=WPvGqX-TXP0 */

import java.util.Scanner;
import java.util.*; //entire library
public class Animal {
 // just test of git from other device 
 
	//public -visible to anyone else
	//static -only one instance of this variable exist/
	//final classes cant be subclassed
	public static final double justSomeNumber = 1.123;
	//long private section of all standart variable types in java: 
	private String name; 
	private int weight;
	private boolean hasOwner =false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals=0;//every object shares same value of aminals
	
	static Scanner userInput = new Scanner(System.in);//allow get user input from keyboard
	
	
	


	public Animal() {
		//	super();//calls whatever was superclass for animal , animal is main class so 
		//it don't need it
		numberOfAnimals++;

		int sumOfNumbers =5+1;
		System.out.println("5 + 1 = " + sumOfNumbers);

		int diffOfNumbers =5-1;
		System.out.println("5 - 1 = " + diffOfNumbers);

		int multOfNumbers =5*1;
		System.out.println("5 * 1 = " + multOfNumbers);

		int divOfNumbers =5/1;
		System.out.println("5 / 1 = " + divOfNumbers);

		int moduleOfNumbers =5%3;
		System.out.println("5 % 3 = " + moduleOfNumbers);
		//here it seems we start fill all variables
		/* example of some function at class creation
		System.out.println("Enter pet name \n "); // /n -next row
		
		if (userInput.hasNextLine()) {
			// this - link to object (экземпляр класса)that created ()
			this.setName(userInput.nextLine());	
		}
		*/

		this.setUniqueID();
		this.setFavoriteChar();
	}
	
	
	
	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getWeight() {
		return weight;
	}





	public void setWeight(int weight) {
		this.weight = weight;
	}





	public boolean isHasOwner() {
		return hasOwner;
	}





	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}





	public byte getAge() {
		return age;
	}





	public void setAge(byte age) {
		this.age = age;
	}





	public long getUniqueID() {
		return uniqueID;
	}




//overloading setUinqueID function
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID is set to: " + this.uniqueID);
	}
	
	
//generate random number for ID\
	public void setUniqueID() {
		long minNumber=1;
		long maxNumber=1000000;
		//(long) - cast from double to long variable type
		this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber-minNumber)+1) );
		//String stringNumber= Long.toString(maxNumber);
		// that was just example of casting someting to something
		//int intString = Integer.parseInt(stringNumber);
		System.out.println("Unique ID is set to: " + this.uniqueID );
	}




	public char getFavoriteChar() {
		return favoriteChar;
	}





	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}




	public void setFavoriteChar() {
	
		int randomIntChar = (int)(Math.random()*94 +32); //0- 126-32 =94
		this.favoriteChar=(char)randomIntChar;
		if(randomIntChar==32) {
			System.out.println("Favorite character is set to Space ");
		}else if (randomIntChar==10) {
			System.out.println("Favorite character is set to Next line ");
		}else {
			System.out.println("Favorite character is set to " + this.favoriteChar);
		}
		
		if((randomIntChar>97) && (randomIntChar<122) ) {
			System.out.println("Favorite character is a lowercase letter");
		}
		
		if(((randomIntChar>97) && (randomIntChar<122)) || ((randomIntChar>65) && (randomIntChar<90))) {
			System.out.println("Favorite character is a letter");
		}
		//comparsion in short way
		// (true/false)? result if true: result if false ;
		int wichIsBigger = (50>randomIntChar)? 50 : randomIntChar;
		//i print it to console to know what numbers i get
		//System.out.println("randomIntChar is " + randomIntChar + " and Wich is Bigger is " + wichIsBigger );
		
		//case 8( <- int byte or character or srings '8   '<-char ; "stringvarialbe    "<-string
		randomIntChar=42;
		char randCharChar = (char)randomIntChar;
		switch(randomIntChar) {
		case 42: 
			System.out.println("Favorite character set to asterisk : " + randCharChar);
			break;
		case 0x041:
		case 0b011:
		case 41:
		case 041:
			//do nothing
			break;
		default:
			System.out.println("Favorite character set to something");
			break;
		}
		
	}





	public double getSpeed() {
		return speed;
	}





	public void setSpeed(double speed) {
		this.speed = speed;
	}





	public float getHeight() {
		return height;
	}




	public void setHeight(float height) {
		this.height = height;
	}


/**
 * 22:38
 * cycles
 * */
	// protected meant that this function is visible only for pacage
	//static means that this thing belongs to the class and not to the individual objects
	protected static void countTo(int startingNumber) {
		
		for(int i=startingNumber; i<= 100 ;i++) {
			//continue -jump to start of the loop for condition test
			if (i==90) continue;
			
		}
		
	}
//24:30
	protected static String whileExample(int startingNumber) {
		
		int i=1;
		
		while(i < startingNumber ) {
			
			System.out.println(i);
			i++;
			
			if(i== startingNumber) {	break;} ;
		}
		
		return "this while example return String, not void";
	}
	
//25:36
	
	protected static void doWhileExample() {
		// guess my number in video
		
		int number=1;
		
		do {
			//at least 1 time something doing here
			System.out.println("Guesss my number (1 -10 )");
			while(!userInput.hasNextInt()) {
				String notIntEntered=userInput.next();
				System.out.printf("%s is not a number\n", notIntEntered); //%s - string
				
			}
			
			number=userInput.nextInt();
			
		} while( number!=10) ;
		System.out.println("you got my num");
		
		
		
	}// eof doWhile example
	
	public String makeSound() {
		
		return "Grrrr"; 
		//String animalSound = "Rrrrr";
		//return animalSound;
		
	}

	public static void speakAnimal(Animal gettedAnimal) {
		
		System.out.println("Animal says" + gettedAnimal.makeSound() );
		
	}
	
	public static void main(String[] args) {
	
	Animal theAnimal= new Animal();
	//theAnimal.doWhileExample();
		
/*	Here will be some samples of random arrays and arrays creations
 * 
 * */
	
	int[] fariteNumber;
	fariteNumber= new int[20];
	// ^ same as : int[] fariteNumber = new int[20];
	
	String[] stringArray = {"some","random","words"} ;
	//: -for each
	for (String word : stringArray) {
		
		System.out.println(word);
	
	
	}
	/*arrays first ->[]  from [this one][][] is how many down
	 * arrays second ->[]  from [][this one][] is how many across
	 * and third - is "z" dimension, how many of this 2 d arrays was created
	 * 
	 * */
	String[][][] threeDiArray = {};

	String[] cloneOfArray = Arrays.copyOf(stringArray,5);

	System.out.println(Arrays.toString(cloneOfArray));

	System.out.println(Arrays.binarySearch(cloneOfArray, "null"));

	
	}
	
	
}
