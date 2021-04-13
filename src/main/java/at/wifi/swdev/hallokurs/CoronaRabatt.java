package at.wifi.swdev.hallokurs;

import java.util.Scanner;

public class CoronaRabatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Eingabe
        double betrag = 800.00;
//        try (Scanner sc = new Scanner(System.in)) {
//            betrag = sc.nextDouble();
//        }
//        catch (Exception e) {
//            System.out.println("Falsche Eingabe!");
//        }
        // Verarbeitung
        double rabatt;
        if (betrag >= 800) {
            rabatt = 0.15;
        } else if (betrag > 500) {
            rabatt = 0.1;
        } else if (betrag > 100) {
            rabatt = 0.05;
        } else {
            rabatt = 0.0;
        }

        double rabattInEUR = betrag * rabatt;
        double gesamt = betrag - rabattInEUR;
        // Ausgabe
        System.out.printf("Rabatt(%2.0f%%): %.2f EUR%n", rabatt * 100, rabattInEUR);
        System.out.printf("Gesamtsumme: %.2f EUR%n", gesamt);
    }

}
