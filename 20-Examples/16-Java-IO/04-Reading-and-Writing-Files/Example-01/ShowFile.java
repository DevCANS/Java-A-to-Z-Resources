/**
 * 
 * DevCans - Java A-to-Z Resources
 * @author - Java: The Complete Reference - Herbert Schildt
 * 
 */

/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT,
use the following command line.
java ShowFile TEST.TXT
*/
import java.io.*;
class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        // First, confirm that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
        // Attempt to open the file.
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }
        // At this point, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error Reading File");
        }finally {
            // Close file on the way out of the try block.
            try {
                fin.close();
            } catch(IOException e) {
                System.out.println("Error Closing File");
            }
        }
        
        // // Close the file.
        // try {
        //     fin.close();
        // } catch(IOException e) {
        //     System.out.println("Error Closing File");
        // }
    }
}