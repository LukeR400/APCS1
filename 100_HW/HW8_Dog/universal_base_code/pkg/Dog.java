package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	String name2;
	int age2;
	String breed2;
	boolean IFsleep;
	
	public Dog() {
		name="Clifford";
		age=3;
		breed="big red dog";
	}
	public void FINAL(){
		System.out.println(name+" is a "+breed+" that is "+age+" years old!");
		System.out.println(name2+" is a "+breed2+" that is "+age2+" years old!");
	}
	public void setName(String NAME){
		name=NAME;
	}
	public void setAge(int AGE){
		age=AGE;
	}
	public void setBreed(String BREED){
		breed=BREED;
	}
	public String getName(){
		name2="Arvin";
		return name2;
	}
	public int getAge(){
		age2=1;
		return age2;
	}
	public String getBreed(){
		breed2="German Shepherd";
		return breed2;
	}
	public boolean isSleeping(){
		int RAND1 = (int)((Math.random()*(10))+0);
		if(RAND1==1){
			IFsleep = true;
		}
		if(RAND1==0){
			IFsleep=false;
		}
		return IFsleep;
	}
	public void bark(String BARKname){
		System.out.println(BARKname+" barked!");
	}
}
