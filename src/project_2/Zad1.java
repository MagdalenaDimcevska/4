package project_2;
import java.util.Scanner;
public class Zad1 {

	public static void main(String[] args) {
		double c,f,i;
		System.out.println("Do brojot:");
		Scanner input = new Scanner (System.in);
		c= input.nextInt();
        	f=9*c/5+32;
        	System.out.println(c+"celziusevi stepeni");
        	System.out.println(f+"farehajtovi stepeni");   	
	}
}
