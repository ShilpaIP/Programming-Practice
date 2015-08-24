package com.main;

public class EqualsHashCodeEx {
	
	private int someId;

	
	public EqualsHashCodeEx(int someId){
		this.someId = someId;
	}
	
	public int getSomeId(){
		return someId;
	}
	
	public boolean equals(Object o){
		boolean eq = false;
		if(o instanceof EqualsHashCodeEx){
			EqualsHashCodeEx eh = (EqualsHashCodeEx) o;
			if(eh.getSomeId() == this.getSomeId())
				eq = true;
		}
		return eq;
	}
	
	public int hashCode(){
		int result = 1;
	    result = 31 * result + getSomeId();
	    return result;
	}
	
	public static void main(String[] args) {
		
		EqualsHashCodeEx ehc = new EqualsHashCodeEx(345);
		EqualsHashCodeEx ehc2 = new EqualsHashCodeEx(345);
		
		if(ehc.equals(ehc2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		System.out.println(ehc.hashCode());
		System.out.println(ehc2.hashCode());
	}

}
