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
        
    	ArrayList<Sktr> skrrt = new ArrayList<Sktr> (9);
        
        //Sktr sktr = new Sktr();
        
    // ********** Print output Banner **********

        System.out.println(Sktr.getBanner());
	    	
    // ************************ get input **********************
        strin = fin.readLine();
     
        while(strin != null){
            tokens = strin.split(delim);
            skrrt.add(new Sktr(tokens));    
                
            //System.out.println(skrrt);
            strin = fin.readLine();                         // loop update
        } // end of while loop to get input and put into a list
        
    // ************************ processing ***************************
        for(int i = 0; i < skrrt.size(); i++){
            System.out.println(skrrt.get(i).toString());
        }
        skrrt.get(0).setTime(5, 55);
        for(int i = 0; i < skrrt.size(); i++){
        System.out.println(skrrt.get(i).toString());
        }
    // ************************ print output ****************************

    // ******** closing message *********
        
        System.out.println(Sktr.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        
    }  // end main
}  // end class
