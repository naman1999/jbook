package arraymethoddemo;

import java.util.Arrays;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        MyClass amd = new MyClass();

        int[] myArray ={1,2,3,4,5};

        amd.printFirstElement(myArray);

        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));

        int number = 2;
        System.out.println("number before = " + number);
        amd.passPriitive(number);
        System.out.println("number after = " + number);

        System.out.println("myArray[1] before = " + myArray[1]);
        amd.passrefrence(myArray);
        System.out.println("myArray[1] after = " + myArray[1]);
    }
}
