public class App {
    public static int f(int n) {
        int result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("factorial " + number + " = " + f(number));
    }
}
