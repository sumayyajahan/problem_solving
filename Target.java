public class Target {

    public static int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }

        return left;

    }


    public static void main(String[] args) {

        int[] a = {12, 13, 15, 19};

        System.out.println(""+ searchInsert(a, 20) );

    }
}
