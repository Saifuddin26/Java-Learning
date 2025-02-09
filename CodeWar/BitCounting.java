import java.util.Scanner;

public class BitCounting {

      public String convertToBinary(int number)
      {
        if(number <= 0)
        {
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        while(number > 0)
        {
            int remainder = number % 2;
            binary.insert(0,remainder);
            number = number / 2;
        }
        return binary.toString();
      }

      	public static int countBits(String binary)
        {
            int count = 0;
            for(char bit : binary.toCharArray())
            {
                if( bit == '1'){
                count++;
                }
            }
            return count;
        }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number you want to convert:");
    int number = scanner.nextInt();

    BitCounting convert = new BitCounting();
    String binary = convert.convertToBinary(number);
    int countBits = countBits(binary);
    System.out.println("The binary conversion of the above" + " " + number + " "
    + "is" + " " +binary);
    System.out.println("The 1's count in the binary number " + " " + number + " "
    + "is" + " " +countBits);

    scanner.close();
}
}
