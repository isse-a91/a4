/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: December Exam
 * Program Name:  PayRollClient
 *
 * Description: brief description of program
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class EmpClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
        
        final int MAX = 10;
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
    	int actualSize = 0;                 // variable used for increament of array
    // ***** create objects *******
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        
        Emp emp1 = new Emp();
        Emp emp2[] = new Emp[MAX];
    	
    // ********** Print output Banner **********


        System.out.println(Emp.getBanner());
	    	
    // ************************ get input **********************

        strin = fin.readLine();
     
            while(strin != null){  
                //System.out.println(strin);
                
                tokens = strin.split(delim);
                                     
                emp2[actualSize] = new Emp(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));        // setting wage and hours for employees in array
                
                actualSize++;                                   // increasment of array
                
                strin = fin.readLine();                         // loop update
            } // loop to get input and put into a list
    // ************************ processing ***************************
        
            emp1.setHours(5);
            emp1.setWage(2);

    // ************************ print output ****************************
    
        System.out.println(emp1.toString());
        for(int i = 0; i < 6; i++){
            System.out.println(emp2[i].toString() + nl + nl);   
        }
    // ******** closing message *********
        
        System.out.println(Emp.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        
    }  // end main
}  // end class
