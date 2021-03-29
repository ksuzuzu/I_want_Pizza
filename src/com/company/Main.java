package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        String yes = "да";
        String not = "нет";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Хотите пиццу? Введите да или нет:");
            String text = scanner.nextLine();
            String t = text.toLowerCase();


            if (t.equals(yes)) {
                System.out.println("Готовлю пиццу...");
                Thread.sleep(5000);
                System.out.println("Пицца приготовлена, кушать подано");
                break;

            }
            if (t.equals(not)) {
                System.out.println("До свидания");
                break;
            } else System.out.println("Некорректный ввод");


        }

    }
    }




