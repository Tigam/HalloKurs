package at.wifi.swdev.hallokurs;

public class HalloKurs {

    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z;
        x++;
        y = x + x;
        x++;

        z = ++x + y++ + ++y + y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

        x = 2;
        if (x > 10) {
            System.out.println("A");
            System.out.println("B");
        }
        System.out.println("C");

        //++x;
        //z = x + y;
        //z = 10 % 3;
        //
//        
//        
//        
//        
//        int x = 31;
//        int y = 30;
//        int z = x + y;
//
//        int a = 1;
//        int b = 2;
//        int c = a + b;
//
//        a = 2_000_000_000;
//        b = 2_000_000_000;
//        long grosseZahl = 111_987_654_321L;
//        double pi = 3.1415926535897939238462643383279502884197169399375105820974944;
//        float pif = (float)pi; //3.1415926535897939f;
//        System.out.println(grosseZahl);
//
//        /*        System.out.println("Hallo Kurs!!!");
//        System.err.println("Thomas");*/
    }

}
