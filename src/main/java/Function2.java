import java.util.function.Function;

public class Function2 {



    public static void main(String args [])
    {

      Function d1= partialA(12, integer -> f-> "soy" + f + integer);
        System.out.println(d1.apply(32));
    }





//Partial Function applying the first argument to the returned function
static <A,B,C> Function<B,C> partialA(A a, Function<A,Function<B,C>> f)
{
    return f.apply(a);
}
}
