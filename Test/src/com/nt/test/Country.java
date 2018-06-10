package com.nt.test;

import java.util.Locale;

public class Country {
	public static void getCountry(){
		Locale locales[]=Locale.getAvailableLocales();
		System.out.println("Country Name \u0000 Language");
		System.out.println("---------- \t ----------");
		for(Locale locale:locales){
			System.out.println(locale.getDisplayCountry()+"\t\t"+locale.getDisplayLanguage());
		}
	}

}
