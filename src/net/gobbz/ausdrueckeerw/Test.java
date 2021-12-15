package net.gobbz.ausdrueckeerw;

public class Test
{

	public static void main(String[] args) {
		Wurzel w = new Wurzel(new Argument(2.0d), new Argument(4));
		System.out.println(w.getErgebnis());
		Double d = new Potenz(new Division(new Multiplikation(new Argument(3), new Potenz(new Addition(new Argument(6), new Argument(7)), 5)), new Logarithmus(new Argument(10), new Wurzel(new Argument(2), new Addition(new Division(new Argument(70), new Argument(4)), new Division(new Argument(990), new Argument(8)))))), new Argument(4));
	}

}
