package C1;

public class LinearSearch {
    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 10, 40, 60, 9};
        int x = -40;
        int result = search(arr, x);
        if (result == -1)
            System.out.println("Phần tử không có trong mảng");
        else
            System.out.println("Phần tử ở vị trí " + result);
    }
}

