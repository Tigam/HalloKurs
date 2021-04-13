package at.wifi.swdev.hallokurs;

public class Monat {

    public static void main(String[] args) {

        // Eingabe
        int monat = 2;
        int jahr = 1904;
        // Verarbeitung
        int tage = 31;
        switch (monat) {
            case 2:
                tage = (true) ? 29 : 28;
                if (true) {
                    tage = 29;
                } else {
                    tage = 28;
                }

                tage = ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) ? 29 : 28;

//                if ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) {
//                    tage = 29;
//                } else {
//                    tage = 28;
//                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tage = 30;
                break;
        }
        // Ausgabe
        System.out.println("Monat hat " + tage + " Tage.");

        int ergebnisse = 15646546;
        System.out.println(ergebnisse + " Ergebnis" + (ergebnisse != 1 ? "se" : "") + " gefunden.");
    }
}
