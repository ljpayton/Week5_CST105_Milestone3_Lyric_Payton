/** Program: Manager Class
* File: Manager.java 
* Summary: Component of the NFL final project that hold players attributes.
* Author: Lyric Payton
* Date: October 7, 2018
**/
import java.util.*; 

public class ManagerClass {
//should create array
	static ArrayList<Player> roster = new ArrayList<Player>();
	
	public static void main(String[] args) {   
	
		ManagerClass myManager = new ManagerClass(roster);
		System.out.println(myManager);  //Displays the list of players from the toString method	 
	}
	
	public ManagerClass(ArrayList<Player> myTeam) {  
		//Constructor of the PlayerManager
		createPlayers(); //calls the createPlayers method
		myTeam = roster;
	}
	
	private static void createPlayers() {  
		//hard coded players
		Player ryan = new Player("Allen Ryan", 6, "NE Patriots", 74, 220, "Punter", 3, 2, "AFC East", 26);
		roster.add(ryan);
		Player allen = new Player("Dewayne Allen",83,"NE Patriots", 75, 265,"TightEnd", 3, 2, "AFC East", 25);
		roster.add(allen);
		Player da = new Player("David Andrews", 60, "NE Patriots", 75, 300, "LineBacker", 3, 2, "AFC East", 23);
		roster.add(da);
		Player bb = new Player("Braxton Berrios", 51, "NE Patriots", 69, 190, "Wide Receiver", 3, 2, "AFC East", 21);
		roster.add(bb);
		Player tb = new Player("Tom Brday", 12, "NE Patriots", 76, 225, "Quarter Back", 3, 2, "AFC East", 17);
		roster.add(tb);
		Player bt = new Player("Trent Brown", 77, "NE Patriots", 80, 380, "Outside Tackle", 3, 2, "AFC East", 19);
		roster.add(bt);
		Player mc = new Player("Marcus Cannon", 61, "NE Patriots", 78, 335, "Outside Tackle", 3, 2, "AFC East", 6);
		roster.add(mc);
		
	}

	public String toString() { 
		//the toString method
		String teamList = "";
		for(int i = 0; i< roster.size();i++)
		teamList += roster.get(i) + "\n"; // iterates over array and displays players w/ indents
		return teamList;
	}

}