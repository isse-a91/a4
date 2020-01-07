/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment:  December Exam
 *
 * Description: Get and output employee properties from Emp class code
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import java.io.*;

public class a4Client {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants ********** 
        
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
    // ***** create objects *******
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        
    	
    // ********** Print output Banner **********


        System.out.println(a4.getBanner());
	    	
    // ************************ get input **********************

    // ************************ processing ***************************

    // ************************ print output ****************************

    // ******** closing message *********
        
        System.out.println(a4.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        
    }  // end main
}  // end class
