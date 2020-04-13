package com.nh.slotmachine.reel.matcher;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class ThreeReelMatchResultHelper {

	public static List<ThreeReelMatchResult> filterAllWinners(List<ThreeReelMatchResult> results) {
		return results.stream().filter(ThreeReelMatchResult::isWinner).collect(toList());
	}

	public static int sumUpWinCents(List<ThreeReelMatchResult> results) {
		return results.stream().mapToInt(ThreeReelMatchResult::getWinCents).sum();
	}

}
