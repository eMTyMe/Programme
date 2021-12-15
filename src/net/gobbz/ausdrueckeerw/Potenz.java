package net.gobbz.ausdrueckeerw;

public class Potenz extends Operation
{
	public Potenz(Operand operand0, Operand operand1) {
		super(operand0, operand1);
	}
	public Potenz() {
		super();
	}
	public double getErgebnis() {
		double ret = 0.0;
		if (this.getOperand(0) != null && this.getOperand(1) != null)
			ret = Math.pow(this.getOperand(0).getErgebnis(),
					this.getOperand(1).getErgebnis());
		return ret;
	}
	public String toString() {
		String ret = "(" + this.getOperand(0).getErgebnis()
				+ "^" + this.getOperand(1).getErgebnis() + "="
				+ this.getErgebnis() + ")";
		return ret;	
	}
}
