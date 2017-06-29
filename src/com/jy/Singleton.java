package com.jy;

public class Singleton {
	// Ψһ��ʵ������
	private static Singleton instance = null;

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
			synchronized (Singleton.class) {// ��������ͬ��
				if (null == instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
