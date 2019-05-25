package kamzs.ambro;

public class CalculatorShorter
{    public static void main(String[] args)
{
    System.out.println(operateFunction(10,4,(a,b) -> a+b));
    System.out.println(operateFunction(10,4,(a,b) -> a-b));
    System.out.println(operateFunction(10,4,(a,b) -> a*b));
    System.out.println(operateFunction(10,4,(a,b) -> a/b));
}

    static int operateFunction(int a, int b, Computable computable)
    {
        return computable.operate(a,b);
    }



}
