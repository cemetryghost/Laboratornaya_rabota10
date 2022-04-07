package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "";;
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        int min = word.length();
        String[] words = word.split(" ");
        for(String t : words){
            int c = t.length();
            if(c < min){
                min = c;
            }
        }
        System.out.printf("Длина самого короткого слова равна %d символа(ов)\nСлово(а): \n", min);
        for(String t : words){
            if(t.length() == min){
                result = t;
                System.out.println(result);
            }
        }
    }
}