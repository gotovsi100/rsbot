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
		
		public static final Tile[] TO_BARB_VILL_BANK = new Tile[] {
				new Tile(3104, 3423, 0),
				new Tile(3104, 3429, 0),
				new Tile(3102, 3434, 0),
				new Tile(3098, 3437, 0),
				new Tile(3097, 3442, 0),
				new Tile(3095, 3448, 0),
				new Tile(3093, 3453, 0),
				new Tile(3092, 3458, 0),
				new Tile(3090, 3462, 0),
				new Tile(3095, 3465, 0),
				new Tile(3099, 3470, 0),
				new Tile(3100, 3474, 0),
				new Tile(3099, 3480, 0),
				new Tile(3100, 3484, 0),
				new Tile(3100, 3486, 0),
				new Tile(3094, 3490, 0)
		};
	
}
