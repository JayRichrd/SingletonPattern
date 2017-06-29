package com.jy;

public final class Singleton {
	// 唯一的实例对象
	private static final Singleton instance = new Singleton();

	// 私有化构造函数
	private Singleton() {
	}

	/**
	 * 获取唯一实例
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return instance;
	}
}
