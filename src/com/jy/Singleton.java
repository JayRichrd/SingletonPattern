package com.jy;

public class Singleton {
	private static Singleton instance;

	// 私有化构造函数
	private Singleton() {
	}

	/**
	 * 获取唯一实例
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
