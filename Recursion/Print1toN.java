public class Print1toN {
    static void Print(int n) {
        if (n == 0) return;
        Print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        Print(n);
    }
}
