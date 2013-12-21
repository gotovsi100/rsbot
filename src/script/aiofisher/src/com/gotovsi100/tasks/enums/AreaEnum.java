package script.aiofisher.src.com.gotovsi100.tasks.enums;

import org.powerbot.script.wrappers.Area;
import org.powerbot.script.wrappers.Tile;

public enum AreaEnum {
	
	DRAYNOR(new Area(new Tile(3089, 3221, 0), new Tile(3080, 3237, 0)),
			new Area(new Tile(3092, 3240, 0), new Tile(3096, 3246, 0))),
	
	BARBARIAN_VILLAGE(new Area(new Tile(3100, 3421, 0), new Tile(3114, 3438, 0)), 
			new Area(new Tile(0, 0, 0), new Tile(0, 0, 0)));
	
	Area FishArea;
	Area BankArea;
	
	private AreaEnum(Area FishArea, Area BankArea) {
		this.FishArea = FishArea;
		this.BankArea = BankArea;
	}
	
	public Area getFishArea(){
		return FishArea;
	}
	
	public Area getBankArea(){
		return BankArea;
	}
	
}
