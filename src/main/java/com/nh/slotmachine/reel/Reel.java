package com.nh.slotmachine.reel;

import static com.nh.slotmachine.util.ArrayUtil.concat;
import static java.util.Arrays.copyOfRange;

import lombok.Data;

@Data
public class Reel {

    private final Symbol[] workReel;
    private final Symbol[] reel;

    private final int length;

    public Reel(Symbol... symbols) {
        this.reel = symbols;
        this.workReel = concat(symbols, symbols);
        this.length = symbols.length;
    }

    public Reel getReel3FromIndex(int startIndex) {
        int provedStartIndex = proveIndex(startIndex);
        return new Reel(copyOfRange(workReel, provedStartIndex, provedStartIndex + 3));
    }

    public boolean isSymoblAtIndex(Symbol symbol, int index) {
        return workReel[proveIndex(index)] == symbol;
    }

    private int proveIndex(int index) {
        return index % length;
    }

}
