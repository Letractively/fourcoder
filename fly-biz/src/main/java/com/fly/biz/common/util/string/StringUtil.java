package com.fly.biz.common.util.string;




public class StringUtil {

	private static final String EMPTY_STRING="";
	
	public static boolean isNotBlank(String str){
		
		if(str==null||str.length()==0){
			return false;
		}
		return true;
	}
	
	public static boolean isNumOnly(String str){
		
		if(str==null||str.isEmpty()){
			return false;
		}
		char[] chars=str.toCharArray();
		
		for(char ch:chars){
			 if (ch < '0' || ch > '9'){
				 return false;
			 }
		}
		return true;
	}
	
	public static String trim(String str){
		
		return str.trim();
	}
	
	public static String trimToNull(String str){
		
        if (str == null) {
            return null;
        }

        String result = str.trim();

        if (result == null || result.length() == 0) {
            return null;
        }

        return result;
	}
	
	public static String trimToEmperty(String str){
		 if (str == null) {
	            return EMPTY_STRING;
	        }

	        String result = str.trim();

	        if (result == null) {
	            return EMPTY_STRING;
	        }

	        return result;
	}
	
	public static String longToString(long number){
		return String.valueOf(number);
	}
	
	public static String intToString(long number){
		return String.valueOf(number);
	}
	
	public static String charToString(long ch){
		return String.valueOf(ch);
	}
	
	public static String doubleToString(long number){
		return String.valueOf(number);
	}
	public static String floatToString(long number){
		return String.valueOf(number);
	}
}
