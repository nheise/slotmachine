package com.nh.slotmachine.reel.matcher;

import com.nh.slotmachine.reel.Symbol;
import com.nh.slotmachine.reel.ThreeReeler;

public class ThreeReelMatcher {

    private final int reel1Index;
    private final int reel2Index;
    private final int reel3Index;

    private final String description;
    private final Symbol matchingSymbol;
    private final int winCents;

    public ThreeReelMatcher(int reel1Index, int reel2Index, int reel3Index, String description, Symbol matchingSymbol,
            int winCents) {
        this.reel1Index = reel1Index;
        this.reel2Index = reel2Index;
        this.reel3Index = reel3Index;
        this.description = description;
        this.matchingSymbol = matchingSymbol;
        this.winCents = winCents;
    }

    public ThreeReelMatchResult match(ThreeReeler threeReeler) {
        if (threeReeler.isReel1SymoblAtIndex(matchingSymbol, reel1Index)
                && threeReeler.isReel2SymoblAtIndex(matchingSymbol, reel2Index)
                && threeReeler.isReel3SymoblAtIndex(matchingSymbol, reel3Index)) {
            return new ThreeReelMatchResult(true, description, winCents);

        } else {
            return new ThreeReelMatchResult(false, description, 0);
        }
    }

}
