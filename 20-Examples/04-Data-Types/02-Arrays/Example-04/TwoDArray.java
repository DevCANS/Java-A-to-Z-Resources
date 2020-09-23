/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

public class TwoDArray{
    public static void main(String[] args){
        int[][] intArray = {
            {'1', '2', '3'},
            {'2', '3', '4'}
        };

        int i, j;
        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}