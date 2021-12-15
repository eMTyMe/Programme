package net.gobbz.ausdrueckeerw;

public class Logarithmus extends ArgOperation
{


	public Logarithmus() {
		super();
	}
	
	public Logarithmus(Argument argument, Operand operand) {
		this.argument = argument;
		this.operand = operand;
	}
	
	@Override
	public double getErgebnis() {
		double ret = 0.0;
		if(this.argument != null && this.operand != null) {
			ret = Math.log(this.operand.getErgebnis()) 
					/ Math.log(this.argument.getErgebnis());
		}
		return ret;
	}

	public String toString() {
		String ret = "(Logarithmus(" + this.argument.getErgebnis()
		+ "," + this.operand.getErgebnis() + "))";
		
		return ret;
	}
	
}
