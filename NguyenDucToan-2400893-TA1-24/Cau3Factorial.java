//thuật toán bằng ngôn ngữ java
class Factorial {
    public static long tinhGiaiThua(int n) {
        if (n <= 1) {
            return 1;
        }
        return (long) n * tinhGiaiThua(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + tinhGiaiThua(n));
    }
}