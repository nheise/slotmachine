package com.nh.slotmachine.reel.matcher;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ThreeReelMatchResultHelperTest {

	@Test
	void testFilterAllWinners() {
		List<ThreeReelMatchResult> filteredResults = ThreeReelMatchResultHelper.filterAllWinners(createTestData());

		assertThat(filteredResults.size(), is(3));
	}

	@Test
	void testSumUpWinCents() {
		int totalCents = ThreeReelMatchResultHelper.sumUpWinCents(createTestData());

		assertThat(totalCents, is(65));
	}

	private static List<ThreeReelMatchResult> createTestData() {
		List<ThreeReelMatchResult> results = new ArrayList<>();

		results.add(new ThreeReelMatchResult(true, "", 10));
		results.add(new ThreeReelMatchResult(true, "", 15));
		results.add(new ThreeReelMatchResult(false, "", 10));
		results.add(new ThreeReelMatchResult(true, "", 20));
		results.add(new ThreeReelMatchResult(false, "", 10));

		return results;
	}

}
