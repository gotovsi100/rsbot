package script.aiofisher.src.com.gotovsi100;

import java.awt.Color;
import java.awt.Graphics;

import org.powerbot.event.MessageEvent;
import org.powerbot.event.MessageListener;
import org.powerbot.event.PaintListener;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;
import org.powerbot.script.util.Random;


import script.aiofisher.src.com.gotovsi100.tasks.Task;
import script.aiofisher.src.com.gotovsi100.tasks.TaskContainer;
import script.aiofisher.src.com.gotovsi100.tasks.draynor.banking.DraynorBank;
import script.aiofisher.src.com.gotovsi100.tasks.draynor.banking.DraynorCloseBank;
import script.aiofisher.src.com.gotovsi100.tasks.draynor.banking.DraynorOpenBank;
import script.aiofisher.src.com.gotovsi100.tasks.draynor.banking.DraynorWalkingToBank;
import script.aiofisher.src.com.gotovsi100.tasks.draynor.fishing.DraynorFishing;
import script.aiofisher.src.com.gotovsi100.tasks.draynor.fishing.WalkingToDraynorFishArea;
import utilities.Format;



@Manifest(description = "F2P Powerfisher Fishing at Draynor Schrimps and at Barbarian Village Fly Fishing for fast fishing exp", name = "F2P PowerFisher")
public class PowerFisher extends PollingScript implements PaintListener,  MessageListener {
	
	int FishCatched;
	
	@Override
	public void start() {
		Path.setContext(ctx);
	container = new TaskContainer();
	container.submit(new DraynorFishing(ctx), new DraynorBank(ctx),
			new DraynorCloseBank(ctx), new DraynorOpenBank(ctx),
			new DraynorWalkingToBank(ctx), new WalkingToDraynorFishArea(ctx) );
	}

	public long startTime = System.currentTimeMillis();

	private TaskContainer container = null;
	
	@Override
	public int poll(){
	final Task task = container.get();
	if (task != null) {
		task.execute();
	return task.delay();
	}
	return(Random.nextInt(650, 800));
	}

	@Override
	public void repaint(Graphics g) {
		        g.setColor(Color.ORANGE);
		        double FishPerSec = FishCatched/(double)(getRuntime()/1000);
		       // int profit = clay * price;
		       // double profitPerSec = profit/(double)(script.getRuntime()/1000);
		        g.drawString("Timer: "+ Format.time(getRuntime()), 100,150);
		        g.drawString("Fish Catched: " + FishCatched ,100,130);
		        g.drawString("Fish/Hr: "+(int) Math.round(FishPerSec*3600), 100, 170);
		        //g.drawString("Trips: "+trips);
		        //g.drawString("Trips/Hr: "+(int) Math.round(tripsPerSec*3600));
		        //g.drawString("Profit: "+Format.toK(profit));
		        //g.drawString("Profit/Hr: "+Format.toK((int) Math.round(profitPerSec*3600)));
		        //g.drawString("Status: " +getStatus());

		    }

	@Override
	public void messaged(MessageEvent arg0) {
		if(arg0.getMessage().contains("You catch")){
        	FishCatched ++;
        }
	}
}
	

