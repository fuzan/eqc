package com.expedia.lodging.util;

public class Validation {

	public static boolean isInteger(String integer){
		if( integer != null && !"".equals(integer.trim()))
			return integer.matches("^\\d+$");
		return false;
	}
	
	public static boolean notNullCheck(String str){
		if( str != null && !"".equals(str.trim()))
			return true;
		return false;
	}
	
	
	
}
