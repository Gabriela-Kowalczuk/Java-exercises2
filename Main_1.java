package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz liczbe naturalną n");

        int n = scan.nextInt();
        int sqrt = (int) Math.sqrt(n);
        boolean prime = true;
        {
            if (n >= 2) {

                for (int j = 2; j <= sqrt; j++) {
                    if (n % j == 0 && n != 2) {
                        prime = false;
                        break;
                    }
                }
                if (prime) System.out.println("To jest liczba pierwsza");
                else System.out.println(" To nie jest liczba pierwsza, to jest liczba złożona");
            } else System.out.println(" To nie jest liczba pierwsza");
        }
    }
}


