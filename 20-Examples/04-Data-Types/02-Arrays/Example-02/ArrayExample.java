/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Prateek Kumar Oraon
 * 
 */

public class ArrayExample{
    public static void main(String[] args){
        // declaring a reference for int array
        int[] integerArray;

        // creating array of size 5
        // this array will be able to store 5 values
        integerArray = new int[5];

        // assigning values
        integerArray[0] = 5;
        integerArray[1] = 10;
        integerArray[2] = 15;
        integerArray[3] = 20;
        integerArray[4] = 25;

        // getting length of the array
        int len = integerArray.length;

        for(int i=0; i<len; i++){
            System.out.println(integerArray[i]);
        }
    }
}