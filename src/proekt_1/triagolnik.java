package proekt_1;
import java.util.Scanner;

public class triagolnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vnesi broevi:");
        int size = scanner.nextInt();
        int[] broevi= new int[size];
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            broevi[i] = scanner.nextInt();
        }
    }
}
