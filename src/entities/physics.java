package entities;

public class physics extends taxpayer {

	private Double health_expenditures;

	
	public physics(String name, Double annualIncome, Double health_expenditures) {
		super(name, annualIncome);
		this.health_expenditures = health_expenditures;
	}

	public Double getHealth_expenditures() {
		return health_expenditures;
	}

	public void setHealth_expenditures(Double health_expenditures) {
		this.health_expenditures = health_expenditures;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() + 0.15 - health_expenditures * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - health_expenditures * 0.5;
		}
	}
}
