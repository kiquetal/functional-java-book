import java.util.function.Function;

public class Function2 {



    public static void main(String args []) {

        Function d1 = partialA(12, integer -> f -> "soy" + f + integer);
        System.out.println(d1.apply(32));
        Function d2 = partialB("kiquetal", tah -> kiquetal -> (Integer) tah * 5);
        System.out.println(d2.apply(34));
        System.out.println(f().apply("hola queta").apply("donde").apply("estamos"));
        System.out.println(curry( a -> "algo asi con " + a).apply("donde").apply(4));
    }



//Partial Function applying the first argument to the returned function
static <A,B,C> Function<B,C> partialA(A a, Function<A,Function<B,C>> f)
{
    return f.apply(a);
}



//Exercise 2.8
// Write a method to partially apply a curried function of two arguments to its second argument.

static <A,B,C> Function<A,C> partialB(B b, Function<A,Function<B,C>> f)
{
    return a-> f.apply(a).apply(b);
}
//Exercise 2.9
static <A,B,C,D> Function<A,Function<B,Function<C,Function<D,String>>>> f(){
        return a-> b-> c->d -> String.format("%s,%s,%s,%s",a,b,c,d);
}

//Exercise 2.10

static    <A, B, C> Function<A, Function<B, C>> curry(Function<Tuple<A, B>, C> f) {

    return a -> b -> f.apply(new Tuple<>(a, b));
}

}
