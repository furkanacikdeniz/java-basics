
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Kaç km yol gidildiğini giriniz: ");
        double input = x.nextDouble();
        double kmPrice =2.20;
        int openingPrice = 10;

        double total = openingPrice + input*kmPrice;
        if(total<=20){
            total = 20;
            System.out.println("Ödenecek tutar: " + total + " TL'dir.");
        }else{
            System.out.println("Ödenecek tutar: " + total + " TL'dir.");
        }

    }
}