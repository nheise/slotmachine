package com.nh.slotmachine.pull;

import static com.nh.slotmachine.reel.matcher.ThreeReelMatchResultHelper.sumUpWinCents;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.nh.slotmachine.reel.Reels;
import com.nh.slotmachine.reel.ThreeReeler;
import com.nh.slotmachine.reel.matcher.ThreeReelMatchResult;
import com.nh.slotmachine.reel.matcher.ThreeReelMatchers;

@Service
public class PullService {

    private static final int UPPER_RANDOM_LIMIT = 99;

    public PullResult pull() {

        PullResult pullResult = new PullResult();

        int randomReel1Index = getRandomInt();
        int randomReel2Index = getRandomInt();
        int randomReel3Index = getRandomInt();

        ThreeReeler reel = getRandomizedThreeReel(randomReel1Index, randomReel2Index, randomReel3Index);

        pullResult.setReel1(reel.getReel1());
        pullResult.setReel2(reel.getReel2());
        pullResult.setReel3(reel.getReel3());

        List<ThreeReelMatchResult> allWinnerResults = matchAllMatcherAndFilterAllWinners(reel);

        pullResult.setWinlines(allWinnerResults);
        pullResult.setTotalCents(sumUpWinCents(allWinnerResults));

        return pullResult;
    }

    private List<ThreeReelMatchResult> matchAllMatcherAndFilterAllWinners(ThreeReeler reel) {
        return ThreeReelMatchers.ALL_MATCHERS.stream().map(matcher -> matcher.match(reel))
                .filter(ThreeReelMatchResult::isWinner).collect(toList());
    }

    private ThreeReeler getRandomizedThreeReel(int randomReel1Index, int randomReel2Index, int randomReel3Index) {
        return Reels.THREE_REELER.getThreeReeler3FromIndexes(randomReel1Index, randomReel2Index, randomReel3Index);
    }

    private int getRandomInt() {
        return new Random().nextInt(UPPER_RANDOM_LIMIT);
    }

}
