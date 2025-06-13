package org.example;

public class Ternary {

    public static void main(String[] args) {

        int age = 20;
        String status = (age >= 18) ? "Volljährig" : "Minderjährig";
        System.out.println("Alter: " + age + ", Status: " + status);

        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";
        System.out.println("Punktzahl: " + score + ", Note: " + grade);

    }
}
