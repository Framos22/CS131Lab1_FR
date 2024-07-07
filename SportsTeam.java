
public abstract class SportsTeam {
	
	private String teamName;
	private String teamMascot;
	private String headCoach;
	private int wins;
	private int losses;
	
	public SportsTeam() {
		this.teamName = "";
		this.teamMascot ="";
		this.headCoach ="";
		this.wins = 0;
		this.losses = 0;
	}
	
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins =0;
		this.wins = 0;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamMasot() {
		return teamMascot;
	}
	public void setTeamMasot(String teamMasot) {
		this.teamMascot = teamMasot;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	public double getWinPercentage() {
		
		return (double) wins / (wins + losses);
	}
	
	public abstract double[] getStats();
		
	
	
	
}


