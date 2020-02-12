package com.xinqian.cms.domain.enums;

public enum Gender {
	MAN("男"),
	WOMAN("女");
	
	//封装私有属性
	private String displayName;
	//有参构造
	private Gender(String displayName) {
		this.displayName = displayName;
	}
	//封装get方法
	public String getDisplayName() {
		return displayName;
	}
	//提供一个获得常量的方法
	public String getName() {
		return this.name();
	}
	//获得下标
	//提供一个获得下标的方法
		public int getOrdinal() {
			return this.ordinal();
		}
	
	
	
	
	
}
