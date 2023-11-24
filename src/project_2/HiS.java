package project_2;
import java.util.Scanner;
public class HiS {
		  static int agol (double h, double m) {
		    if (h == 24)
		      h = 0;
		    if (m == 60)
		      m = 0;
		    int h_agol = (int)(0.5 * (h * 60 + m));
		    int m_agol = (int)(6 * m);

		    int a = Math.abs(h_agol - m_agol);
		    a = Math.min(360 - a, a);
		    return a;
		  }

		  public static void main(String[] args)

		  {
		    Scanner scan = new Scanner(System.in);
		    System.out.print("Vesi go brojot na casovi ");
		    int h = scan.nextInt();
		    System.out.print("Vnesi go brojot na minuti");
		    int m = scan.nextInt();
		    if (h < 0 || m < 0 || h > 24 || m > 60) {
		      System.out.println("Pogresno");
		    } else {
		      System.out.println("Agolot pomegu saatite i minutite e " + agol(h, m) + " stepeni.");
		    }
		  }
		}
