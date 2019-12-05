/********************************************************************
 * Programmer:      sveinson
 * Class:           CS30S
 *
 * Assignment:      Circle OOP example
 *
 * Description:     Circle class, will hold the radius as a property
 *                  will calculate circle dimensions
 ***********************************************************************/

// import libraries as needed here

public class Circle {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    private final double PI = 3.14159;  
    private double radius = 0;        // radius of circle object  
    
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
    * Description: create a new circle object with radius = 0
    * 
    * ****************************************/
      public Circle(){
          radius = 0.0;
      } // end default constructor
      
    /*****************************************
    * Description: create a new circle object with radius = r
    * 
    * Interface:
    * 
    * @param        r: double, it the radius of the circle
    * ****************************************/
      public Circle(double r){
          radius = r;
      } // end initialized constructor
     
    //*** Getters ***
      
    /*****************************************
    * Description:  will return the radius of the circle
    * 
    * Interface:
    * 
    * @return       radius: double, the radius of the circle
    * ****************************************/
      public double getRadius(){
          return this.radius;
      } // end getRadius
      
    /*****************************************
    * Description:  get the area of the circle object
    * 
    * Interface:
    * @return       area: double, the area of the circle
    * ****************************************/
      public double getArea(){
          return Math.pow(radius, 2) * PI;
      } // end getArea
      
    /*****************************************
    * Description:  get the diameter of the circle
    * 
    * Interface:
    * 
    * @return       diameter: double, the diameter of the circle
    * ****************************************/
      public double getDiameter(){
          return this.radius * 2;
      } // end getDiameter
      
    /*****************************************
    * Description: print circle properties
    * 
    * Interface:
    * 
    * @return       String: circle information
    * ****************************************/
      public String toString(){
          String s = "";
          
          s = String.format("%-10s %10.5f %s", "Radius:", radius, "\n");
          s += String.format("%-10s %10.5f %s", "Area:", this.getArea(), "\n");
          s += String.format("%-10s %10.5f %s", "Diameter:", this.getDiameter(), "\n");
          
          return s;
      } // end toString
    
    //*** Setters ***
      
    /*****************************************
    * Description:  set a new value for radius
    * 
    * Interface:
    * 
    * @param        r  double, new radius of circle
    * ****************************************/
      public void setRadius(double r){
          this.radius = r;
      } //end setRadius
    
} // end of public class
