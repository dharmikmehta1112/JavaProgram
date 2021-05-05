package OOP_EncapsulationDemo;

public class Employee {

	private int emplID;
	private String emplName;
	private String emplDesig;
	private String emplProj;
	private String emplPhone;
	private float emplSalary;
	private String emplMangName;

// Set the value of Employee Id
	public void setEmplID(int emplID) {
		this.emplID = emplID;
	}

// Get the value of Employee Id	
	public int getEmplID() {
		return emplID;
	}

	public void setEmplSalary(float emplSalary) {
		this.emplSalary = emplSalary;
		if(emplDesig == "Manager")
		{
			if(emplSalary>50000 && emplSalary<900000)
				System.out.println("Employee Salary is set to:: " + emplSalary);
			else
				System.out.println("Invalid Employee Salary");
		}		
	}

	public float getEmplSalary() {
		return this.emplSalary;
	}

	public String getEmplDesig() {
		return emplDesig;
	}

	public void setEmplDesig(String emplDesig) {
		this.emplDesig = emplDesig;
	}

	
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public String getEmplProj() {
		return emplProj;
	}

	public void setEmplProj(String emplProj) {
		this.emplProj = emplProj;
	}

	public String getEmplPhone() {
		return emplPhone;
	}

	public void setEmplPhone(String emplPhone) {
		this.emplPhone = emplPhone;
	}

	public String getEmplMangName() {
		return emplMangName;
	}

	public void setEmplMangName(String emplMangName) {
		this.emplMangName = emplMangName;
	}


}
