package edu.mde.lab2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 0.01;
        double b = 0.3;

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть х: ");
        final double x = scanner.nextDouble();

        final Function expressionFirst = Sum.of(
                Division.of(Const.of(a), Power.of (Cot.of(Linear.X), 3)),
                Cos.of(Power.of(Sum.of(Multiplication.of(Const.of(a), Linear.X),Const.of(b)),2))
        );

        final Function expression = expressionFirst;

        final NumberFormat nf = NumberFormat.getInstance();
        System.out.format("f1(x) = %s", expression.toPrettyString(nf)).println();
        System.out.format("f1'(x) = %s", expression.derivative().toPrettyString(nf)).println();
        System.out.format("f("+ x + ") = %f", expression.calculate(x)).println();
        System.out.format("f'("+ x + ") = %f", expression.derivative().calculate(x)).println();

        final Function expressionSecond = Sum.of(
                Exponent.of(Multiplication.of(Const.of(a), Cos.of(Linear.X))),
                Multiplication.of(Linear.X, Power.of (Logn.of(Abs.of(Sum.of(Linear.X, Const.of(b)))), 2))
        );

        final Function expression2 = expressionSecond;

        final NumberFormat nf2 = NumberFormat.getInstance();
        System.out.format("f2(x) = %s", expression2.toPrettyString(nf2)).println();
        System.out.format("f2'(x) = %s", expression2.derivative().toPrettyString(nf2)).println();
        System.out.format("f("+ x + ") = %f", expression2.calculate(x)).println();
        System.out.format("f'("+ x + ") = %f", expression2.derivative().calculate(x)).println();
    }
}