package net.gobbz.ausdrueckeerw;

public abstract class ArgOperation extends Operand
{

	Argument argument;
	Operand operand;
	
	public ArgOperation() {
		super();
	}
	
	public double getErgebnis() {
		return this.operand.getErgebnis();
	}
	
	public ArgOperation(Argument argument, Operand operand) {
		this.argument = argument;
		this.operand = operand;
	}
	
	public Argument getArgument() {
		return argument;
	}
	public void setArgument(Argument argument) {
		this.argument = argument;
	}
	public Operand getOperand() {
		return operand;
	}
	public void setOperand(Operand operand) {
		this.operand = operand;
	}

}
