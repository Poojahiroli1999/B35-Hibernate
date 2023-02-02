package org.tnsindia.singletableinheritance;

public class Manager extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deptname;

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}
