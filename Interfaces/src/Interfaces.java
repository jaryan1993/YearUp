
public class Interfaces {

	public class Scientist implements ITaxpayer

	{

	private double m_income = -1;

	private boolean m_donePayingTaxes = false;



	public double GetIncome()

	{

	return m_income;

	}


	Scientist(double Income)

	{ 

	SetIncome(Income);


	}



	private void SetIncome(double income)

	{

	m_income = GetIncome();

	}


	public void PayTaxes( double taxRate)

	{

	if (m_donePayingTaxes== false)

	{

	double taxAmount = GetIncome() * taxRate;

	double discountedTaxAmount = taxAmount * .1;

	System.out.println("Scientist is paying the following as tax: "+ discountedTaxAmount);

	SetIncome(GetIncome() - discountedTaxAmount);

	System.out.println("My income after paying taxes is"+ GetIncome());


	}

	}


	@Override

	public void FileTaxReturn() {

	// TODO Auto-generated method stub


	}


	@Override

	public void PayTaxes(double income, double taxRate) {

	// TODO Auto-generated method stub


	}





	}

