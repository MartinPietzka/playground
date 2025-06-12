package org.example;

public class TernaryPlayground {

    public static void main(String[] args) {

        int age = 20;
        String status = (age >= 18) ? "Volljährig" : "Minderjährig";
        System.out.println("Alter: " + age + ", Status: " + status); // Ausgabe: Alter: 20, Status: Volljährig

        int number = -5;
        String parity = (number % 2 == 0) ? "Gerade" : "Ungerade";
        System.out.println("Zahl: " + number + ", Parität: " + parity); // Ausgabe: Zahl: -5, Parität: Ungerade

        boolean isRaining = true;
        String activity = isRaining ? "Drinnen bleiben" : "Nach draußen gehen";
        System.out.println("Es regnet: " + isRaining + ", Aktivität: " + activity); // Ausgabe: Es regnet: true, Aktivität: Drinnen bleiben

        int a = 10, b = 5;
        int max = (a > b) ? a : b;
        System.out.println("Maximum von " + a + " und " + b + " ist: " + max); // Ausgabe: Maximum von 10 und 5 ist: 10

        //Verschachtelte Ternarys (vorsichtig verwenden!)
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";
        System.out.println("Punktzahl: " + score + ", Note: " + grade); // Ausgabe: Punktzahl: 75, Note: C

        //Alternative Schreibweise (für Lesbarkeit bei verschachtelten Ternarys)
        String grade2 =
                (score >= 90) ? "A" :
                        (score >= 80) ? "B" :
                                (score >= 70) ? "C" :
                                        "D";
        System.out.println("Alternative Note: " + grade2);

        //Beispiel mit Zuweisung zu einer Variable, die bereits deklariert wurde
        String message;
        message = (age >= 18) ? "Du darfst wählen." : "Du darfst noch nicht wählen.";
        System.out.println(message); // Ausgabe: Du darfst wählen.
    }
}
