package money;

interface Expression {
	Expression times(int multiplier);
	Expression plus(Expression tenFrancs);
	Money reduce(Bank bank, String to);
}
