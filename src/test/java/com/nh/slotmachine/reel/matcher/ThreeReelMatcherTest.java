package com.nh.slotmachine.reel.matcher;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import com.nh.slotmachine.reel.Reels;
import com.nh.slotmachine.reel.ThreeReeler;

class ThreeReelMatcherTest {

	@Test
	void testMatchTheInTheFirstRow() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(2, 2, 2);

		ThreeReelMatchResult result = ThreeReelMatchers.AAA_1_ROW.match(threeReeler);

		assertThat(result.isWinner(), is(TRUE));
		assertThat(result.getWinCents(), is(10));
		assertThat(result.getDescription(), is("3 times a A in the first row"));
	}

	@Test
	void testNoMatchTheInTheFirstRow() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(2, 1, 2);

		ThreeReelMatchResult result = ThreeReelMatchers.AAA_1_ROW.match(threeReeler);

		assertThat(result.isWinner(), is(FALSE));
		assertThat(result.getWinCents(), is(0));
		assertThat(result.getDescription(), is("3 times a A in the first row"));
	}

	@Test
	void testMatchTheInTheSecondRow() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(0, 0, 6);

		ThreeReelMatchResult result = ThreeReelMatchers.CCC_2_ROW.match(threeReeler);

		assertThat(result.isWinner(), is(TRUE));
		assertThat(result.getWinCents(), is(20));
		assertThat(result.getDescription(), is("3 times a C in the second row"));
	}

	@Test
	void testMatchTheInTheThirdRow() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(5, 1, 7);

		ThreeReelMatchResult result = ThreeReelMatchers.BBB_3_ROW.match(threeReeler);

		assertThat(result.isWinner(), is(TRUE));
		assertThat(result.getWinCents(), is(15));
		assertThat(result.getDescription(), is("3 times a B in the third row"));
	}

	@Test
	void testMatchDiagonalTopToBottom() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(0, 1, 0);

		ThreeReelMatchResult result = ThreeReelMatchers.AAA_DIA_TB_ROW.match(threeReeler);

		assertThat(result.isWinner(), is(TRUE));
		assertThat(result.getWinCents(), is(10));
		assertThat(result.getDescription(), is("3 times a A diagonal from top to bottom"));
	}

	@Test
	void testMatchDiagonalBottomToTop() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(14, 5, 15);

		ThreeReelMatchResult result = ThreeReelMatchers.AAA_DIA_BT_ROW.match(threeReeler);

		assertThat(result.isWinner(), is(TRUE));
		assertThat(result.getWinCents(), is(10));
		assertThat(result.getDescription(), is("3 times a A diagonal from bottom to top"));
	}

}
