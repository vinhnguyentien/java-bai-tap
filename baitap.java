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
        int sum = 0;
       for (int i =0 ;i <Numbers.size();i++) {
        sum = sum+Numbers.get(i);      
       }
       double average = (double) sum / Numbers.size();
       System.out.println("Sum: " + sum);
       scanner.close();

    }
    }
