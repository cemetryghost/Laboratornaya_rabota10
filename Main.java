package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        minWordLength(word);
    }
    public static void minWordLength(String word){
        String result;
        int min = word.length();
        String[] words = word.split(" ");
        for(String t : words){
            int c = t.length();
            if(c < min){
                min = c;
            }
        }
        System.out.printf("Длина минимально слова равна %d символа(ов)\nСлово(а): \n", min);
        for(String t : words){
            if(t.length() == min){
                result = t;
                System.out.println(result);
            }
        }
    }
}
