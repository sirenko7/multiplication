package multiply;

import java.math.BigInteger;

public class BigNumberMultiplier {

    public static BigInteger multiply(String num1, String num2) {

        String [] numbers = checkForNegativeNumbers(num1, num2);
        num1 = numbers[0];
        num2 = numbers[1];

        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
        return new BigInteger(sb.toString());
    }

    public static String[] checkForNegativeNumbers(String str1, String str2) {

        if ((str1.charAt(0) == '-' || str2.charAt(0) == '-') &&
                (str1.charAt(0) != '-' || str2.charAt(0) != '-'))
            System.out.print("-");

        if (str1.charAt(0) == '-' && str2.charAt(0) != '-') {
            str1 = str1.substring(1);
        }
        else if (str1.charAt(0) != '-' && str2.charAt(0) == '-') {
            str2 = str2.substring(1);
        }
        else if (str1.charAt(0) == '-' && str2.charAt(0) == '-') {
            str1 = str1.substring(1);
            str2 = str2.substring(1);
        }

        String [] numbers = {str1, str2};
        return numbers;
    }
}
