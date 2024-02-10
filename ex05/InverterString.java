package ex05;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();
        scanner.close();


        char[] charArray = string.toCharArray();

    
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }

     
        String stringreversa = new String(charArray);

   
        System.out.println("String Invertida: " + stringreversa);
    }
}
