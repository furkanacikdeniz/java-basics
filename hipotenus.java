
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dik kenarlardan birinin uzunluğunu giriniz: ");
        double k1 = input.nextInt();

        System.out.println("Diğer kenarın uzunluğunu giriniz: ");
        double k2 = input.nextInt();

        double hipo = Math.sqrt(k1*k1 + k2*k2);

        System.out.println("Hipotenüs = " + hipo);
    }
}