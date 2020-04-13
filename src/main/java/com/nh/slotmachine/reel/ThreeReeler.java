package com.nh.slotmachine.reel;

public class ThreeReeler {

	private final Reel reel1;
	private final Reel reel2;
	private final Reel reel3;

	public ThreeReeler(Reel reel1, Reel reel2, Reel reel3) {
		this.reel1 = reel1;
		this.reel2 = reel2;
		this.reel3 = reel3;
	}

	public ThreeReeler getThreeReeler3FromIndexes(int reel1StartIndex, int reel2StartIndex, int reel3StartIndex) {
		return new ThreeReeler(reel1.getReel3FromIndex(reel1StartIndex), reel2.getReel3FromIndex(reel2StartIndex),
				reel3.getReel3FromIndex(reel3StartIndex));
	}

	public boolean isReel1SymoblAtIndex(Symbol symbol, int index) {
		return isSymoblAtIndex(reel1, symbol, index);
	}

	public boolean isReel2SymoblAtIndex(Symbol symbol, int index) {
		return isSymoblAtIndex(reel2, symbol, index);
	}

	public boolean isReel3SymoblAtIndex(Symbol symbol, int index) {
		return isSymoblAtIndex(reel3, symbol, index);
	}

	private static boolean isSymoblAtIndex(Reel reel, Symbol symbol, int index) {
		return reel.isSymoblAtIndex(symbol, index);
	}

}
