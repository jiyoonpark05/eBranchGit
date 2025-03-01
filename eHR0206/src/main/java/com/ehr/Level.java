package com.ehr;

public enum Level {
	BASIC(1),SILVER(2),GOLD(3);
	   
	   private final int value;
	   
	   Level(int value){
	      this.value = value;
	   }
	   
	   //DB insert Data
	   public int intValue() {
	      return value;
	   }
	   
	   //DB get(숫자를 던지면 lable을 뽑아낼 수 있도록 하는 것)
	   public static Level valueOf(int value) {
	      switch(value) {
	         case 1: return BASIC;
	         case 2: return SILVER;
	         case 3: return GOLD;
	         default: throw new AssertionError("Unknown value:"+value);
	      }
	   }
}   