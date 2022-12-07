package org.Discriminant;

public class Discriminant {

    public static void main(String[] args) {
        double a, b, c;
        double x1, x2;
        double Solution;
         a = 1;
         b = -4;
         c = -5;
double Discriminant = b*b - 4 * a * c;

if (Discriminant == 0){
    x1 = (-b)/(2 * a);
    x2 = x1;
    System.out.printf ("Solution: x1 = x2 = %s", x1);
}
else if (Discriminant > 0) {
    x1 = (-b + Math.sqrt(Discriminant))/(2 * a);
    x2 = (-b - Math.sqrt(Discriminant))/(2 * a);
    System.out.printf ("Solution: x1 = %s, x2 = %s", x1, x2);
    }
else System.out.print("null");
        }
}