package com.learning.strings;

/**
 * @author vishalagarwal
 * @version Creation time: 03-Feb-2026 11:37:21 pm
 * @classDescription To explain immutability in string
 *
 * Class is final → cannot be extended
 * Make all fields private final
 * No setter methods
 * Methods return new objects, not modify existing
 */
public final class ImmutableClass {
    private final int i;
	
	public ImmutableClass(int i) {
		this.i = i;
	}

    public int getI() {
        return i;
    }
	
	public ImmutableClass modify(int i) {
		if(this.i == i) {
			return this;
		} else {
			return new ImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		ImmutableClass ic1 = new ImmutableClass(10);
		ImmutableClass ic2 = ic1.modify(100);
		ImmutableClass ic3 = ic1.modify(10);
		
		System.out.println(ic1 == ic2);
		System.out.println(ic1 == ic3);
	}

}
