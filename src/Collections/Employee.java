package Collections;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	int EmpNo;
	String name;
	
	public Employee(int EmpNo, String name) {
		this.EmpNo = EmpNo;
		this.name   = name;
	}

	@Override
	public String toString() {
		return "Employee [EmpNo=" + EmpNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(EmpNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return EmpNo == other.EmpNo;
	}

	@Override
	public int compareTo(Employee that) {
		// TODO Auto-generated method stub 
		return this.EmpNo -that.EmpNo;// when you want to sort according to EmpNo
		//return this.name.compareTo(that.name);// when you want to sort according to name
	}

}
