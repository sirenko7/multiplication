package multiply;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if(args[0].equals("alg1")){
            System.out.println(BigIntegerMultiplier.multiply(args[1], args[2]));

        } else if(args[0].equals("alg2")){
            System.out.println(BigNumberMultiplier.multiply(args[1], args[2]));
        }

        //Uncomment the section down below and comment the upper one if you want to use IDE's console

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        String number1 = in.nextLine();
//        System.out.print("Enter second number: ");
//        String number2 = in.nextLine();
//        System.out.print("Enter implementation alg1 or alg2: ");
//        String impl = in.nextLine();
//        if(impl.equals("alg1")){
//            System.out.println(BigIntegerMultiplier.multiply(number1, number2));
//        }else if(impl.equals("alg2")){
//            System.out.println(BigNumberMultiplier.multiply(number1, number2));
//        }
//        in.close();
    }
}
