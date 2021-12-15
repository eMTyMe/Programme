package net.gobbz.ausdrueckeerw;

public class Wurzel extends ArgOperation
{

	public Wurzel() {
		super();
	}
	
	public Wurzel(Argument argument, Operand operand) {
		this.argument = argument;
		this.operand = operand;
	}
	
	@Override
	public double getErgebnis() {
		double ret = 0.0;
		if(this.argument != null && this.operand != null) {
			ret = Math.pow(Math.E, (1/this.argument.getErgebnis())
					*Math.log(this.operand.getErgebnis()));
		}
		return ret;
	}

	public String toString() {
		String ret = "(Wurzel(" + this.argument.getErgebnis()
		+ "," + this.operand.getErgebnis() + "))";
		
		return ret;
	}
	
}
