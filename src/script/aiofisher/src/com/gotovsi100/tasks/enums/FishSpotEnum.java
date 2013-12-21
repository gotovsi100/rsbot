package script.aiofisher.src.com.gotovsi100.tasks.enums;

public enum FishSpotEnum {
	
	SCHRIMP_SPOT(327),
	
	TROUT_SPOT(328);
	
   int FishingSpotID;
	
	private FishSpotEnum(int FishingSpotID) {
		this.FishingSpotID = FishingSpotID;
	}
	
	public int getFishSpotID() {
		return FishingSpotID;
	}
	
}
