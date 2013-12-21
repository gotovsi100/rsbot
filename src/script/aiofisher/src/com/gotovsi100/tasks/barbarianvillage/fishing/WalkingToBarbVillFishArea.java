package script.aiofisher.src.com.gotovsi100.tasks.barbarianvillage.fishing;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.Path;
import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;



public class WalkingToBarbVillFishArea extends Task {

	public WalkingToBarbVillFishArea(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return !AreaEnum.BARBARIAN_VILLAGE.getFishArea().contains(ctx.players.local()) && 
				ctx.backpack.select().count() != 28 && !ctx.bank.isOpen()
						&& AreaEnum.BARBARIAN_VILLAGE.getVillageArea().contains(ctx.players.local()) ;
	}

	@Override
	public void execute() {
		System.out.println("Walking to Fish Area");
		ctx.movement.newTilePath(Path.TO_BARB_VILL_BANK).reverse().traverse();
		ctx.game.sleep(1600, 5600);
	}
}
