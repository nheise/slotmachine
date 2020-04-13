package com.nh.slotmachine.reel.matcher;

import static com.nh.slotmachine.reel.Symbol.A;
import static com.nh.slotmachine.reel.Symbol.B;
import static com.nh.slotmachine.reel.Symbol.C;

import java.util.Arrays;
import java.util.List;

public class ThreeReelMatchers {

	public static final ThreeReelMatcher AAA_1_ROW = new ThreeReelMatcher(0, 0, 0, "3 times a A in the first row", A,
			10);
	public static final ThreeReelMatcher AAA_2_ROW = new ThreeReelMatcher(1, 1, 1, "3 times a A in the second row", A,
			10);
	public static final ThreeReelMatcher AAA_3_ROW = new ThreeReelMatcher(2, 2, 2, "3 times a A in the third row", A,
			10);
	public static final ThreeReelMatcher AAA_DIA_TB_ROW = new ThreeReelMatcher(0, 1, 2,
			"3 times a A diagonal from top to bottom", A, 10);
	public static final ThreeReelMatcher AAA_DIA_BT_ROW = new ThreeReelMatcher(2, 1, 0,
			"3 times a A diagonal from bottom to top", A, 10);

	public static final ThreeReelMatcher BBB_1_ROW = new ThreeReelMatcher(0, 0, 0, "3 times a B in the first row", B,
			15);
	public static final ThreeReelMatcher BBB_2_ROW = new ThreeReelMatcher(1, 1, 1, "3 times a B in the second row", B,
			15);
	public static final ThreeReelMatcher BBB_3_ROW = new ThreeReelMatcher(2, 2, 2, "3 times a B in the third row", B,
			15);
	public static final ThreeReelMatcher BBB_DIA_TB_ROW = new ThreeReelMatcher(0, 1, 2,
			"3 times a B diagonal from top to bottom", B, 15);
	public static final ThreeReelMatcher BBB_DIA_BT_ROW = new ThreeReelMatcher(2, 1, 0,
			"3 times a B diagonal from bottom to top", B, 15);

	public static final ThreeReelMatcher CCC_1_ROW = new ThreeReelMatcher(0, 0, 0, "3 times a C in the first row", C,
			20);
	public static final ThreeReelMatcher CCC_2_ROW = new ThreeReelMatcher(1, 1, 1, "3 times a C in the second row", C,
			20);
	public static final ThreeReelMatcher CCC_3_ROW = new ThreeReelMatcher(2, 2, 2, "3 times a C in the third row", C,
			20);
	public static final ThreeReelMatcher CCC_DIA_TB_ROW = new ThreeReelMatcher(0, 1, 2,
			"3 times a C diagonal from top to bottom", C, 20);
	public static final ThreeReelMatcher CCC_DIA_BT_ROW = new ThreeReelMatcher(2, 1, 0,
			"3 times a C diagonal from bottom to top", C, 20);

	public static final List<ThreeReelMatcher> ALL_MATCHERS = Arrays.asList(AAA_1_ROW, AAA_2_ROW, AAA_3_ROW,
			AAA_DIA_BT_ROW, AAA_DIA_TB_ROW, BBB_1_ROW, BBB_2_ROW, BBB_3_ROW, BBB_DIA_BT_ROW, BBB_DIA_TB_ROW, CCC_1_ROW,
			CCC_2_ROW, CCC_3_ROW, CCC_DIA_BT_ROW, CCC_DIA_TB_ROW);

}
