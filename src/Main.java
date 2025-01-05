import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TO DO:

        int numarCitit = scanner.nextInt();
        int numar1 = 0;
        int numar2 = 0;
        int numar3 = 0;
        int numar4 = 0;
        int x = numarCitit;

        System.out.print("1. ");
        while (numar1 <= numarCitit) {
            System.out.print(numar1 + " ");
            numar1++;
        }
        System.out.println();

        System.out.print("2. ");
        while (numar2 <= numarCitit) {
            if (numar2 % 2 != 0) {
                System.out.print(numar2 + " ");
            }
            numar2++;
        }
        System.out.println();

        System.out.print("3. ");
        while (numar3 <= numarCitit) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x--;
            numar3++;
        }
        System.out.println();

        System.out.print("4. ");
        while (numar4 <= numarCitit) {
            if (numar4 % 5 == 0) {
                System.out.print(numar4 + " ");
            }
            numar4++;
        }
    }
}