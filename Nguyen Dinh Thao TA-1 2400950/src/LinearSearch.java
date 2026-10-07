public class LinearSearch {
    //    Bước 1: Bắt đầu từ phần tử bên trái ngoài cùng nhất của mảng và so sánh từng phần tử trong mảng với phần tử cần tìm
    //    Bước 2: Nếu phần tử nào trùng với phần tử cần tìm thì trả về chỉ số của phần tử đó trong mảng
    //    Bước 3: Nếu không có phần tử nào trùng thì trả về -1


    // Declare array arr
    // Declare int x
    // Input arr
    // Input x
    // Declare int n = length(arr)
    // For i = 0 to n - 1
    //     If arr[i] = x
    //         Return i
    //     End If
    // End For
    // Return -1

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 47, 59, 23, 24};
        int x = 10;
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Khong tim thay phan tu");
        } else {
            System.out.println("Tim thay tai vi tri: " + result);
        }
    }
}

