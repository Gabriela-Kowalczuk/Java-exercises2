package com.company;

import java.util.Scanner;


public class Main {

    private static double suma(double[] tab3) {
        double suma1 = tab3[0];
        for (int i = 1; i < tab3.length; i++) {
            suma1 += tab3[i];
        }
        return suma1;
    }

    private static double max(double[] tab2) {
        double max1 = tab2[0];
        for (int i = 1; i < tab2.length; i++) {
            if (tab2[i] > max1) {
                max1 = tab2[i];
            }
        }
        return max1;
    }


    private static double min(double[] tab1) {
        double min1 = tab1[0];
        for (int i = 1; i < tab1.length; i++) {
            if (tab1[i] < min1) {
                min1 = tab1[i];
            }
        }
        return min1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną n ");
        String pierwsza = scan.nextLine();

        System.out.println("Podaj liczbę rzeczywistą a początkowy zakres");
        String druga = scan.nextLine();

        System.out.println("Podaj liczbę rzeczywistą - b końcowy zakres ");
        String trzecia = scan.nextLine();
        int n = Integer.parseInt(pierwsza);
        double min = Double.parseDouble(druga);
        double max = Double.parseDouble(trzecia);


        double[] tab = new double[n];


        for (int i = 0; i < n; i++) {

            double range = (max - min);
            tab[i] = ((Math.random() * range) + min);
        }

        for (double x : tab) {
            System.out.println(x);
        }

        System.out.print("Suma wylosowanych liczb to: ");
        System.out.format(" %.3f" , suma(tab));
        System.out.println(" ");
        System.out.print("Maximum to: ");
        System.out.format(" %.3f " , max(tab));
        System.out.println("  ");
        System.out.print("Mininum to: ");
        System.out.format(" %.3f" , min(tab));
        System.out.println("  ");
        System.out.print("Srednia to: ");
        System.out.format(" %.3f " , suma(tab) / tab.length);
    }
}

