package com.nationalize;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The type Name finder.
 */
public class NameFinder{

	@JsonProperty("country")
	private List<CountryItem> country;

	@JsonProperty("name")
	private String name;

	/**
	 * Get country list.
	 *
	 * @return the list
	 */
	public List<CountryItem> getCountry(){
		return country;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"NameFinder{" + 
			"country = '" + country + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}