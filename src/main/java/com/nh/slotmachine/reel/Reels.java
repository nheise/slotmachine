package com.nh.slotmachine.reel;

import static com.nh.slotmachine.reel.Symbol.A;
import static com.nh.slotmachine.reel.Symbol.B;
import static com.nh.slotmachine.reel.Symbol.C;

public class Reels {

    public static final Symbol[] REEL_1_SYMBOLS = new Symbol[] { A, C, A, C, A, C, A, B, C, C, C, A, B, C, B, C, A, C,
            B, A, B, A };
    public static final Symbol[] REEL_2_SYMBOLS = new Symbol[] { B, C, A, B, A, C, A, C, B, C, A, A, A, B, A, B, A, B,
            C, B };
    public static final Symbol[] REEL_3_SYMBOLS = new Symbol[] { C, B, A, A, A, A, A, C, C, B, B, C, C, A, C, A, C, A,
            C, A, C };

    public static final ThreeReeler THREE_REELER = new ThreeReeler(new Reel(REEL_1_SYMBOLS), new Reel(REEL_2_SYMBOLS),
            new Reel(REEL_3_SYMBOLS));

}
