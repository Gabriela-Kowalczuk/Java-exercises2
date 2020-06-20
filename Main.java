package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        System.err.print("Podaj liczbę naturalną n : ");

        Scanner po = new Scanner(System.in);

        n = po.nextInt();

        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print("   ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print(wspolczynnik(i, k)+ "   ");
            }
            System.out.println();
        }

    }
    private static int wspolczynnik(int a, int b) {

        if (b > a) throw new IllegalArgumentException("b <= a");
        if ((b == 1) || (b == a)) return 1;

        else return wspolczynnik(a - 1, b- 1) + wspolczynnik(a - 1, b);
    }
}
