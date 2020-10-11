package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    public Lab1() {
//        ex8();
    }

    public void ex0() {
        System.out.println("h:");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("sz:");
        double y = new Scanner(System.in).nextDouble();
        System.out.println("d:");
        double z = new Scanner(System.in).nextDouble();

        //osszeadas
        System.out.println(x + y + z);
        //szorzat
        System.out.println(x * y * z);
        //atlag
        System.out.println((x + y + z) / 3);
    }

    public void ex1() {
        System.out.println("x:");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("y:");
        double y = new Scanner(System.in).nextDouble();

        double temp;

        // swap with temporary variable
//        temp = x;
//        x = y;
//        y = temp;
//        System.out.println("x: " + (int)x + "\ny: " + (int)y);

        // swap with math
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + (int) x + "\ny: " + (int) y);
    }

    public void ex2() {
        System.out.println("x:");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("y:");
        double y = new Scanner(System.in).nextDouble();
        System.out.println("z:");
        double z = new Scanner(System.in).nextDouble();

        double[] arr = {x, y, z};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }

    public void ex3() {
        System.out.println("h:");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("sz:");
        double y = new Scanner(System.in).nextDouble();
        System.out.println("d:");
        double z = new Scanner(System.in).nextDouble();

        double keret = x * 2 + y * 2;
        double maradek = z - keret;

        if (maradek < 0) {
            System.out.println(Math.abs((int) maradek) + " hosszusagu drot kell meg");
        } else System.out.println(Math.abs((int) maradek) + " hosszusagu drot marad");
    }

    public void ex4() {
        System.out.println("nem:");
        String nem = new Scanner(System.in).nextLine();
        System.out.println("eletkor:");
        double eletkor = new Scanner(System.in).nextDouble();
        System.out.println("magassag:");
        double magassag = new Scanner(System.in).nextDouble();

        double keplet = 50 + 0.75 * (magassag - 150) + (eletkor - 20) / 40;
        if (nem.equals("no")) {
            double s = 0.9 * (keplet);
            System.out.println("Idealis testsuly: " + (int) s);
        } else if (nem.equals("ferfi")) {
            System.out.println("Idealis testsuly: " + (int) keplet);
        }
    }

    public void ex5() {
        System.out.println("a:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("b:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("c:");
        double c = new Scanner(System.in).nextDouble();

        double gyok = Math.sqrt((b * b) - (4 * a * c));

        double elso = (-b + gyok) / (2 * a);
        double masodik = (-b - gyok) / (2 * a);

        System.out.println("Megoldasok: " + elso + ", " + masodik);
    }

    public void ex6() {
        System.out.println("x:");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("y:");
        double y = new Scanner(System.in).nextDouble();
        System.out.println("z:");
        double z = new Scanner(System.in).nextDouble();

        double s = (x + y + z) / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        System.out.printf("%.2f", area);
    }

    public void ex7() {
        //start counter on 0
        int count = 0;
        //loop through every number from i to end number (2018)
        for (int i = 1948; i <= 2018; i++) {
            //check if i is leap-year
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                //if true add to count
                count++;
            }
        }
        System.out.println(count);
    }

    public void ex8() {
        System.out.println("ev:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("honap:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("nap:");
        int c = new Scanner(System.in).nextInt();

        LocalDate startDate = LocalDate.of(a, b, c);
        LocalDate currentDate = LocalDate.now();
        System.out.println(startDate.until(currentDate, ChronoUnit.DAYS) + " nap");
    }

    public void ex9() {
        System.out.println("a:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("b:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("c:");
        double c = new Scanner(System.in).nextDouble();

        if (a + b > c && a + c > b && c + b > a) {
            double s = (a + b + c) / 2;
            System.out.println(s);
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(area);

            //belso kor sugara
            double innerSugar = area / s;
            System.out.printf("Háromszögbe írható kör sugara: %.2f", innerSugar);

            //kulso kor
            double outerSugar = (a * b * c) / (4 * area);
            System.out.printf("\nHáromszög köré írható kör sugara: %.2f", outerSugar);


        } else System.out.println("Nem alkothatnak háromszöget");
    }
}
