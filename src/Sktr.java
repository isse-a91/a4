/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: Class to calculate properties of an employee
 ***********************************************************************/

// import libraries as needed here
import java.util.ArrayList;

public class Sktr {
    //*** Class Variables ***
        public static int nextID = 1000;
    //*** Instance Variables ***    
     
        private int id = 0;                 // variable for id of employees
 
        ArrayList<Time> time = new ArrayList();
    //*** Constructors ***

    /*****************************************
    * Description: Default constructor for employee
    * 
    * ****************************************/
    public Sktr(){
        id = nextID++;              // set custom id
    } // end Default constructor
    /*****************************************
    * Description: Initialized Constructor
    * 
    * Interface:
    * 
    * ****************************************/
    public Sktr(String[] t){
        id = nextID++;              // set custom id
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < t.length; i += 2){              
            x = Integer.parseInt(t[i]);
            y = Integer.parseInt(t[i + 1]);
            time.add(new Time(x, y));
        } // end for
    } // end Initialized Constructor 

    
    //*** Getters ***
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/ 
    public ArrayList getTime(){
        return this.time;
    } // end getBanner
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/ 
    public int getAvg(){
        int avg;
        for(int i = 0; i < 4; i++){
            time.getMin();
        }
            return 0;
    } // end getBanner
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
        bnr += "Assignment:	A4" + nl;
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
    /*public String toString(){
        String s = "";
        
        s = String.format("%-10s %10d %s", "Id:", this.getId(),  "\n");
          s += String.format("%-10s %10d %s", "Hours:", this.getHours(),  "\n");
          s += String.format("%-10s %10.2f %s", "Wage:", this.getWage(), "\n");
          s += String.format("%-10s %10.2f %s", "Gross Pay:", this.getGrossPay(), "\n");
          s += String.format("%-10s %10.2f %s", "Normal Pay:", this.getNormPay(), "\n");
          s += String.format("%-10s %10.2f %s", "Overtime Pay:", this.getOtPay(), "\n");
        return s;
    } // end getClosingMessage*/
    
    //*** Setters ***
    
    
} // end of public class