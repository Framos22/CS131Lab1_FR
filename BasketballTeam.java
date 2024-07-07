
public class BasketballTeam extends SportsTeam{
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
        super();
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }
	
	public int getFieldGoals() {
		return fieldGoals;
	}
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}
	public int getFreeThrows() {
		return freeThrows;
	}
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
	
	public double fieldGoalPercentage() {
        if (fieldGoalsAttempted == 0) {
            return 0;
        }
        return (double) fieldGoals / fieldGoalsAttempted;
    }
	
	public double freeThrowPercentage() {
        if (freeThrowsAttempted == 0) {
            return 0;
        }
        return (double) freeThrows / freeThrowsAttempted;
    }

    public double[] getStats() {
        double[] stats = new double[3];
        stats[0] = getWinPercentage();
        stats[1] = fieldGoalPercentage();
        stats[2] = freeThrowPercentage();
        return stats;
    }

    public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
        setFieldGoals(fieldGoals);
        setFieldGoalsAttempted(fieldGoalsAttempted);
        setFreeThrows(freeThrows);
        setFreeThrowsAttempted(freeThrowsAttempted);
    }


}
