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

public class EmpClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
        
        final int MAX = 10;                 // constant for max array size
        final int ARRAYSIZE = 6;            // constant for array size  
        
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
        
        Emp emp1 = new Emp();               // Employee object for default constructor
        Emp emp2[] = new Emp[MAX];          // Employee object for object array
        Emp emp3 = new Emp(9, 15);          // Employee object for intilized constructor, first is hours, second is wage
    	
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
        } // end of while loop to get input and put into a list
    // ************************ processing ***************************
        
            emp1.setHours(5);
            emp1.setWage(2);

    // ************************ print output ****************************
    
        System.out.println(emp1.toString());
        for(int i = 0; i < ARRAYSIZE; i++){
            System.out.println(emp2[i].toString() + nl + nl);   
        }
    // ******** closing message *********
        
        System.out.println(Emp.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        
    }  // end main
}  // end class
