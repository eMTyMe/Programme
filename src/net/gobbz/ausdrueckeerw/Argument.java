package net.gobbz.ausdrueckeerw;

public class Argument extends Konstante
{
	
private double ergebnis = 0.0;
	
	public Argument(double ergebnis) {
		ergebnis = Math.abs(ergebnis);
		ergebnis = Math.round(ergebnis);
		this.ergebnis = ergebnis;
	}
	public Argument() {
		super();
	}
	
	public void setErgebnis(double ergebnis) {
		ergebnis = Math.abs(ergebnis);
		ergebnis = Math.round(ergebnis);
		this.ergebnis = ergebnis;
	}
	public double getErgebnis() {
		return this.ergebnis;
	}
	public String toString() {
		return String.valueOf(this.ergebnis);
	}
	
}
