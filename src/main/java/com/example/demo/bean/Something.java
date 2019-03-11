package com.example.demo.bean;

public class Something {
 
    // constructor methods
    Something() {}
 
   public  Something(String something) {
	System.out.println(something);
    }
 
    // static methods
    public static String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
    
    // object methods
    String endWith(String s) {
        return String.valueOf(s.charAt(s.length()-1));
    }
    
    void endWith() {}
}