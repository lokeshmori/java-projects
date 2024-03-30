package privatefirm.com;

public abstract class Employee {

	private String employeeId;
	private String employeeName ;
	private double salary ;
	private static int contractIdCounter ;
	private static int permenantIdCounter ;
	
	static {
		contractIdCounter = 10001 ;
		permenantIdCounter = 10001 ;
		
		
	}
	 public Employee(String employeeName) {
	        this.employeeName = employeeName;
	        // Generate employeeId based on whether the employee is a contract or permanent employee
	        if (this instanceof ContractEmployee) {
	            this.employeeId = "C" + contractIdCounter++;
	        } else if (this instanceof PermanentEmployee) {
	            this.employeeId = "E" + permenantIdCounter++;
	        }
	}
	
	
	public abstract void calculateSalary(float salaryFactor ) ;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
        if (isValidEmployeeName(employeeName)) {
            this.employeeName = employeeName;
        } else {
            System.out.println("Invalid employee name. Please ensure the name contains only alphabets, spaces between words, each word starts with an uppercase alphabet, and there are at least 2 words with each word containing at least 2 alphabets.");
        }
    }

    private boolean isValidEmployeeName(String employeeName) {
        // Splitting the name into words based on spaces
        String[] words = employeeName.split("\\s+");

        // Checking if there are at least 2 words
        if (words.length < 2) {
            return false;
        }

        // Iterating over each word
        for (String word : words) {
            // Checking if each word starts with an uppercase alphabet and contains at least 2 alphabets
            if (!word.matches("[A-Z][a-zA-Z]+") || word.length() < 2) {
                return false;
            }
        }
        
        // If all conditions are satisfied, return true
        return true;
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 0)
		this.salary = salary;
		else 
			this.salary = 0 ;
	}

	public static int getContractIdCounter() {
		return contractIdCounter;
	}

	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = contractIdCounter;
	}

	public static int getPermenantIdCounter() {
		return permenantIdCounter;
	}

	public static void setPermenantIdCounter(int permenantIdCounter) {
		Employee.permenantIdCounter = permenantIdCounter;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
		
	
	
	
	
}
