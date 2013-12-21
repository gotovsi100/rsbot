package script.aiofisher.src.com.gotovsi100.tasks.draynor.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.tasks.Task;



public class DraynorBank extends Task {

	public DraynorBank(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return ctx.bank.isOpen() && ctx.backpack.select().count() == 28 ;
	}

	@Override
	public void execute() {
		System.out.println("Depositing all items in Inventory");
		ctx.bank.depositInventory();
	}
	
}
