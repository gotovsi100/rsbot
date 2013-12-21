package script.aiofisher.src.com.gotovsi100.tasks.draynor.fishing;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.Path;
import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;



public class WalkingToDraynorFishArea extends Task {

	public WalkingToDraynorFishArea(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return !AreaEnum.DRAYNOR.getFishArea().contains(ctx.players.local()) && 
				ctx.backpack.select().count() != 28 && !ctx.bank.isOpen();
	}

	@Override
	public void execute() {
		System.out.println("Walking to Fish Area");
		ctx.movement.newTilePath(Path.TO_DRAYNOR_BANK).reverse().traverse();
		ctx.game.sleep(1600, 5600);
	}
}
