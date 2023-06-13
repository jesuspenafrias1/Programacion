/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordendeoperaciones;

import java.util.Scanner;

public class ResolverOperaciones {
    public static void main(String[] args) {
        double resultadoA = resolverOperacionA();
        System.out.printf("Resultado a) 3/2 + 4/3 = %.2f%n", resultadoA);

        double x = obtenerValorVariable("x");
        double y = obtenerValorVariable("y");
        double resultadoB = resolverOperacionB(x, y);
        System.out.printf("Resultado b) 1/(x-5) - 3xy/4 = %.2f%n", resultadoB);

        double resultadoC = resolverOperacionC();
        System.out.printf("Resultado c) 1/2 + 7 = %.2f%n", resultadoC);

        double resultadoD = resolverOperacionD();
        System.out.printf("Resultado d) 7 + 1/2 = %.2f%n", resultadoD);

        double a = obtenerValorVariable("a");
        double b = obtenerValorVariable("b");
        double c = obtenerValorVariable("c");
        double d = obtenerValorVariable("d");
        double e = obtenerValorVariable("e");
        double f = obtenerValorVariable("f");
        double g = obtenerValorVariable("g");
        double h = obtenerValorVariable("h");
        double j = obtenerValorVariable("j");

        double resultadoE = resolverOperacionE(a, b, c, d, e, f, g, h, j);
        System.out.printf("Resultado e) (a^2/(b-c)) + ((d-e)/(f-(g*h)/j)) = %.2f%n", resultadoE);

        double m = obtenerValorVariable("m");
        double n = obtenerValorVariable("n");
        double p = obtenerValorVariable("p");

        double resultadoF = resolverOperacionF(m, n, p);
        System.out.printf("Resultado f) m/n + p = %.2f%n", resultadoF);

        double resultadoG = resolverOperacionG(m, n, p);
        System.out.printf("Resultado g) (m+n)/(p-q) = %.2f%n", resultadoG);

        double resultadoH = resolverOperacionH(a, b, c, d);
        System.out.printf("Resultado h) (a^2/b^2) + (c^2/d^2) = %.2f%n", resultadoH);

        double q = obtenerValorVariable("q");
        double r = obtenerValorVariable("r");
        double s = obtenerValorVariable("s");

        double resultadoI = resolverOperacionI(m, n, p, q, r, s);
        System.out.printf("Resultado i) (m+n)/(q-p/(r/s)) = %.2f%n", resultadoI);

        double resultadoJ = resolverOperacionJ(a, b, c, d, e, f, g, h);
        System.out.printf("Resultado j) (3a+b)/(c-(d+5e)/(f*g/2h)) = %.2f%n", resultadoJ);

        double resultadoK = resolverOperacionK(a, b, x);
        System.out.printf("Resultado k) (a^2+2ab+b^2)/(1/x^2 + 2) = %.2f%n", resultadoK);
    }

    public static double obtenerValorVariable(String variable) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de " + variable + ": ");
        double valor = scanner.nextDouble();
        return valor;
    }

    public static double resolverOperacionA() {
        double resultado = (3.0 / 2.0) + (4.0 / 3.0);
        return resultado;
    }

    public static double resolverOperacionB(double x, double y) {
        double resultado = 1.0 / (x - 5) - (3 * x * y) / 4;
        return resultado;
    }

    public static double resolverOperacionC() {
        double resultado = 1.0 / 2.0 + 7;
        return resultado;
    }

    public static double resolverOperacionD() {
        double resultado = 7 + 1.0 / 2.0;
        return resultado;
    }

    public static double resolverOperacionE(double a, double b, double c, double d, double e, double f, double g, double h, double j) {
        double resultado = (Math.pow(a, 2) / (b - c)) + ((d - e) / (f - (g * h) / j));
        return resultado;
    }

    public static double resolverOperacionF(double m, double n, double p) {
        double resultado = (m + n) / p;
        return resultado;
    }

    public static double resolverOperacionG(double m, double n, double p) {
        double resultado = (m + n) / (p - obtenerValorVariable("q"));
        return resultado;
    }

    public static double resolverOperacionH(double a, double b, double c, double d) {
        double resultado = (Math.pow(a, 2) / Math.pow(b, 2)) + (Math.pow(c, 2) / Math.pow(d, 2));
        return resultado;
    }

    public static double resolverOperacionI(double m, double n, double p, double q, double r, double s) {
        double resultado = (m + n) / (q - p / (r / s));
        return resultado;
    }

    public static double resolverOperacionJ(double a, double b, double c, double d, double e, double f, double g, double h) {
        double resultado = (3 * a + b) / (c - (d + 5 * e) / (f * g / (2 * h)));
        return resultado;
    }

    public static double resolverOperacionK(double a, double b, double x) {
        double resultado = (Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2)) / (1 / Math.pow(x, 2) + 2);
        return resultado;
    }
}
