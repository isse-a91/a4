
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Emp {
    //*** Class Variables ***
        public static int nextID = 1000;
    //*** Instance Variables ***    
     
        private int id = 0;
        private double hours = 0;
        private double wage = 0;
        
        
        
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

    /*****************************************
    * Description: Default constructor for employee
    * 
    * ****************************************/
    public Emp(){
        id = nextID++;
    }
    /*****************************************
    * Description: Initialized Constructor
    * 
    * Interface:
    * 
    * @param        h int: hours
    * @param        w double: wage
    * ****************************************/
    public Emp(int h, double w){
        id = nextID++;
        hours = h;
        wage = w;
    }    
           
    
    
    
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
    }
    /*****************************************
    * Description: Gets wage
    * 
    * Interface:
    * 
    * @return       Wage: double
    * ****************************************/
    public double getWage(){
        return this.wage;
    }
    /*****************************************
    * Description: Gets hours
    * 
    * Interface:
    *
    * @return       Hours: double
    * ****************************************/
    public double getHours(){
        return this.hours;
    }
    /*****************************************
    * Description: Get grosspay
    * 
    * Interface:
    * 
    * @return       Gross Pay: double
    * ****************************************/
    public double getGrossPay(){
        return this.hours * wage;
    }
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
    }
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
    }
    //*** Setters ***
    
    /*****************************************
    * Description: Set hours
    * 
    * Interface: 
    * 
    * @param    x int: update for hours
    ****************************************/
    public void setHours(int x){
        hours = x;
    }
    
    /*****************************************
    * Description:  Set wage
    * 
    * Interface:
    * 
    * 
    *
    * @param    x int: update for wage 
    ****************************************/
    public void setWage(int x){
        wage = x;
    } 
    
} // end of public class
