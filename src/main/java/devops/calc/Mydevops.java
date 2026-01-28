package devops.calc;

public class Mydevops {

    // Calculator methods
    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public void show() {
        System.out.println("Hello GitHub Actions");
    }

    public static void main(String[] args) {

        // Create object
        Mydevops calc = new Mydevops();

        // Use the same object
        System.out.println("Sum is " + calc.sum(20, 10));
        System.out.println("Diff is " + calc.diff(20, 10));
        System.out.println("Mul is " + calc.mul(20, 10));
        System.out.println("Div is " + calc.div(20, 10));
        System.out.println("Mod is " + calc.mod(20, 10));

        calc.show();
    }
}
