// This code is my practice.
import java.util.*;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class arraysEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // System.out.println(Arrays.toString(arr));

        // Array of integers
        // int[] arr2 = new int[5];

        // for (int i=0; i<6; i++){
        //     arr2[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr2));


        Boolean[] arr4 = new Boolean[4];
        

        ArrayList<Boolean> arrList = new ArrayList<>();

        int i = 10;
        while (i>0){
            arrList.add(sc.nextBoolean());
            i--;
        }

    }
}
