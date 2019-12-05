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
        
    //*** Instance Variables ***    
     
        private String strin = "";                                      // string data input from keyboard
        
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
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    public Emp(){
        
    }
    
    
    
    //*** Getters ***
    /*****************************************
    * Description: Gets employee data from txt file
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    public static int getData(){
        strin = fin.readLine();
        while(strin != null){  
            //System.out.println(strin);
            
            = Double.parseDouble(strin);     // putting input intp array
  
                strin = fin.readLine();                         // loop update
            } // loop to get input and put into a list
            return
    } //  end getIntInput
        }
    }
    
    
    //*** Setters ***
    
} // end of public class
