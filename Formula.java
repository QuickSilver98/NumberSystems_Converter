import org.jetbrains.annotations.NotNull;

public class Formula {

    public void decToBinary(int number){

        int i = 0;

        //binary array
        int [] bin = new int[100];
        bin [0] = 0;

        while(number > 0) {
            bin[i++] = number % 2;
            number /= 2;
        }

        for(int j = i-1;j >= 0;j--){
            System.out.print(bin[j]);
        }
    }
   public void decToOctal(int number){
        int i = 0;

        //binary array
        int [] bin1 = new int[100];
        bin1 [0] = 0;

        while(number > 0){
            bin1[i++] = number % 8;
            number /= 8;
        }

        for(int j = i-1;j >= 0;j--){
            System.out.print(bin1[j]);
        }
    }

    public void decToHexadecimal(int number){

        //for storing remainder
        int rem;

        //for storing output
        StringBuilder str = new StringBuilder(" ");

        //Digits in hexadecimal number system
        char [] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(number > 0){
            rem = number % 16;
            str.insert(0, hex[rem]);
            number /= 16;

        }

        System.out.print(str);

    }

    public void binaryToDecimal(int number){
        int decimalNumber = 0 ,power = 0;

        while(number != 0){
            decimalNumber += ((number % 10) * Math.pow(2,power));
            number /= 10;
            power++;
        }
        System.out.print(decimalNumber);
    }

    public void octalToDecimal(int number){
        int decimalNumber = 0, power = 0;

        while(number != 0){
            decimalNumber += ((number % 10) * Math.pow(8,power));
            number /= 10;
            power++;
        }
        System.out.println(decimalNumber);
    }

    public void hexadecimalToDecimal(@NotNull String hex){
        int decimal = 0, i = 0,rem;



       int length = hex.length();
        length--;

        while(length >= 0){
            rem = hex.charAt(length);

            if(rem>=48 && rem<=57){
                rem -= 48;
            } else if (rem>=65 && rem<=70){
                rem -= 55;
            } else if(rem>=97 && rem<=102){
                rem -= 87;
            }else{
                System.out.println("Invalid hexadecimal digit");
            }

            decimal = (int) (decimal+(rem * Math.pow(16,i)));
            i++;
            length--;
            }

        System.out.println(decimal);
    }

}
