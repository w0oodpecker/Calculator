public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(3, 2);
        int b = calc.minus.apply(4, 1);
        int c = calc.multiply.apply(5, 6);

        try {
            int d = calc.devide.apply(6, 0);
            calc.println.accept(d);
        } catch (ArithmeticException exc) {
            System.out.println("Попытка деления на ноль");
        }

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);


        int e = calc.pow.apply(3);
        calc.println.accept(e);

        int f = calc.abs.apply(-4);
        calc.println.accept(f);

        boolean g = calc.isPositive.apply(-5);
        calc.printlnb.accept(g);    //Не работало тут, так как передавался тип переменной Integer, а результатом g является boolean
        //Поэтому создал еще одну реализацию println для boolean

    }
}