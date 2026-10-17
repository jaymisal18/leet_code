class Solution {

    public int minSwaps(int[] nums) {

        int n = nums.length;
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
            arr[i][2] = digitSum(nums[i]);
        }

        
        Arrays.sort(arr, (a, b) -> {
            if (a[2] != b[2]) {
                return Integer.compare(a[2], b[2]);
            }
            return Integer.compare(a[1], b[1]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] || arr[i][0] == i) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                cycleSize++;
                j = arr[j][0];
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }
     private int digitSum(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

}