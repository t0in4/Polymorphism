package runtime;

public class Next extends Precedence {
    public Next(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public int calculate(int e, int f, int g) {
        return e + f + g;
    }

}
