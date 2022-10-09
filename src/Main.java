import static Lib.Addition.add;
import static Lib.Subtraction.subtract;
import static Lib.Multiplication.multiply;
import static Lib.Division.divide;
import static Lib.Comparing.compare;

public class Main {
    public static void main(String[] args) {
        String a = "acb124124abc",
                b = "abc123";
        System.out.println(divide(a, b).equals("10165b9"));
    }
}