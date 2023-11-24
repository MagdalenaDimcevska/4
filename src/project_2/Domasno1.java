package project_2;
import java.util.Scanner;
public class Domasno1 {
public static void main(String []args) {
	int a,b,n;
	Scanner tastatura = new Scanner(System.in);
	System.out.println("Vnesi go brojot a:");
	a = tastatura.nextInt();
	System.out.println("Vnesi go brojot b:");
	b=tastatura.nextInt();
	n=a;
	if (b>99 && b<=999)
		System.out.println("Brojot b e trocifren");
	else 
		System.out.println("Brojot ne e trocifren");
	if (n%2==0&& n<b);
	n=n+2;
	while (n<=b) {
		System.out.println(n);
		n=n+5;
	}
}
}
