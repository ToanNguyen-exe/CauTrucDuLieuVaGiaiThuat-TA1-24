//thuật toán bằng ngôn ngữ java
public class Cau1LinearSearch {
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int kq = search(arr, x);
        System.out.println(kq != -1 ? "Vị trí: " + kq : "Không tìm thấy");
    }
}
