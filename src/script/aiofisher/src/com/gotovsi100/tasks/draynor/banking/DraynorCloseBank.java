package script.aiofisher.src.com.gotovsi100.tasks.draynor.banking;

import org.powerbot.script.methods.MethodContext;

import script.aiofisher.src.com.gotovsi100.tasks.Task;


public class DraynorCloseBank extends Task {

	public DraynorCloseBank(MethodContext ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean activate() {
		return ctx.backpack.select().count() != 28 && ctx.bank.isOpen() ;
	}

	@Override
	public void execute() {
		System.out.println("Closing Bank");
		ctx.bank.close();
	}
	
}
