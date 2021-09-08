package com.cg.first;
import java.util.*;
public class Timer {

	public Timer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Timerimp time = new Timerimp();
			Thread helloThread = new Thread(time);
			//Timer t = new Timer();
		      //t.sleep( 10000);
			helloThread.start();
			try {
				helloThread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println("Timer after 10s");
				e.printStackTrace();
			}
			//helloThread.start();

	}

	
}
