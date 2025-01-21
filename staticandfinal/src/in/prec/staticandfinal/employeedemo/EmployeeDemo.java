package in.prec.staticandfinal.employeedemo;

public class EmployeeDemo {
	String employeeName;
	float employeeSalary;
	final int RETIREMENT_AGE;
	static String organizationName;
	public EmployeeDemo(String employeeName, float employeeSalary, int rETIREMENT_AGE) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		RETIREMENT_AGE = rETIREMENT_AGE;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public static String getOrganizationName() {
		return organizationName;
	}
	public static void setOrganizationName(String organizationName) {
		EmployeeDemo.organizationName = organizationName;
	}
	public int getRETIREMENT_AGE() {
		return RETIREMENT_AGE;
	}
	
	@Override
	public String toString() {
		return "EmployeeDemo [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", RETIREMENT_AGE="
				+ RETIREMENT_AGE + " Organization:" + organizationName +"]";
	}
}
