package com.nh.slotmachine.reel.matcher;

import java.util.List;

public class ThreeReelMatchResultHelper {

    public static int sumUpWinCents(List<ThreeReelMatchResult> results) {
        return results.stream().mapToInt(ThreeReelMatchResult::getWinCents).sum();
    }

}
