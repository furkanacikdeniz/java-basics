
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math,pyshics,chemistry,turkish,history,music;
        System.out.println("Enter your math result: ");
        math = input.nextInt();

        if(math<=100){
            System.out.println("Enter your pyshics result: ");
            pyshics = input.nextInt();

            if (pyshics<=100){
                System.out.println("Enter your chemistry result: ");
                chemistry = input.nextInt();

                if (chemistry<=100){
                    System.out.println("Enter your turkish result: ");
                    turkish = input.nextInt();

                    if(turkish<=100){

                        System.out.println("Enter your history result: ");
                        history = input.nextInt();

                        if (history<=100){

                            System.out.println("Enter your music result: ");
                            music = input.nextInt();

                            if (music <=100){

                                double avg = (double) (math + pyshics + chemistry + turkish + history + music) /6;


                                System.out.println("Your math result: " + math);
                                System.out.println("Your pysichs result: "+ pyshics);
                                System.out.println("Your chemistry result: "+ chemistry);
                                System.out.println("Your turkish result: "+ turkish);
                                System.out.println("Your history result: "+ history);
                                System.out.println("Your music result: " + music);
                                System.out.println("Your AVERAGE result: "+ avg);

                            }else {
                                System.out.println("The result cannot be bigger than 100!!");
                            }
                        }else {
                            System.out.println("The result cannot be bigger than 100!!");
                        }
                    }else {
                        System.out.println("The result cannot be bigger than 100!!");
                    }
                }else {
                    System.out.println("The result cannot be bigger than 100!!");
                }
            }else {
                System.out.println("The result cannot be bigger than 100!!");
            }
        }else {
            System.out.println("The result cannot be bigger than 100!!");
        }
    }
}