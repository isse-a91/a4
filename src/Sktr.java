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
 
        ArrayList<Time> time = new ArrayList<Time>(9);
       
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
            int actualSize = 0;
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
    public int getId(){
        return this.id;
    } // end getBanner
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
    public int getAvgMins(){
        int avg=0;
        for(int i = 0; i < time.size(); i++){
            avg += ((time.get(i).getMin() * 60) + time.get(i).getSec());
        }
        return avg/60/time.size();
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
        avg = avg/this.getAvgMins();
        return avg%60;
    } // end getBanner 
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/ 
    public double getSpeed(int i){
        double speed = 0.0;
        
        speed = 5.0 / (time.get(i).getMin()*60 + (time.get(i).getSec()));
       
        return speed*3600;
    } // end getBanner
    /*****************************************
    * Description: create a banner string
    * 
    * Interface:
    * 
    * @return       bnr: string, banner for output
    * ****************************************/ 
    public double getAvgSpeed(){
        double speed = 0.0;
        for(int i = 0; i < time.size(); i++){
            speed += getSpeed(i);
        }

        return speed/time.size();
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
    @Override
    public String toString(){
        String s = "";
        
        s = String.format("%-10s %10d %s", "Id:", this.getId(),  "\n");
        s += String.format("%-10s %s", "Race Times and Speed","\n");
        for(int i = 0; i < time.size(); i++){
          s += String.format("%1d %-1s %-1d %10s %-1f %-1s %s", time.get(i).getMin(), ":", time.get(i).getSec(), "Race Speed", getSpeed(i),"km/s","\n");
        }
        s += String.format("%5s %5d %-5s %-5d %s", "Average Time: ", this.getAvgMins(), ":", this.getAvgSecs(),  "\n");
        s += String.format("%5s %5f %-5s %s", "Average Speed: ", this.getAvgSpeed(), "km/s", "\n");
        
        return s;
    } // end getClosingMessage
    
    //*** Setters ***
    
    public void setTime(int x, int y){

        for(int i = 0; i < time.size()-1; i++){
            time.get(i).setMin(time.get(i+1).getMin());
            time.get(i).setSec(time.get(i+1).getSec());
        }
        time.get(time.size()-1).setMin(x);
        time.get(time.size()-1).setSec(y);
    }
    
} // end of public class