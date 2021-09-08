package com.cg.first;

import java.time.LocalDate;
import java.time.Month;

public class Product {

	public Product() {
		LocalDate pdate = LocalDate.of(2004,Month.AUGUST,15);
		int w=24;
		
		System.out.println( pdate +pdate.plusMonths(w) );
		
	
	}

}
