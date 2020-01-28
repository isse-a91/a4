
import java.util.ArrayList;
import java.util.logging.Logger;

/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: a4
 *
 * Description: Sub-class to hold skater time
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
     * Description: return seconds
     *
     * Interface:
     *
     * @return sec: int seconds
     * ****************************************/
    public int getSec() {
        return sec;
    }
    /*****************************************
     * Description: return mins
     *
     * Interface:
     * 
     * @return min: int minutes
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
     * Description: Update secs of skater
     *
     * Interface:
     *
     * @param   sec: int seconds 
     ****************************************/
    public void setSec(int secs ) {
        this.sec = secs;
    }
    /*****************************************
     * Description: update mins of skater
     *
     * Interface:
     *
     *
     * @param   min: int minutes
     ****************************************/
    public void setMin(int mins) {
        this.min = mins;
    }
} // end of public class
