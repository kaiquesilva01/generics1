package application;

import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values?");
        int n = sc.nextInt();

        PrintService<Integer> ps = new PrintService<>();

        for(int i=0;i<n;i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}