package Logic;

public class CalculatorLogic {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int into(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return a / b;
    }

    public static boolean isFieldEmpty(String n1, String n2) {
        return (n1.equals("") && n2.equals(""));
    }

    public static boolean isDataValid(String n1, String n2) {
        boolean isNumber = true;
        try {
            if (n1.equals("") && n2.equals("")) {
                isNumber = true;
            } else {
                Integer.parseInt(n1);
                Integer.parseInt(n2);
            }
        } catch (NumberFormatException err) {
            isNumber = false;
        } catch (Exception e) {
            System.out.println(e);
        }

        return isNumber;
    }

    public static void main(String[] args) {

    }
}
