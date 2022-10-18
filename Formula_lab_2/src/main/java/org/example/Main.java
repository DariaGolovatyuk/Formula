package org.example;

public class Main {
    public static void main(String[] args) {
        String f="(((a+4)*6)+(2*b)-(12/4))";
        Formula formula = new Formula();
        formula.setFormula(f);
        System.out.print(formula.isCorrectFormula()+"\n");
        formula.postfixFormula();

        String res=formula.calculateFormula();
        System.out.print(res+"\n");
    }
}