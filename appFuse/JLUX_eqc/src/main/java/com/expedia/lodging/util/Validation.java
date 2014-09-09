package com.expedia.lodging.util;

public class Validation {

	public static boolean isInteger(String integer){
		if( notNullCheck(integer) )
			return integer.matches("^\\d+$");
		return false;
	}
	
	public static boolean notNullCheck(String str){
		if( str != null && !"".equals(str.trim()))
			return true;
		return false;
	}
	
	
	public static boolean nullCheck(String str){
		if( str == null || "".equals(str.trim()))
			return true;
		return false;
	} 
	
}
