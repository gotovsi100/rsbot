package script.aiofisher.src.com.gotovsi100.tasks.enums;

public enum FishEnum {
	
	//From level 1 to level 20
	SCHRIMP(317),
	ANCHOVIES(321),
	//From Level 20 to 99
	TROUT(335),
	SALMON(331);
	
	int FishNameID;
	String FishingSpotName;
	
	  private FishEnum(int FishNameID){
        this.FishNameID = FishNameID;
}
	
    public int getFishNameID(){
        return FishNameID;
}
    
}
