package kamzs.ambro;

import java.util.function.BiFunction;

public class CalculatorAlmostShortest
{
    public static void main(String[] args)
    {
        System.out.println(operateFunction(10, 4, (a, b) -> a + b));
        System.out.println(operateFunction(10, 4, (a, b) -> a - b));
        System.out.println(operateFunction(10, 4, (a, b) -> a * b));
        System.out.println(operateFunction(10, 4, (a, b) -> a / b));
    }

    static int operateFunction(int a, int b, BiFunction<Integer,Integer,Integer> object)
    {
        return object.apply(a, b);
    }
}
