package entities;

public class legal extends taxpayer {

	private Integer numbers_employee;
	
	
	public legal(String name, Double annual_income, Integer numbers_employee) {
		super(name, annual_income);
		this.numbers_employee = numbers_employee;
	}

	public Integer getNumbers_employee() {
		return numbers_employee;
	}

	public void setNumbers_employee(Integer numbers_employee) {
		this.numbers_employee = numbers_employee;
	}

	@Override
	public Double tax() {
		if (numbers_employee > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}
}
