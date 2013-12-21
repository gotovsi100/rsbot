package script.aiofisher.src.com.gotovsi100.tasks.barbarianvillage.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;

public class BarbVillOpenBank extends Task {

	public BarbVillOpenBank(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return AreaEnum.BARBARIAN_VILLAGE.getBankArea().contains(ctx.players.local()) && 
				ctx.backpack.select().count() == 28 && !ctx.bank.isOpen() ;
	}

	@Override
	public void execute() {
		System.out.println("Opening Bank");
		ctx.bank.open();
	}
}
