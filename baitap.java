import java.util.Scanner;
import java.util.ArrayList;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        ArrayList<Integer> Numbers = new ArrayList<>();

        while (true) {
        int number = scanner.nextInt();

            if (number==-1) {
                break;
            }

            Numbers.add(number);
        }
        System.out.println("Enter first: ");
        int start = scanner.nextInt();
        System.out.println("Enter end: ");
        int end = scanner.nextInt();
        for (int i = start; i<=end;i++) {
            System.out.println(Numbers.get(i));
        }
    }
}