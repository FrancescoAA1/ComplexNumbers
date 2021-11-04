import java.util.Scanner;

public class MyComplexTester{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci parte reale e immaginaria del primo numero complesso");
        double re1 = sc.nextDouble();
        double im1 = sc.nextDouble();
        MyComplex c1 = new MyComplex(re1, im1);

        System.out.println("Inserisci parte reale e immaginaria del secondo numero complesso");
        double re2 = sc.nextDouble();
        double im2 = sc.nextDouble();
        MyComplex c2 = new MyComplex(re2, im2);

        System.out.printf("La somma dei due numeri e' %s %n", c1.add(c2));
        System.out.printf("La differenza dei due numeri e' %s %n", c1.sub(c2));
        System.out.printf("Il prodotto dei due numeri e' %s %n", c1.mult(c2));
        System.out.printf("Il quoziente dei due numeri e' %s %n", c1.div(c2));
        System.out.printf("L'inverso del primo numero e' %s %n", c1.inv());
        System.out.printf("Il coniugato del primo numero e' %s %n", c1.conj());
    }
}