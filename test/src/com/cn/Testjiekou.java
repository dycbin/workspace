package com.cn;


public interface Testjiekou {
	
	public static final String QWE_REW = "qwerty";

	public   String tell();

	public  String tell1();

	public  String tell2();
}

abstract   class Persion implements Testjiekou {

	public abstract void  dajia();

}
class sPersion extends Persion implements Testjiekou{
	public static void main(String [] args){
		sPersion spersion=new   sPersion();
		spersion.tell();
	}

	@Override
	public String tell() {
		return "tell·½·¨";
	}

	@Override
	public String tell1() {
		return null;
	}

	@Override
	public String tell2() {
		return null;
	}

	@Override

	public void dajia() {
		
	}
	
}