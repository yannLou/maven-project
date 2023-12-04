package com.example;


import java.lang.Math;
import java.io.* ;

/**
* this is a Class
*/

public class Greeter {

 
  /**
  * this in contructor
  */
 
  public Greeter() {

  }
  
  public void fct01() { 
   // un commentaire
  }
  

 public void fct02() { 
  }
  
 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
   
 }
}
