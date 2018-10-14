/** Program: Player Class
* File: Player.java 
* Summary: Component of the NFL final project that hold players attributes.
* Author: Lyric Payton
* Date: October 7, 2018
**/



public class Player
{
	private String name;
	private int number;
	private String team;
	private int height;
	private int weight;
	private String position;
	private int wins;
	private int loses;
	private String conference;
	private int netpoints;
	
	//default constructor 
	public Player ()
	{
		this.name = "";
		this.number = 0;
		this.team = "";
		this.height = 0;
		this.weight = 0;
		this.position = "";
		this.wins = 0;
		this.loses = 0;
		this.conference = "";
		this.netpoints = 0;
		
		
	}
	//non default constructor

	public Player(String name, int number, String team, int height, int weight, String position, int wins, int loses,
			String conference, int netpoints) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.height = height;
		this.weight = weight;
		this.position = position;
		this.wins = wins;
		this.loses = loses;
		this.conference = conference;
		this.netpoints = netpoints;
	}

	@Override
	//toString
	public String toString() {
		return "Player name:" + name + ", number:" + number + ", team:" + team + ", height:" + height + ", weight:"
				+ weight + ", position:" + position + ", wins:" + wins + ", loses:" + loses + ", conference:"
				+ conference + ", netpoints:" + netpoints ;
	}
	//getters and setter access information else where 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public int getNetpoints() {
		return netpoints;
	}

	public void setNetpoints(int netpoints) {
		this.netpoints = netpoints;
	}
		
}