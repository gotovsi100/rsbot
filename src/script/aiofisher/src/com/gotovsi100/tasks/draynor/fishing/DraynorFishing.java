package script.aiofisher.src.com.gotovsi100.tasks.draynor.fishing;

import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.wrappers.Npc;

import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;
import script.aiofisher.src.com.gotovsi100.tasks.enums.FishSpotEnum;

public class DraynorFishing extends Task {

	public DraynorFishing(MethodContext ctx) {
		super(ctx);
	}
	
	@Override
	public boolean activate() {
		return ctx.backpack.select().count() != 28  && AreaEnum.DRAYNOR.getFishArea().contains(ctx.players.local()) ;
		}

	@Override
	public void execute() {
			if (ctx.players.local().getAnimation() == -1) {
				for (final Npc SchrimpSpot : ctx.npcs.select().id(FishSpotEnum.SCHRIMP_SPOT.getFishSpotID()).nearest().first()){
		if (!SchrimpSpot.isOnScreen() ) {
			System.out.println("Fishing Spot is not visible, turning camera to fishing spot");
			ctx.camera.turnTo(SchrimpSpot);
			} else if (SchrimpSpot.isOnScreen()) {
				System.out.println("Clicking Fishing Spot");
			SchrimpSpot.interact("Net");
			ctx.game.sleep(1500, 3900);
		}
				}
			} else {
				System.out.println("Fishing...");
				ctx.game.sleep(2400, 7500);
			}
		
	}
	
	@Override
	public int priority() {
	return 1;
	}
	
}
