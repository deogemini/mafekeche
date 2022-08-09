//this class is to get the longest binary length of integers

import java.util.Scanner;

public class BinaryLength {
     static int dec_num;
    public static void main(String[] args) {

        BinaryLength binaryLength = new BinaryLength();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        binaryLength.solution(dec_num);
    }

    public String solution(int N){
        System.out.println("the binary number is : "+ Integer.toString(N,2));
        String binaryString;
        binaryString = Integer.toString(N,2);

    if(binaryString.length() > 0){
    if(!binaryString.contains("0")){
        System.out.println("No binary gape does not contain any 0");
    }
    else if(!binaryString.contains("1")){
        System.out.println("No binary gape does not contain any 1");
    } else {
        int maxLength = 0;
        int tempLength = 0;
        char NewArray[] = binaryString.toCharArray();
        for (int i = 0; i < NewArray.length; i++) {
            if (NewArray[i] == '0') {
                tempLength++;
            } else {
                tempLength = 0;
            }

            if (tempLength > maxLength) {
                maxLength = tempLength;
            }
        }
        System.out.println("Maximum binary length is: " + maxLength);
    }
}return binaryString;
    }
}
