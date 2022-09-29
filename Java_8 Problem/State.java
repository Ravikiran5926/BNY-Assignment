package com.bny.java_StreamApi;

public class State {

	private int stated;
	private String statename;

	public State(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}

	public int getStated() {
		return stated;
	}

	public void setStated(int stated) {
		this.stated = stated;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "StateStream [stated=" + stated + ", statename=" + statename + "]";
	}
}
