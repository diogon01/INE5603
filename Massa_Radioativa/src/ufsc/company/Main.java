package ufsc.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Calculadora cl = new Calculadora();
        System.out.println(cl.tempo(sc.nextDouble()));


    }
}
