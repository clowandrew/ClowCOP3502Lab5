import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String inputHex = input.nextLine();
        long finalDec = 0;
        long exponent = 0;
        if(inputHex.charAt(0) == '0' && inputHex.charAt(1) == 'x') {
            int index = inputHex.length() - 1;
            while(index >= 2) {
                switch (inputHex.charAt(index)){
                    case '1':
                        finalDec += 1 * ((long) Math.pow(16, exponent));
                        break;
                    case '2':
                        finalDec += 2 * ((long) Math.pow(16, exponent));
                        break;
                    case '3':
                        finalDec += 3 * ((long) Math.pow(16, exponent));
                        break;
                    case '4':
                        finalDec += 4 * ((long) Math.pow(16, exponent));
                        break;
                    case '5':
                        finalDec += 5 * ((long) Math.pow(16, exponent));
                        break;
                    case '6':
                        finalDec += 6 * ((long) Math.pow(16, exponent));
                        break;
                    case '7':
                        finalDec += 7 * ((long) Math.pow(16, exponent));
                        break;
                    case '8':
                        finalDec += 8 * ((long) Math.pow(16, exponent));
                        break;
                    case '9':
                        finalDec += 9 * ((long) Math.pow(16, exponent));
                        break;
                    case 'a':
                        finalDec += 10 * ((long) Math.pow(16, exponent));
                        break;
                    case 'b':
                        finalDec += 11 * ((long) Math.pow(16, exponent));
                        break;
                    case 'c':
                        finalDec += 12 * ((long) Math.pow(16, exponent));
                        break;
                    case 'd':
                        finalDec += 13 * ((long) Math.pow(16, exponent));
                        break;
                    case 'e':
                        finalDec += 14 * ((long) Math.pow(16, exponent));
                        break;
                    case 'f':
                        finalDec += 15 * ((long) Math.pow(16, exponent));
                        break;
                    case 'A':
                        finalDec += 10 * ((long) Math.pow(16, exponent));
                        break;
                    case 'B':
                        finalDec += 11 * ((long) Math.pow(16, exponent));
                        break;
                    case 'C':
                        finalDec += 12 * ((long) Math.pow(16, exponent));
                        break;
                    case 'D':
                        finalDec += 13 * ((long) Math.pow(16, exponent));
                        break;
                    case 'E':
                        finalDec += 14 * ((long) Math.pow(16, exponent));
                        break;
                    case 'F':
                        finalDec += 15 * ((long) Math.pow(16, exponent));
                        break;
                }
                //System.out.println(finalDec);
                exponent++;
                index--;
            }
        }
        else {
            int index = inputHex.length() - 1;
            while(index >= 0) {
                switch (inputHex.charAt(index)){
                    case '1':
                        finalDec += 1 * ((long) Math.pow(16, exponent));
                        break;
                    case '2':
                        finalDec += 2 * ((long) Math.pow(16, exponent));
                        break;
                    case '3':
                        finalDec += 3 * ((long) Math.pow(16, exponent));
                        break;
                    case '4':
                        finalDec += 4 * ((long) Math.pow(16, exponent));
                        break;
                    case '5':
                        finalDec += 5 * ((long) Math.pow(16, exponent));
                        break;
                    case '6':
                        finalDec += 6 * ((long) Math.pow(16, exponent));
                        break;
                    case '7':
                        finalDec += 7 * ((long) Math.pow(16, exponent));
                        break;
                    case '8':
                        finalDec += 8 * ((long) Math.pow(16, exponent));
                        break;
                    case '9':
                        finalDec += 9 * ((long) Math.pow(16, exponent));
                        break;
                    case 'a':
                        finalDec += 10 * ((long) Math.pow(16, exponent));
                        break;
                    case 'b':
                        finalDec += 11 * ((long) Math.pow(16, exponent));
                        break;
                    case 'c':
                        finalDec += 12 * ((long) Math.pow(16, exponent));
                        break;
                    case 'd':
                        finalDec += 13 * ((long) Math.pow(16, exponent));
                        break;
                    case 'e':
                        finalDec += 14 * ((long) Math.pow(16, exponent));
                        break;
                    case 'f':
                        finalDec += 15 * ((long) Math.pow(16, exponent));
                        break;
                    case 'A':
                        finalDec += 10 * ((long) Math.pow(16, exponent));
                        break;
                    case 'B':
                        finalDec += 11 * ((long) Math.pow(16, exponent));
                        break;
                    case 'C':
                        finalDec += 12 * ((long) Math.pow(16, exponent));
                        break;
                    case 'D':
                        finalDec += 13 * ((long) Math.pow(16, exponent));
                        break;
                    case 'E':
                        finalDec += 14 * ((long) Math.pow(16, exponent));
                        break;
                    case 'F':
                        finalDec += 15 * ((long) Math.pow(16, exponent));
                        break;
                }
		//This is a GitHub test!
                //System.out.println(finalDec);
                exponent++;
                index--;
            }
        }
        System.out.print("Your number is " + finalDec + " in decimal");
    }
}
