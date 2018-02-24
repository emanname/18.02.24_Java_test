

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
	
	public Scanner userInput = new Scanner(System.in);//allow get user input from keyboard
	
	
	


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
			// this - link to object (экземпл€р класса)that created ()
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
		//тут кусок непон€тнойфигни, откуда этот чел вз€л ту таблицу и что такое первые 20 символов в его таблице а не в юникоде 
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





	public static void main(String[] args) {
	
	Animal theAnimal= new Animal();
		
	}
	
	
	}
