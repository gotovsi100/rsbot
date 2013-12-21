package script.aiofisher.src.com.gotovsi100.tasks.barbarianvillage.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;
import script.aiofisher.src.com.gotovsi100.tasks.enums.FishEnum;



public class BarbVillBank extends Task {

	public BarbVillBank(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return ctx.bank.isOpen() && 
				ctx.backpack.select().id(FishEnum.SALMON.getFishNameID(), FishEnum.TROUT.getFishNameID()).count() > 0 
				&& AreaEnum.BARBARIAN_VILLAGE.getBankArea().contains(ctx.players.local()) ;
	}

	@Override
	public void execute() {
		System.out.println("Depositing all fish except Feathers ;p");
		if (ctx.backpack.select().id(FishEnum.SALMON.getFishNameID()).count() > 0) {
			System.out.println("Depositing all Salmon");
			ctx.bank.deposit(FishEnum.SALMON.getFishNameID(), 0);
		} else if (ctx.backpack.select().id(FishEnum.TROUT.getFishNameID()).count() > 0) {
			System.out.println("Depositing all Trout");
			ctx.bank.deposit(FishEnum.TROUT.getFishNameID(), 0);
		}
	}
	
}
