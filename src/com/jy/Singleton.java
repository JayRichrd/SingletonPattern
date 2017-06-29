package com.jy;

public final class Singleton {
	// Ψһ��ʵ������
	private static final Singleton instance = new Singleton();

	// ˽�л����캯��
	private Singleton() {
	}

	/**
	 * ��ȡΨһʵ��
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return instance;
	}
}
