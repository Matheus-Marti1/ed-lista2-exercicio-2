package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int restoDivisao(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
		} else {
			dividendo = dividendo - divisor;
			return restoDivisao(dividendo, divisor);
		}
	}
}
