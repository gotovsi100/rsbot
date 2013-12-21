package script.aiofisher.src.com.gotovsi100.tasks.enums;

import org.powerbot.script.wrappers.Area;
import org.powerbot.script.wrappers.Tile;

public enum AreaEnum {
	
	DRAYNOR(new Area(new Tile(3089, 3221, 0), new Tile(3080, 3237, 0)),
			new Area(new Tile(3092, 3240, 0), new Tile(3096, 3246, 0)),
			new Area(new Tile(3077, 3216, 0), new Tile(3109, 3218, 0), new Tile(3102, 3263, 0), new Tile(3074, 3263, 0))),
	
	BARBARIAN_VILLAGE(new Area(new Tile(3100, 3421, 0), new Tile(3114, 3438, 0)), 
			new Area(new Tile(3091, 3488, 0), new Tile(3097, 3499, 0)),
			new Area(new Tile(3120, 3419, 0), new Tile(3084, 3416, 0), new Tile(3077, 3502, 0), new Tile(3110, 3505, 0)));
	
	Area FishArea;
	Area BankArea;
	Area VillageArea;
	
	private AreaEnum(Area FishArea, Area BankArea, Area VillageArea) {
		this.FishArea = FishArea;
		this.BankArea = BankArea;
		this.VillageArea = VillageArea;
	}
	
	public Area getFishArea(){
		return FishArea;
	}
	
	public Area getBankArea(){
		return BankArea;
	}
	
	public Area getVillageArea() {
		return VillageArea;
	}
	
}
