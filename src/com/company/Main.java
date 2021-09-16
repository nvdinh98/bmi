package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap can nang nao !!!");
        weight = scanner.nextFloat();
        System.out.println("nhap chieu cao nao !!!");
        height = scanner.nextFloat();

        double bmi = weight / (height * height);
        System.out.println("bmi = " +  bmi);
        if (bmi < 18.5) {
            System.out.println("gay qua !");
        } else {
            if (bmi < 25) {
                System.out.println("co the ban binh thuong nhe !");
            }
            else if (bmi < 30){
                System.out.println("beo roi ban oi ");
            } else {
                System.out.println("sieu beo roi ban. giam can di");
            }
        }
    }
}
