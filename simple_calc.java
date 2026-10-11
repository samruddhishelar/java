interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

class SimpleCalc implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class simple_calc {
    public static void main(String[] args) {
        SimpleCalc obj = new SimpleCalc();

        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.subtract(10, 5));
    }
}
