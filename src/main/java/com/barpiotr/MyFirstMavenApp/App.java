package com.barpiotr.MyFirstMavenApp;

import java.util.Date;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*********************************************************************
 * Hello world!
 * author: Piotr Bar;
 * Created: 2018-Feb-22
 * 
 * The purpose of this application is to provide an example for the following:
 * 
 * - Demonstrate the use of development tools: GIT, MAVEN, ECLIPSE;
 * - Demonstrate how to use Eclipse;
 * - Provide a refresher of OOP in Java;
 * - Provide an introduction to project file structure layout - MAVEN Archetype;
 * - Show how to set up Log4j2;
 *
 *****************************************************/
public class App {
	
    public static void main( String[] args ) {
    	//to view the arguments being entered
        seeCommandlineInput(args);
        
        //to instantiate App class based in the parameters entered at the commandline
        actionCommandlineInput(args);
     
    }
    
    //DATA
    //.................
    //define attributes
    
    private Scanner someInput;
    private Date today;
    
    
    // This is added to every class that needs to log with one change
    // The getLogger() part should contain the name of the class it's in
    private static Logger LOG;
    
    //CONSTRUCTORS
    //...................................................
    
    public App() {
    	
    	//associate logging with this class so know the messages that came from objects of this class
    	
    	LOG=LogManager.getLogger(App.class);
    	
    	//test the logging
    	testLogOutput();
    	
    	this.someInput = new Scanner(System.in);
    	
    	//do something here
    	System.out.println(" \n Soon... stuff will happen here.");;
    	
    	//pause before exit (this is only useful if an error occurs)
    	System.out.println(" \n Press enter to exit the program");
    	this.someInput.nextLine();
    	
    	//close the program without error
    	System.exit(0);
    }
    	
    	//METHODS used by main() or debug methods - note they are static methods
    	//......................................................
    
    	/*
    	 * action the arguments presented at the command line
    	 * instantiate the App class based on the arguments passed
    	 */
    
    	private static void actionCommandlineInput(String args[]) {
    		
    		//no special instantion yet as don't pass args to it
    		App anApp = new App();
    	}
    	
    	/*
    	 * View the arguments presented at the command line
    	 * this is for debug and demo purposes
    	 */
    	
    	private static void seeCommandlineInput(String args[]) {
    		if (args.length==0) {
    			System.out.println("There were no commandline arguments passed!");
    		}
    		else {
    			//display the command line entered
    			for (int i=0; i<args.length; i++) {
    				System.out.println(args[i]);
    			}
    		}
    	}

	/*
	 * Test the Log4j2 logging
	 */
    private static void testLogOutput() {
    	
    	LOG.debug("Log test: Test printed on debug");
    	LOG.info("Log test: Test printed on info");
    	LOG.warn("Log test: Test printed on warn");
    	LOG.error("Log test: Test printed on error");
    	LOG.fatal("Log test: Test printed on fatal");
    	
    	LOG.info("Appending string: {}.", "Application log test message - Hi");
    }
}
