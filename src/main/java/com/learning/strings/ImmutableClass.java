package com.learning.strings;

final class ImmutableClass {
	
	private int i;
	
	ImmutableClass(int i) {
		this.i = i;
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
