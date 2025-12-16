package com.learning.designpatterns.singleton;

/**
 * @author Vishal Agarwal
 * @version Creation time: 17-Oct-2021 5:41:21 pm
 * @classDescription To explain Singleton Design pattern
 *
 * 1. Create constructor as private so that multiple objects cannot be created from other class
 * 2. Create static method so that it will be called by its own class
 * 3. Create private static variable so that it cannot be called by other class
*/

public class SingletonClass {
	private SingletonClass() {
		
	}
	
	private static SingletonClass sharedInstance = null ;
	
	public static SingletonClass getSharedInstance() {
		if(sharedInstance == null) {
			sharedInstance = new SingletonClass();
		}
		
		return sharedInstance;
	}
}