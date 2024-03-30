package Arithmetic;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char op = sc.next().charAt(0);
//        switch (op){
//            case 'D':
//                System.out.print("Enter first number: ");
//                Double d = sc.nextDouble();
//                break;
//            case 'I':
//                System.out.print("Enter first number: ");
//                Integer i = sc.nextInt();
//                break;
//            case 'L':
//                System.out.print("Enter first number: ");
//                Long l = sc.nextLong();
//                break;
//            case 'S':
//                System.out.print("Enter first number: ");
//                Short s = sc.nextShort();
//                break;
//            default:
//                break;
//        }

        try{
            System.out.print("Enter first number: ");
            Double n1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            Long n2 = sc.nextLong();

            Arithmetic<Double, Long> res = new Arithmetic<>(n1, n2);
            System.out.printf("Sum: %.2f", res.add());
            System.out.printf("\nDifference: %.2f", res.subtract());
            System.out.printf("\nProduct: %.2f", res.multiply());
            System.out.printf("\nQuotient: %.2f", res.divide());
            System.out.printf("\nMaximum Value: %.2f", res.getMax());
            System.out.printf("\nMinimum Value: %.2f", res.getMin());
        }catch (InputMismatchException e){
            System.out.println("Inputs do not match.");
            e.printStackTrace();
        }
    }
}