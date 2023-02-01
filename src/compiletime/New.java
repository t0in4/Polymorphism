package compiletime;

public class New {
    int a, b, c;
    public New() { }
    public New(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public New(float a, float b, float c) {
        this.a = (int) a;
        this.b = (int) b;
        this.c = (int) c;
    }

    public New(String a, String b, String c) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        this.c = Integer.parseInt(c);
    }
}
