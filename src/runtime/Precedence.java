package runtime;

public class Precedence {
    int a, b, c;

    public Precedence(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculate(int e, int f, int g) {
        return this.a * (e + f + g);
    }
}
