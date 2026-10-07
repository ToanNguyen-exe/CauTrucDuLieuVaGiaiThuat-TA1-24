public class BubbleSort {
    //    Bước 1: Nhập vào mảng A gồm n số nguyên.
//    Bước 2: Bắt đầu từ phần tử đầu tiên, lần lượt xét các cặp phần tử liền kề nhau.
//    Bước 3: Nếu phần tử bên trái lớn hơn phần tử bên phải thì đổi chỗ hai phần tử.
//    Bước 4: Sau mỗi lượt duyệt, phần tử lớn nhất trong phần chưa được sắp xếp được đưa về cuối dãy.
//    Bước 5: Lặp lại quá trình trên với phần chưa được sắp xếp.
//    Bước 6: Khi tất cả các phần tử đã được sắp xếp theo thứ tự không giảm, kết thúc thuật toán.
//    Bước 7: Xuất mảng đã được sắp xếp.

    // Declare array A
// Input A
// Declare int n = length(A)
// For i = 0 to n - 2
//     For j = 0 to n - 2 - i
//         If A[j] > A[j + 1]
//             Declare temp = A[j]
//             A[j] = A[j + 1]
//             A[j + 1] = temp
//         End If
//     End For
// End For
// Print A


    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 9, 28, 29, 39, 35, 27};
        bubbleSort(arr);
        System.out.println("Mang sau khi sap xep:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
