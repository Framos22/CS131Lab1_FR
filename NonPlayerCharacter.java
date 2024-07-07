import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	NonPlayerCharacter(){
		super();
		active = false;
		intelligenceType = "AVERAGE";
	}//End empty-argument constructor
	
	NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType){
		super();
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
		
	}//preferred constructor
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getIntelligenceType() {
		return intelligenceType;
	}
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	
	public String reportStructure(){
        StringBuilder sb = new StringBuilder(super.reportStructure());
        sb.append(String.format("	Active: %s\n", active));
        sb.append(String.format("	Intelligence: %s\n", intelligenceType));
        sb.append("==================================\n");
        return sb.toString();
	}
	
	public String introduce() {
        return "Hello, my name is  " + getUniqueID();
	}
        
        public String exclaim() {
	        String[] exclamations = {
	            "Dag Gummit",
	            "Doggone it",
	            "Holy cow",
	            "Jeez",
	            "Well cheese and crackers"
	        };
	        Random random = new Random();
	        return exclamations[random.nextInt(exclamations.length)];
}

	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", uniqueID="
				+ uniqueID + ", personality=" + personality + "]";
	}
	
	
	

}//end class
