package com.example.mycalculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.math.BigDecimal;

public final class MathEval {
    MathEval() {}

    public static String eval(String expr) {
        try {
            Expression e = new ExpressionBuilder(expr).build();
            double result = e.evaluate();
            // strip trailing .0 for integers
            if (Math.rint(result) == result) {
                return String.valueOf((int) result);
            }
            return String.valueOf(result);
        } catch (Exception ex) {
            return "Error";
        }
    }
}
