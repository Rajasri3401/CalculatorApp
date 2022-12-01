class Calculator
{
	int first;
	int second;
	
	int sumResult;
	int subResult;
	int mulResult;
	int remResult;
	
	double divResult;

	Calculator()
	{
	}
	
	Calculator(int a, int b)
	{
		first = a;
		second = b;
	}
	
	public void performAdd()
	{
		sumResult = first + second;
	}
}

class CalculatorManager
{
	public static void main(String args[])
	{
		Calculator c1 = new Calculator(10,5);
		c1.performAdd();
		c1.displaySum();	
	}
}