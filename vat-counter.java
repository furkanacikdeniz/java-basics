
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price to calculate VAT: ");
        double price = input.nextInt();

        if (price>=0){
            if(price>1000){
                double newPrice = price * 1.08;
                double vatPrice = (newPrice-price);

                System.out.println("Price with VAT is " + newPrice);
                System.out.println("VAT Price is " + vatPrice);
            }else {
                double newPrice = price * 1.18;
                double vatPrice = (newPrice-price);

                System.out.println("Price with VAT is " + newPrice);
                System.out.println("VAT Price is " + vatPrice);
            }
        }else{
            System.out.println("Price cannot be negative!");
        }
    }
}