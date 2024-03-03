package com.streamfilters;

public class Emplyoee 
{
	private int empno;
	private String ename;
	
	public Emplyoee(int empno, String ename)
	{
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	@Override
	public String toString() {
		return "[empno=" + empno + ", ename=" + ename + "]";
	}
	
}