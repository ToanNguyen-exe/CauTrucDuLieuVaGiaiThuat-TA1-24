import java.util.Scanner;

public class Fibonaci {
//    Bước 1: Nhập vào số nguyên n.
//    Bước 2: Nếu n < 0 thì: In "n phải lớn hơn hoặc bằng 0"
//    Ngược lại thực hiện bước 3.
//    Bước 3: Với i từ 0 đến n - 1: In Fibonacci(i)
//    Bước 4: Xây dựng hàm Fibonacci(n):
//    Nếu n = 0 hoặc n = 1 thì: Trả về 1
//    Ngược lại: Trả về Fibonacci(n - 1) + Fibonacci(n - 2)
//    Bước 5: Kết thúc.


//    Declare int n
//    Input n
//    If n<0
//      Print ‘n phai lon hon hoac bang 0 ’
//    Else
//      Print Fibonacci (n)
//    Fibonacci (n){
//    If n=0 or n=1
//    Return 1
//    Else
//    Return Fibonacci (n-1) + Fibonacci (n-2)}

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("n phai lon hon hoac bang 0");
        } else {
            System.out.println("Day Fibonacci:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        scanner.close();
    }
}
