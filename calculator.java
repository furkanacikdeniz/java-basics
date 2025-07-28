
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        double n1 = x.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double n2 = x.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        int select = x.nextInt();

        if (select<=4){
            switch (select){
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1-n2);
                    break;
                case 3:
                    System.out.println(n1*n2);
                    break;
                case 4:
                    System.out.println(n1/n2);
            }
        }else {
            System.out.println("geçerli işlem giriniz");
        }


    }
}