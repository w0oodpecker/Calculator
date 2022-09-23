public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = ( x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printlnb = System.out::println;

}

@FunctionalInterface
interface Supplier<T> {
    T get();
}

@FunctionalInterface
interface BinaryOperator<T> {
    T apply(T x, T y);
}

@FunctionalInterface
interface UnaryOperator<T> {
    T apply(T x);
}

@FunctionalInterface
interface Predicate<T> {
    boolean apply(T x);
}

@FunctionalInterface
interface Consumer<T> {
    void accept(T x);
}