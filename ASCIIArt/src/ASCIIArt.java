/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

public class ASCIIArt {

	public static void main(String[] args) {
		steam ();
		System.out.println(".--------------------.");
		mugTop ();
		mugSide ();
		System.out.println("| /\\Cool Hot Choco\\/ |__");
		middleHandle ();
		middleHandle ();
		System.out.println("|                    |__]");
		mugSide ();
		mugSide ();
		mugSide ();
		mugTop ();
	}

	public static void steam () {
		//Steam above the Hot chocolate mug
		System.out.println("  (");
		System.out.println("   )        (");
		System.out.println("             )     )");
		System.out.println("       )          (");
		System.out.println("      (");
	}
	
	public static void middleHandle () {
		//needed for the middle of the handle
		System.out.println("|                    |  ]");
	}
	
	public static void mugSide () {
		//sides of mug without the handle
		System.out.println("|                    |");
		
	}
	public static void mugTop () {
		//for the top and the bottom of mug
		System.out.println("\"--------------------\"");
	}
	
}