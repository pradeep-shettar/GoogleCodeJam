/**
 * 
 */
package com.google.code.jam;

import java.util.List;

/**
 * @author Pradeep.Shettar
 *
 */
public class TestCase {

	List<Dice> groupOfDice;

	Integer longestRun;

	public TestCase() {
	}

	/**
	 * @return the groupOfDice
	 */
	public List<Dice> getGroupOfDice() {
		return groupOfDice;
	}

	/**
	 * @param groupOfDice
	 *            the groupOfDice to set
	 */
	public void setGroupOfDice(List<Dice> groupOfDice) {
		this.groupOfDice = groupOfDice;
	}

	/**
	 * @return the longestRun
	 */
	public Integer getLongestRun() {
		return longestRun;
	}

	/**
	 * @param longestRun
	 *            the longestRun to set
	 */
	public void setLongestRun(Integer longestRun) {
		this.longestRun = longestRun;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupOfDice == null) ? 0 : groupOfDice.hashCode());
		result = prime * result + ((longestRun == null) ? 0 : longestRun.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestCase other = (TestCase) obj;
		if (groupOfDice == null) {
			if (other.groupOfDice != null)
				return false;
		} else if (!groupOfDice.equals(other.groupOfDice))
			return false;
		if (longestRun == null) {
			if (other.longestRun != null)
				return false;
		} else if (!longestRun.equals(other.longestRun))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SetOfDice [groupOfDice=" + groupOfDice + ", longestRun=" + longestRun + "]";
	}

	/**
	 * @param groupOfDice
	 * @param longestRun
	 */
	public TestCase(List<Dice> groupOfDice, Integer longestRun) {
		super();
		this.groupOfDice = groupOfDice;
		this.longestRun = longestRun;
	}

}
