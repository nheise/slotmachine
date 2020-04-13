package com.nh.slotmachine.reel;

import static com.nh.slotmachine.reel.Symbol.A;
import static com.nh.slotmachine.reel.Symbol.B;
import static com.nh.slotmachine.reel.Symbol.C;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ReelTest {

	@Test
	void test() {
		Reel reel = new Reel(A, B);
		assertThat(reel.getLength(), is(2));
	}

	@Test
	void getSubReel3FromOriginalReel() {
		Reel reel = new Reel(A, B, C, A, B, C);

		Reel reel3 = reel.getReel3FromIndex(1);

		assertThat(reel3.isSymoblAtIndex(B, 0), is(TRUE));
		assertThat(reel3.isSymoblAtIndex(C, 1), is(TRUE));
		assertThat(reel3.isSymoblAtIndex(A, 2), is(TRUE));
	}

	@Test
	void getSubReel3FromOriginalReelMustFlipToBeginForAPartWhenOnly2AreLeft() {
		Reel reel = new Reel(A, B, C, A, B, C);

		Reel reel3 = reel.getReel3FromIndex(4);

		assertThat(reel3.isSymoblAtIndex(B, 0), is(TRUE));
		assertThat(reel3.isSymoblAtIndex(C, 1), is(TRUE));
		assertThat(reel3.isSymoblAtIndex(A, 2), is(TRUE));
	}

	@Test
	void isSymoblAtIndexMustFlipToBeginWhenOutOfRange() {
		Reel reel = new Reel(A, B, C, A, B, C);

		Reel reel3 = reel.getReel3FromIndex(8);

		assertThat(reel3.isSymoblAtIndex(C, 0), is(TRUE));
		assertThat(reel3.isSymoblAtIndex(A, 1), is(TRUE));
		assertThat(reel3.isSymoblAtIndex(B, 2), is(TRUE));
	}

}
