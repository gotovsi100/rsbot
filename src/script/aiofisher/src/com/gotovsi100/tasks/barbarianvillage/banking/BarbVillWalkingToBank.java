package script.aiofisher.src.com.gotovsi100.tasks.barbarianvillage.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.Path;
import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;



public class BarbVillWalkingToBank extends Task {

	public BarbVillWalkingToBank(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return ctx.backpack.select().count() == 28 && !ctx.bank.isOpen() &&
				!AreaEnum.BARBARIAN_VILLAGE.getBankArea().contains(ctx.players.local())
				&& AreaEnum.BARBARIAN_VILLAGE.getVillageArea().contains(ctx.players.local());
	}

	@Override
	public void execute() {
		System.out.println("Walking To Barbarian Village Bank");
		ctx.movement.newTilePath(Path.TO_BARB_VILL_BANK).traverse();
		ctx.game.sleep(1600, 5600);
	}
	
}
