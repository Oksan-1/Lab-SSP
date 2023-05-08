
/*package edu.mde.lab2;

import java.text.NumberFormat;

public class Difference implements Function {
    private final Function f1;
    private final Function f2;

    public Difference(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double calculate(double x) {
        return f1.calculate(x) - f2.calculate(x);
    }

    @Override
    public Function derivative() {
        return Sum.of(a, b, f1.derivative(), Multiplication.of(new Const(-1), f2.derivative()));
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return String.format("(%s - %s)", f1.toPrettyString(nf), f2.toPrettyString(nf));
    }

    public static Difference of(Function f1, Function f2) {
        return new Difference(f1, f2);
    }
}
*/
