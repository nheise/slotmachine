package com.nh.slotmachine.reel;

import static java.util.Arrays.copyOfRange;

import java.util.Arrays;

import lombok.Data;

@Data
public class Reel {

	private final Symbol[] reel;

	private final int length;

	public Reel(Symbol... symbols) {
		this.reel = concat(symbols, symbols);
		this.length = symbols.length;
	}

	public Reel getReel3FromIndex(int startIndex) {
		int provedStartIndex = proveIndex(startIndex);
		return new Reel(copyOfRange(reel, provedStartIndex, provedStartIndex + 3));
	}

	public boolean isSymoblAtIndex(Symbol symbol, int index) {
		return reel[proveIndex(index)] == symbol;
	}

	public static Reel create(Symbol... symbols) {
		return new Reel(symbols);
	}

	private int proveIndex(int index) {
		return index % length;
	}

	public static <T> T[] concat(T[] first, T[] second) {
		T[] result = Arrays.copyOf(first, first.length + second.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		return result;
	}

}
