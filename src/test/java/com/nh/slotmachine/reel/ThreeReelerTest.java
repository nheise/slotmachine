package com.nh.slotmachine.reel;

import static com.nh.slotmachine.reel.Symbol.A;
import static com.nh.slotmachine.reel.Symbol.B;
import static com.nh.slotmachine.reel.Symbol.C;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ThreeReelerTest {

	@Test
	void checkSubSelect() {

		ThreeReeler threeReeler = Reels.THREE_REELER.getThreeReeler3FromIndexes(4, 7, 14);

		assertThat(threeReeler.isReel1SymoblAtIndex(A, 0), is(TRUE));
		assertThat(threeReeler.isReel1SymoblAtIndex(B, 0), is(FALSE));
		assertThat(threeReeler.isReel1SymoblAtIndex(C, 0), is(FALSE));
		assertThat(threeReeler.isReel1SymoblAtIndex(C, 1), is(TRUE));
		assertThat(threeReeler.isReel1SymoblAtIndex(A, 2), is(TRUE));

		assertThat(threeReeler.isReel2SymoblAtIndex(C, 0), is(TRUE));
		assertThat(threeReeler.isReel2SymoblAtIndex(B, 1), is(TRUE));
		assertThat(threeReeler.isReel2SymoblAtIndex(C, 2), is(TRUE));

		assertThat(threeReeler.isReel3SymoblAtIndex(C, 0), is(TRUE));
		assertThat(threeReeler.isReel3SymoblAtIndex(A, 1), is(TRUE));
		assertThat(threeReeler.isReel3SymoblAtIndex(C, 2), is(TRUE));
	}

}
