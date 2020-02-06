/********************************************************************
 * Programmer:	Ayub Isse
 * Class:  CS30S
 *
 * Assignment: a4
 *
 * Description: Class to calculate properties of a skater
 ***********************************************************************/

// import libraries as needed here
import java.util.ArrayList;

public class Sktr {
    //*** Class Variables ***
        public static int nextID = 1000;
    //*** Instance Variables ***    
     
        private int id = 0;                 // variable for id of employees
 
        ArrayList<Time> time = new ArrayList<Time>(9); //arraylist for times
       
    //*** Constructors ***

    /*****************************************
    * Description: Default constructor for skater
    * 
    * ****************************************/
    public Sktr(){
        id = nextID++;              // set custom id
    } // end Default constructor
    /*****************************************
    * Description: Initialized Constructor for skater which loads data into arraylist which loads data into data class
    * 
    * Interface:
    * 
    * ****************************************/
    public Sktr(String[] t){
        id = nextID++;              // set custom id
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < t.length; i += 2){     
            int actualSize = 0;
            x = Integer.parseInt(t[i]);
            y = Integer.parseInt(t[i + 1]);
            time.add(new Time(x, y));
        } // end for
    } // end Initialized Constructor 

    //*** Getters ***
    /*****************************************
    * Description: return id
    * 
    * Interface:
    * 
    * ****************************************/ 
    public int getId(){
        return this.id;
    } // end getBanner
    /*****************************************
    * Description: return a time 
    * 
    * Interface:
    * 
    * ****************************************/ 
    public String getTime(int i){
        return this.time.get(i).toString();
    } // end getBanner
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/ 
    public int getAvgMins(){
        int avg=0;
        for(int i = 0; i < time.size(); i++){
            avg += ((time.get(i).getMin() * 60) + time.get(i).getSec());
        }
        avg = avg / 60;
        avg = avg / time.size();
        return avg;
    } // end getBanner
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/ 
    public int getAvgSecs(){
        int avg = 0;
        for(int i = 0; i < time.size(); i++){
            avg += time.get(i).getMin() * 60;
            avg += time.get(i).getSec();
        }
        avg = avg/time.size();
        avg = avg%60;
        return avg;
    } // end getBanner 
    /*****************************************
    * Description: get individual speed
    * 
    * Interface:
    * 
    * @param        i: int, number that tells which time to access in array
    * @return       speed: double, speed in km/hr
    * ****************************************/ 
    public double getSpeed(int i){
        double speed;
        
        speed = 5.0 / (time.get(i).getMin()*60 + (time.get(i).getSec()));
       
        return speed*3600;
    } // end getBanner
    /*****************************************
    * Description: get avg speed using individual speed
    * 
    * Interface:
    * 
    * @return       speed: double: avg speed
    * ****************************************/ 
    public double getAvgSpeed(){
        double speed = 0.0;
        for(int i = 0; i < time.size(); i++){
            speed += getSpeed(i);
        }

        return speed/time.size();
    } // end getBanner 

    /*****************************************
    * Description:  create and return output 
    * 
    * Interface:
    * 
    * @return    s string: holds and returns output
    ****************************************/
    @Override
    public String toString(){
        String s = "";
        
        s = String.format("%-10s %10d %s", "Id:", this.getId(),  "\n");
        s += String.format("%-10s %s", "Race Times and Speed","\n");
        for(int i = 0; i < time.size(); i++){
          s += String.format("%01d:%02d %-10s %-1f %-1s %s", time.get(i).getMin(), time.get(i).getSec(), "Race Speed", getSpeed(i),"km/hr","\n");
        }
        s += String.format("%5s %02d:%02d %s", "Average Time: ", this.getAvgMins(), this.getAvgSecs(),  "\n");
        s += String.format("%5s %5f %-5s %s", "Average Speed: ", this.getAvgSpeed(), "km/hr", "\n");
        
        return s;
    } // end getClosingMessage
    
    //*** Setters ***
    /*****************************************
    * Description:  Update minutes seconds deleting the 1st number, 
    *               moving everything down then putting new number 9th position
    * 
    * Interface:
    * 
    * @param     x int: mins
    * @param     y int: seconds
    * @return    s string: holds and returns output
    ****************************************/
    public void setTime(int x, int y){

        for(int i = 0; i < time.size()-1; i++){
            time.get(i).setMin(time.get(i+1).getMin());
            time.get(i).setSec(time.get(i+1).getSec());
        }
        time.get(time.size()-1).setMin(x);
        time.get(time.size()-1).setSec(y);
        System.out.println("Indivual time:  " + time.get(time.size()-1));
    }
    
} // end of public class