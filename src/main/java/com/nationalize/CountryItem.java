package com.nationalize;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Country item.
 */
public class CountryItem{

	@JsonProperty("probability")
	private double probability;

	@JsonProperty("country_id")
	private String countryId;

	/**
	 * Set probability.
	 *
	 * @param probability the probability
	 */
	public void setProbability(double probability){
		this.probability = probability;
	}

	/**
	 * Get probability double.
	 *
	 * @return the double
	 */
	public double getProbability(){
		return probability;
	}

	/**
	 * Set country id.
	 *
	 * @param countryId the country id
	 */
	public void setCountryId(String countryId){
		this.countryId = countryId;
	}

	/**
	 * Get country id string.
	 *
	 * @return the string
	 */
	public String getCountryId(){
		return countryId;
	}

	@Override
 	public String toString(){
		return 
			"CountryItem{" + 
			"probability = '" + probability + '\'' + 
			",country_id = '" + countryId + '\'' + 
			"}";
		}
}