public class Functions1 {


    private Function<Function<Integer, Integer>,
            Function<Function<Integer, Integer>,
                    Function<Integer, Integer>>> compose;

    {
        compose = x -> y -> z -> x.apply(y.apply(z));
    }

    public static void main(String [] args)
{

    Function<Integer,Integer>doubleNumber =args1 -> args1*2;
    Function<Integer,Integer>tripleNumber =args1 -> args1*3;

    Functions1 f1=new Functions1();
    System.out.println(combine(doubleNumber,tripleNumber).apply(5));
    System.out.println(f1.add.apply(4).apply(3));

    Function<Integer, Integer> triple = x -> x * 3;
    Function<Integer, Integer> square = x -> x * x;

    Function<Integer,Integer> f=f1.compose.apply(square).apply(triple);
    System.out.println(f.apply(12));

}


private static Function<Integer,Integer> combine(Function<Integer, Integer> f1, Function<Integer, Integer> f2)
{
    return args -> f1.apply(f2.apply((args)));



}

    private interface BinaryOperator extends
            Function<Integer, Function<Integer, Integer>> {

    }

    private BinaryOperator add = x -> y -> x + y;
    private BinaryOperator mult = x -> y -> x * y;

    interface Function <T,U>
    {
        U apply (T args);


    }

}
