package script.aiofisher.src.com.gotovsi100.tasks.barbarianvillage.fishing;

import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.wrappers.Npc;

import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.enums.AreaEnum;
import script.aiofisher.src.com.gotovsi100.tasks.enums.FishSpotEnum;

public class BarbVillFishing extends Task {

	public BarbVillFishing(MethodContext ctx) {
		super(ctx);
	}
	
	@Override
	public boolean activate() {
		return ctx.backpack.select().count() != 28  && AreaEnum.BARBARIAN_VILLAGE.getFishArea().contains(ctx.players.local()) ;
		}

	@Override
	public void execute() {
			if (ctx.players.local().getAnimation() == -1) {
				for (final Npc FishingSpot : ctx.npcs.select().id(FishSpotEnum.TROUT_SALMON_SPOT.getFishSpotID()).nearest().first()){
		if (!FishingSpot.isOnScreen() ) {
			System.out.println("Fishing Spot is not visible, turning camera to fishing spot");
			ctx.camera.turnTo(FishingSpot);
			} else if (FishingSpot.isOnScreen()) {
				System.out.println("Clicking Fishing Spot");
				FishingSpot.interact("Lure");
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
