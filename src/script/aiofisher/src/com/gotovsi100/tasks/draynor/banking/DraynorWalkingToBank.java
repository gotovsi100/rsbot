package script.aiofisher.src.com.gotovsi100.tasks.draynor.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.Path;
import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;



public class DraynorWalkingToBank extends Task {

	public DraynorWalkingToBank(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return ctx.backpack.select().count() == 28 && !ctx.bank.isOpen() &&
				!AreaEnum.DRAYNOR.getBankArea().contains(ctx.players.local())
						&& AreaEnum.DRAYNOR.getVillageArea().contains(ctx.players.local());
	}

	@Override
	public void execute() {
		System.out.println("Walking To Draynor Bank");
		ctx.movement.newTilePath(Path.TO_DRAYNOR_BANK).traverse();
		ctx.game.sleep(1600, 5600);
	}
	
}
