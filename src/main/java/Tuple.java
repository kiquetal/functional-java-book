public class Tuple<A, B> {

    private A a;
    private B b;
        Tuple(A a, B b)
        {
            this.a=a;
            this.b=b;
        }

    @Override
    public String toString() {
        return "Soy una tupla@ con [a] : "+this.a + " [b] :  " + this.b;
    }
}
