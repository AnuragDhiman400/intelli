package com.countryList;
import java.util.Locale;

public class countryList {
	   public static void main(String[] args) {
		   countryList obj = new countryList();
			obj.run();
		    }
		    public void run() {
			String[] locales = Locale.getISOCountries();
			for (String countryCode : locales) {
				Locale obj = new Locale("", countryCode);
				System.out.println(" Country Name = " + obj.getDisplayCountry());
			}
			System.out.println("Done");
		    }			
		}
