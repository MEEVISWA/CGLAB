package com.cg.first;

import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Zone {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India:"+ currentTime);
		System.out.println("Paris:"+ currentTimeInParis);
		System.out.println("New York:"+ currentTimeInNewYork);
		
	}

}
