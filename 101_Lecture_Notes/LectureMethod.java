/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        ANIMAL();
        
        greeting("John");
        greeting("Jaden");
        greeting("Jimothy II");
        
        double num = raise(6000, 6);
        System.out.println(num);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        System.out.println(num);
	}
	
	public static void greeting(String name){
	    System.out.println("Howdy"+name);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary*(percent/100.0));
	    return amount;
	}
	
	public static void ANIMAL(){
	    System.out.println("     \_/");
	    System.out.println("   __/\".");
	    System.out.println("  /__ |");
	    System.out.println("  || ||");
	}
}