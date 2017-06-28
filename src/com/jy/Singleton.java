package com.jy;

public class Singleton {
	private static Singleton instance;

	// ˽�л����캯��
	private Singleton() {
	}

	/**
	 * ��ȡΨһʵ��
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
}
