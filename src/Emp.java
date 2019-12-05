/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: Class to calculate properties of an employee
 ***********************************************************************/

// import libraries as needed here

public class Emp {
    //*** Class Variables ***
        public static int nextID = 1000;
    //*** Instance Variables ***    
     
        private int id = 0;                 // variable for id of employees
        private int hours = 0;              // variable for hours of employees
        private double wage = 0;            // variable for wage of employees
 
    //*** Constructors ***

    /*****************************************
    * Description: Default constructor for employee
    * 
    * ****************************************/
    public Emp(){
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
    public Emp(int h, double w){
        id = nextID++;              // set custom id
        hours = h;                  // set hours
        wage = w;                   // set wage
    } // end Initialized Constructor 
    
    //*** Getters ***
    /*****************************************
    * Description: Gets employee id
    * 
    * Interface:
    * 
    * @return       id: int
    * ****************************************/
    public int getId(){
        return this.id;
    } // end getId
    /*****************************************
    * Description: Gets wage
    * 
    * Interface:
    * 
    * @return       Wage: double
    * ****************************************/
    public double getWage(){
        return this.wage;
    } // getWage
    /*****************************************
    * Description: Gets hours
    * 
    * Interface:
    *
    * @return       Hours: double
    * ****************************************/
    public int getHours(){
        return this.hours;
    } // end getHours
    /*****************************************
    * Description: Get grosspay
    * 
    * Interface:
    * 
    * @return       Gross Pay: double
    * ****************************************/
    public double getGrossPay(){
        return this.hours * wage;
    } // end getGrossPay
    /*****************************************
    * Description: Gets pay without overtime
    * 
    * Interface:
    * 
    * @return       normal pay: double
    * ****************************************/
    public double getNormPay(){
        if(hours <= 40){
            return this.hours * wage;
        }
        else{
            return 40 * wage;
        }
    } // end getNormPay
    /*****************************************
    * Description: Gets overtime pay only
    * 
    * Interface:
    * 
    * @return       overtime pay: double
    * ****************************************/
    public double getOtPay(){
        if(hours <= 40){
            return 0;
        }
        else{
            return (this.hours - 40) *  wage * 1.5;
        }
    } // end getOtPay
    
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
        bnr += "Assignment:	Exam" + nl;
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
    
    /*****************************************
    * Description: Set hours
    * 
    * Interface: 
    * 
    * @param    x int: update for hours
    ****************************************/
    public void setHours(int x){
        hours = x;                  // update hours
    } // end setHours
    
    /*****************************************
    * Description:  Set wage
    * 
    * Interface:
    * 
    * @param    x int: update for wage 
    ****************************************/
    public void setWage(double x){
        wage = x;                   // update wage
    } // end setWage
    
} // end of public class
