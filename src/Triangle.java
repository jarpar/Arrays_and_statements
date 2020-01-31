/*
Trójkąt
Napisać metodę rysującą trójkąt z gwiazdek dla zadanego n. Np, dla n=6
*/
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n;
        for (int i = 0; i < n; i++) {
            System.out.println();
            count = n - i;
            while (count > 0) {
                System.out.print("*");
                count--;
            }
        }
    }
}
