package script.aiofisher.src.com.gotovsi100.tasks.barbarianvillage.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;
import script.aiofisher.src.com.gotovsi100.tasks.enums.FishEnum;


public class BarbVillCloseBank extends Task {

	public BarbVillCloseBank(MethodContext ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean activate() {
		return ctx.backpack.select().id(FishEnum.SALMON.getFishNameID(), FishEnum.TROUT.getFishNameID()).count() == 0 &&  ctx.bank.isOpen()
				&& AreaEnum.BARBARIAN_VILLAGE.getBankArea().contains(ctx.players.local()) ;
	}

	@Override
	public void execute() {
		System.out.println("Closing Bank");
		ctx.bank.close();
	}
	
}
