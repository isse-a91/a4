/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: a4
 *
 * Description: client code to load data file and output properties
 ***********************************************************************/
 
 // import java libraries here as needed
 
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
        
        BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
        Scanner scanner = new Scanner(System.in);
        
    	ArrayList<Sktr> skrrt = new ArrayList<Sktr> (9);
        
        ProgramInfo programInfo = new ProgramInfo("a4");
        
    // ********** Print output Banner **********

        System.out.println(programInfo.getBanner());
	    	
    // ************************ get input **********************
        strin = fin.readLine();
     
        while(strin != null){
            tokens = strin.split(delim);
            skrrt.add(new Sktr(tokens));    
                
            //System.out.println(skrrt);
            strin = fin.readLine();                         // loop update
        } // end of while loop to get input and put into a list
               
        
    // ************************ processing ***************************
        
        System.out.println(skrrt.get(1).getTime(6));    // print 5th time of 2nd skater
    
    // ************************ print output ****************************
        for(int i = 0; i < skrrt.size(); i++){
            System.out.println(skrrt.get(i).toString());
        }
        skrrt.get(0).setTime(5, 55);
        for(int i = 0; i < skrrt.size(); i++){
        System.out.println(skrrt.get(i).toString());
        }
    // ******** closing message *********
        
        System.out.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        
    }  // end main
}  // end class
