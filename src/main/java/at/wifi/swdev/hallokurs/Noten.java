package at.wifi.swdev.hallokurs;

public class Noten {

    public static void main(String[] args) {

        int note = 3;

        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht genügend");
                break;
            default:
                System.out.println("n.b.");
        }
        System.out.println("Ende");
    }

}
