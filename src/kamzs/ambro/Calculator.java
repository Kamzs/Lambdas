package kamzs.ambro;

public class Calculator
{

    public static void main(String[] args)
    {


        Computable adding = (a,b) -> a+b;
        Computable subtracting = (a,b) -> a-b;
        Computable multiplying = (a,b) -> a*b;
        Computable deviding = (a,b) -> a/b;
        //można też krócej



        System.out.println(operateFunction(10,4,adding));
        System.out.println(operateFunction(10,4,subtracting));
        System.out.println(operateFunction(10,4,multiplying));
        System.out.println(operateFunction(10,4,deviding));
    }


        static int operateFunction(int a, int b, Computable computable)
        {
        return computable.operate(a,b);
        }


}
