package org.less6.less7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class except {
    public static void main(String[] args) throws InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//        int res = 0;
//        System.out.println("enter a =");
//        byte a = scanner.nextByte();
//        System.out.println("enter b =");
//        byte b = scanner.nextByte();
//        System.out.println("enter operation =");
//        String op = scanner.next();
//        switch (op.charAt(0)) {
//            case '+':
//                res = a + b;
//                break;
//            case '-':
//                res = a - b;
//                break;
//            case '*':
//                res = a * b;
//                break;
//            case '/':
//                if (b != 0) {
//                    res = a / b;
//                } else {
//                    System.out.println("делить на ноль нельзя");
//                    break;
//                }
//                System.out.println(res);
//        }

        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int a = 0;
        int b = 0;
        try {
            System.out.println("enter a =");
            a = scanner.nextInt();
            System.out.println("enter b =");
            b = scanner.nextInt();
            System.out.println("enter operation =");
            String op = scanner.next();
            switch (op.charAt(0)) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
    } catch (InputMismatchException e){
            System.out.println("ошибка ввода");
    }catch (ArithmeticException e){
        System.out.println("арифметическая ошибка");
    }
         System.out.println("Программа = " + res);

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
    Thread.sleep(3000);
    }
}

