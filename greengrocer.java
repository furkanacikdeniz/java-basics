
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Armut kaç kilo? ");
        double armut = x.nextDouble();
        double armutKg = 2.14;

        System.out.println("Elma kaç kilo? ");
        double elma = x.nextDouble();
        double elmaKg = 3.67;

        System.out.println("Domates kaç kilo? ");
        double domates = x.nextDouble();
        double domatesKg = 1.11;

        System.out.println("Muz kaç kilo? ");
        double muz = x.nextDouble();
        double muzKg = 0.95;

        System.out.println("Patlıcan kaç kilo? ");
        double patlican = x.nextDouble();
        double patlicanKg = 5.00;

        double toplam = (elma*elmaKg)+(armut*armutKg)+(domates*domatesKg)+(muz*muzKg)+(patlicanKg*patlican);
        System.out.println("Toplam: " + toplam + "TL");


    }
}