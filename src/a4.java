/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: Class to calculate properties of an employee
 ***********************************************************************/

// import libraries as needed here

public class a4 {
    //*** Class Variables ***
        public static int nextID = 1000;
    //*** Instance Variables ***    
     
        private int id = 0;                 // variable for id of employees
 
    //*** Constructors ***

    /*****************************************
    * Description: Default constructor for employee
    * 
    * ****************************************/
    public a4(){
        id = nextID++;              // set custom id
    } // end Default constructor
    /*****************************************
    * Description: Initialized Constructor
    * 
    * Interface:
    * 
    * @param        h int: hours
    * @param        w double: wage
    * ****************************************/
    public a4(int h, double w){
        id = nextID++;              // set custom id
    } // end Initialized Constructor 
    
    //*** Getters ***
    
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/
    public static String getBanner(){
        String bnr = "";                    // banner
        String nl = System.lineSeparator();
        
        bnr = "*******************************************" + nl;
        bnr += "Name:		Ayub" + nl;
        bnr += "Class:		CS30S" + nl;
        bnr += "Assignment:	December Exam" + nl;
        bnr += "*******************************************" + nl;
        
        return bnr;
    } // end getBanner
   
    /*****************************************
    * Description: print banner information to the console window
    * 
    * Interface:
    * 
    * 
    * @return       cls string: closing message 
    * ****************************************/
    public static String getClosingMessage(){
        String cls = "";
        
        cls = "end of proccesing";
        
        return cls;
    } // end getClosingMessage
    
    /*****************************************
    * Description:  create and return output 
    * 
    * Interface:
    * 
    * @return    s string: holds and returns output
    ****************************************/
    public String toString(){
        String s = "";
        
        s = String.format("%-10s %10d %s", "Id:", this.getId(),  "\n");
          s += String.format("%-10s %10d %s", "Hours:", this.getHours(),  "\n");
          s += String.format("%-10s %10.2f %s", "Wage:", this.getWage(), "\n");
          s += String.format("%-10s %10.2f %s", "Gross Pay:", this.getGrossPay(), "\n");
          s += String.format("%-10s %10.2f %s", "Normal Pay:", this.getNormPay(), "\n");
          s += String.format("%-10s %10.2f %s", "Overtime Pay:", this.getOtPay(), "\n");
        return s;
    } // end getClosingMessage
    
    //*** Setters ***
    
} // end of public class
