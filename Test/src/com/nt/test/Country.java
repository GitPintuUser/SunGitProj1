package com.nt.test;

import java.util.Locale;

public class Country {
	public void getCountry(){
		Locale locales[]=Locale.getAvailableLocales();
		
		for(Locale locale:locales){
			System.out.println("Country :"+locale.getCountry());
		}
	}

}
