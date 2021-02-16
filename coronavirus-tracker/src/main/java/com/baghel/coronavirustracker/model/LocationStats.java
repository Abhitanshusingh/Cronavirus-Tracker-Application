package com.baghel.coronavirustracker.model;

public class LocationStats {

	private String state;
	private String country;
	private int latestTotalCase;
	private int diffFromPrevDayCase;

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCase() {
		return latestTotalCase;
	}
	public void setLatestTotalCase(int latestTotalCase) {
		this.latestTotalCase = latestTotalCase;
	}
	
	public int getDiffFromPrevDayCase() {
		return diffFromPrevDayCase;
	}
	public void setDiffFromPrevDayCase(int diffFromPrevDayCase) {
		this.diffFromPrevDayCase = diffFromPrevDayCase;
	}
	
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCase=" + latestTotalCase + "]";
	}
}
