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
        
        double wage = 0.0;
        int hours = 0;
    	int actualSize = 0;
    // ***** create objects *******
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
        Emp emp1 = new Emp(hours, wage);
        Emp emp2[] = new Emp[MAX];
    	
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
	    	
    // ************************ get input **********************
/* input will now come from an external file so there
        will not normally be a need for a prompt
    
        prompt = "Enter your prompt text here. \n";	
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
*/
        // read a line of data from the external text file
        
        
        
        strin = fin.readLine();
     
            while(strin != null){  
                //System.out.println(strin);
                tokens = strin.split(delim);
                hours = Integer.parseInt(tokens[0]);
                wage = Double.parseDouble(tokens[1]);                                 
                
                emp2[actualSize] = new Emp(hours, wage);
                
                actualSize++;
                
                strin = fin.readLine();                         // loop update
                
            } // loop to get input and put into a list
            for(int i = 0; i < 6; i++){
                System.out.println(emp2[i].toString());   
            }
    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println(Emp.getClosingMessage());
        //fout.println(Emp.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
