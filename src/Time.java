
import java.util.ArrayList;
import java.util.logging.Logger;

/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: a4
 *
 * Description: Class to calculate properties of an employee
 ***********************************************************************/

// import libraries as needed here

public class Time {
    //*** Class Variables ***
    //*** Instance Variables ***    
     
        private int sec = 0;
        private int min = 0;
 
    //*** Constructors ***
    
    /*****************************************
     * Description: Initialized Constructor
     *
     * Interface:
     *
     *
     * @param y
     * @param x 
     ****************************************/
    public Time(int x, int y) {
        this.sec = y;
        this.min = x;
    } // end Initialized Constructor

    
    //*** Getters ***
    /*****************************************
     * Description: Initialized Constructor
     *
     * Interface:
     *
     * @return 
     * ****************************************/
    public int getSec() {
        return sec;
    }
    /*****************************************
     * Description: Initialized Constructor
     *
     * Interface:
     * 
     * @return  
     ****************************************/
    public int getMin() {
        return min;
    } 
    

    @Override
    public String toString() {
        String st = "";
        st = min + ":" + sec;
        return st;
    }
    
    //*** Setters ***
    /*****************************************
     * Description: Initialized Constructor
     *
     * Interface:
     *
     * @param sec 
     ****************************************/
    public void setSec(int secs ) {
        this.sec = secs;
    }
    /*****************************************
     * Description: Initialized Constructor
     *
     * Interface:
     *
     *
     * @param min 
     ****************************************/
    public void setMin(int mins) {
        this.min = mins;
    }
} // end of public class
