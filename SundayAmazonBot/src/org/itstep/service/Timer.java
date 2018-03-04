package org.itstep.service;

public class Timer {

	public static void waitSec(int sec) {
		try {
			Thread.sleep(1000*sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
