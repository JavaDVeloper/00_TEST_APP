package com.barpiotr.MyFirstMavenApp;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 * author: Piotr Bar;
 * Created: 2018-Feb-18
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App anApp = new App();
    }
    
    //DATA
    //.................
    //declare object
    private Scanner someInput;
    private Date today;
    
    //constructor
    public App() {
    	//initializes variables
    
    	//create objects
    	this.someInput = new Scanner(System.in);
    	
    	//starting method
    	sayHi();
    	
    	//pause before exit (this is only useful when an error occurs)
    	System.out.println("\n Press enter to exit the program");
    	this.someInput.nextLine();
    	
    	//close the program without error
    	System.exit(0);
    }
    
    private void sayHi() {
    	this.today = new Date();
    	System.out.println("App says Hi at "+today);
    }
}//EOM
