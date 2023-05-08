package edu.mde.lab2;

import java.text.NumberFormat;

public class Cot implements Function {
    private final Function fx;
    public Cot(Function fx) {this.fx=fx;}

    @Override
    public double calculate(double x) { return 1.0 / Math.tan(fx.calculate(x)); }

    @Override
    public Function derivative() {
        return new Multiplication(new Division(new Const(-1), new Power(new Sin(fx),2)), fx.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return "cot(" + fx.toPrettyString(nf) + ")";
    }

    public static Cot of(Function fx) {
        return new Cot(fx);
    }
}
