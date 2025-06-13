package org.example;

public class Primitives {

    public static void main(String[] args) {

        // Ganzzahlen
        byte byteVariable = 127; // 8 Bit
        short shortVariable = 32767; // 16 Bit
        int intVariable = 2147483647; // 32 Bit
        long longVariable = 9223372036854775807L; // 64 Bit

        System.out.println("Byte: " + byteVariable);
        System.out.println("Short: " + shortVariable);
        System.out.println("Int: " + intVariable);
        System.out.println("Long: " + longVariable);

        // Gleitkommazahlen
        float floatVariable = 3.14159f; // 32 Bit
        double doubleVariable = 3.14159265359; // 64 Bit

        System.out.println("Float: " + floatVariable);
        System.out.println("Double: " + doubleVariable);

        // Zeichen
        char charVariable = 'A'; // 16 Bit

        System.out.println("Char: " + charVariable);

        //Demonstration von Überlauf (Overflow)
        System.out.println("\nDemonstration von Überlauf:");
        byte overflowByte = 127;
        overflowByte++; // Byte Überlauf
        System.out.println("Byte nach Überlauf: " + overflowByte); //-128 (roll over)

        //Demonstration von impliziter und expliziter Typumwandlung
        System.out.println("\nDemonstration von Typumwandlung:");
        int intValue = 10;
        double doubleValue = intValue; // implizite Typumwandlung (Widening)
        System.out.println("Implizite Typumwandlung: " + doubleValue);

        double anotherDouble = 10.5;
        int anotherInt = (int) anotherDouble; // explizite Typumwandlung (Narrowing) - Achtung Datenverlust!
        System.out.println("Explizite Typumwandlung: " + anotherInt);

        double c = 5.0;
        double d = 2.0;
        System.out.println("c / d = " + (c / d)); // Gleitkommadivision (Ergebnis ist 2.5)

        //Vergleich von Primitiven
        System.out.println("\nVergleich von Primitiven:");
        int x = 10;
        int y = 10;
        System.out.println("x == y: " + (x == y)); // true

        double e = 0.1 + 0.1 + 0.1;
        double f = 0.3;
        System.out.println("e == f: " + (e == f)); // Vorsicht! Kann unerwartet false sein

        //Besser:
        System.out.println("Math.abs(e - f) < 0.000001: " + (Math.abs(e - f) < 0.000001));
    }
}