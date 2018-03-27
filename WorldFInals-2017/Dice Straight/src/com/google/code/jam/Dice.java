/**
 * 
 */
package com.google.code.jam;

import java.util.List;

/**
 * @author Pradeep.Shettar
 *
 */
public class Dice implements Comparable<Dice>{

	/**
	 * 
	 */
	public Dice() {
	}
	
	List<Integer> values;

	boolean used;

	/**
	 * @param values
	 * @param used
	 */
	public Dice(List<Integer> values, boolean used) {
		super();
		this.values = values;
		this.used = used;
	}

	/**
	 * @return the values
	 */
	public List<Integer> getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(List<Integer> values) {
		this.values = values;
	}

	/**
	 * @return the used
	 */
	public boolean isUsed() {
		return used;
	}

	/**
	 * @param used the used to set
	 */
	public void setUsed(boolean used) {
		this.used = used;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (used ? 1231 : 1237);
		result = prime * result + ((values == null) ? 0 : values.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		Dice other = (Dice) obj;
		if (used != other.used)
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dice [values=" + values + ", used=" + used + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Dice dice) {
		return this.getValues().get(0).compareTo(dice.getValues().get(0));
	}
	
}
