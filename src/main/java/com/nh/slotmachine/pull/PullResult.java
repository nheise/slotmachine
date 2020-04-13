package com.nh.slotmachine.pull;

import java.util.List;

import com.nh.slotmachine.reel.Symbol;
import com.nh.slotmachine.reel.matcher.ThreeReelMatchResult;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PullResult {

    private Symbol[] reel1;
    private Symbol[] reel2;
    private Symbol[] reel3;
    private List<ThreeReelMatchResult> winlines;

    private int totalCents;

}
