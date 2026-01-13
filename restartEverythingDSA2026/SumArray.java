package restartEverythingDSA2026;


class SumArray {

    static int sum(int[] arr, int left, int right) {

        // Base case (sirf ek element)
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        // Divide + Conquer + Combine
        return sum(arr, left, mid) + sum(arr, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(sum(arr, 0, arr.length - 1));
    }
}

