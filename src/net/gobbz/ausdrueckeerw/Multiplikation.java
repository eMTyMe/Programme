package net.gobbz.ausdrueckeerw;

public class Multiplikation extends Operation
{
	public Multiplikation(Operand operand0, Operand operand1) {
		super(operand0, operand1);
	}
	public Multiplikation() {
		super();
	}
	public double getErgebnis() {
		double ret = 0.0;
		if (this.getOperand(0) != null)
			ret = this.getOperand(0).getErgebnis();
		if (this.getOperand(1) != null)
			ret = ret * this.getOperand(1).getErgebnis();
		return ret;
	}
	public String toString() {
		String ret = "(" + this.getOperand(0).getErgebnis()
				+ "*" + this.getOperand(1).getErgebnis() + "="
				+ this.getErgebnis() + ")";
		return ret;	
	}

}
