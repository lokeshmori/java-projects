package privatefirm.com;

public class ContractEmployee extends Employee {

	private double wagePerHour ;

	public ContractEmployee(String employeeName, double wagePerHour) {
		super(employeeName);
		this.wagePerHour = wagePerHour;
	}

	@Override
	public void calculateSalary(float hoursWorked) {
		// TODO Auto-generated method stub
		double totalSalary  = 0 ;
				if(hoursWorked >= 190)
			totalSalary =	wagePerHour * hoursWorked ;
				else {
					float hrs = 190 - hoursWorked ;
					totalSalary = (wagePerHour * hoursWorked )- hrs * wagePerHour/2 ;
				}
		this.setSalary(Math.round(totalSalary*100.0)/100.0);
	}

	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	@Override
	public String toString() {
		return "ContractEmployee [wagePerHour=" + wagePerHour + "]";
	}
	
	
	
}
