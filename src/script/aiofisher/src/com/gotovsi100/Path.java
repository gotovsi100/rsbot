package script.aiofisher.src.com.gotovsi100;

import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.wrappers.Tile;

public class Path {
	
	public static void setContext(MethodContext c) {
		ctx = c;
		}

		public static MethodContext ctx;
		
		public static final Tile[] TO_DRAYNOR_BANK = new Tile[] {
				new Tile(3088, 3226, 0),
				new Tile(3088, 3231, 0),
				new Tile(3087, 3236, 0),
				new Tile(3086, 3242, 0),
				new Tile(3091, 3243, 0)
		};
	
}
