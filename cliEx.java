import java.util.*;

public class cliEx {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // String s = sc.nextLine();

        // System.out.printf("The input from cli is: %s", s);


        String[] strArr = new String[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Enter string element " + (i+1) + ": ");
            String s = sc.nextLine();

            strArr[i] = s;
        }

        System.out.println("The string array: " + Arrays.toString(strArr));
    }
}
