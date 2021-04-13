package at.wifi.swdev.hallokurs;

public class Umfang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //final double PI = 3.141592653589793;

        // Eingabe
        double radius = 2.2;
        //Verarbeitung
        double umfang;

        umfang = 2 * radius * Math.PI;

        // Ausgabe
        System.out.printf("Bei Radius %.1f ergibt sich ein Umfang von %.2f.%n", radius, umfang);
        //System.out.println("c:\\tmp\\new.txt");
    }

}
