import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("คะแนนของคุณ");
            int number = scanner.nextInt();
            if (number >= 80){
                System.out.println("grade 4");
            }
            else if (number >= 75){
                System.out.println("grade 3.5");
            }
            else if (number >= 70) {
                System.out.println("grade 3");
            }
            else if (number >= 65) {
                System.out.println("grade 2.5");
            }
            else if (number >= 60) {
                System.out.println("grade 2");
            }
            else if (number >= 55) {
                System.out.println("grade 1.5");
            }
            else if (number >= 50) {
                System.out.println("grade 1");
            }
            else {
                System.out.println("grade 0");
            }//5

    }
}