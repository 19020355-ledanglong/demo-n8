import java.lang.Math;
public class Main extends Test {
    public Main() {
    }

    public Main(int b) {
        a = b;
    }

    public void setA(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        Main x = new Main(2);
        System.out.println(2 * (23.6 + 1.0));
    }
}