import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        int number = 0, operation;
        String hex = null;
        Formula soupObject = new Formula();
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("1.Decimal to binary");
            System.out.println("2.Decimal to octal");
            System.out.println("3.Decimal to hexadecimal");
            System.out.println("4.Binary to decimal");
            System.out.println("5.Octal to decimal");
            System.out.println("6.Hexadecimal to decimal");

            System.out.println();

            System.out.println("Which operation would you like to perform?");
            operation = input.nextInt();


            System.out.println("Enter the number");
            if(operation == 6){
                hex = input.next();
            }else{
                number = input.nextInt();
            }
            switch (operation) {
                case 1 -> {
                    System.out.println("The value in binary is:");
                    soupObject.decToBinary(number);
                }
                case 2 -> {
                    System.out.println("The value in octal is:");
                    soupObject.decToOctal(number);
                }
                case 3 -> {
                    System.out.println("The value in hexadecimal is:");
                    soupObject.decToHexadecimal(number);
                }
                case 4 -> {
                    System.out.println("The value in decimal is:");
                    soupObject.binaryToDecimal(number);
                }
                case 5 -> {
                    System.out.println("The value in decimal is:");
                    soupObject.octalToDecimal(number);
                }
                case 6 -> {
                    System.out.println("The value in decimal is:");
                    soupObject.hexadecimalToDecimal(hex);
                }
                default -> System.out.println("Error please try again");
            }

            System.out.println();
            System.out.println("Would you like to perform another operation?(Enter 1 for yes)");
            choice = input.nextInt();

        }while (choice == 1);
        }

    }
