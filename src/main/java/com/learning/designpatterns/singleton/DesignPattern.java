package com.learning.designpatterns.singleton;

/**
 * @author Vishal Agarwal
 * @version Creation time: 17-Oct-2021 5:44:28 pm
 * @classDescription
*/

public class DesignPattern {

	public static void main(String[] args) {
		// User 1
		System.out.println("User 1 Accessing Cloud resource for first time");
		SingletonClass singletonClass = SingletonClass.getSharedInstance();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonClass.hashCode());
		
		// User 2
		System.out.println("User 2 Accessing Cloud resource for second time");
		SingletonClass singletonClass2 = SingletonClass.getSharedInstance();
		System.out.println("Hashcode for shared cloud user 2 : " + singletonClass2.hashCode());
				
		// User 3
		System.out.println("User 3 Accessing Cloud resource for third time");
		SingletonClass singletonClass3 = SingletonClass.getSharedInstance();
		System.out.println("Hashcode for shared cloud user 3 : " + singletonClass3.hashCode());

		// Singleton Eager Way User 1
		System.out.println("User 1 Accessing Cloud resource for first time using eager way");
		SingletonEagerWay singletonEagerWay1 = SingletonEagerWay.getSingletonEagerWay();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonEagerWay1.hashCode());

		// Singleton Eager Way User 2
		System.out.println("User 2 Accessing Cloud resource for second time using eager way");
		SingletonEagerWay singletonEagerWay2 = SingletonEagerWay.getSingletonEagerWay();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonEagerWay2.hashCode());

		// Singleton Thread Safe Way User 1
		System.out.println("User 1 Accessing Cloud resource for first time using thread safe way");
		SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getSingletonThreadSafe();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonThreadSafe1.hashCode());

		// Singleton Thread Safe Way User 2
		System.out.println("User 1 Accessing Cloud resource for first time using thread safe way");
		SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getSingletonThreadSafe();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonThreadSafe2.hashCode());
	}

}