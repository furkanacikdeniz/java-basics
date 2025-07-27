
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("kenarlardan birinin uzunluğunu giriniz: ");
        double k1 = input.nextInt();

        System.out.println("Diğer kenarın uzunluğunu giriniz: ");
        double k2 = input.nextInt();

        System.out.println("Diğer kenarın uzunluğunu giriniz: ");
        double k3 = input.nextInt();

        double cevre = 2*(k1+k2+k3);
        double u = cevre/2;
        double alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));

        System.out.println("Üçgenin alanı: " + alan);

    }
}