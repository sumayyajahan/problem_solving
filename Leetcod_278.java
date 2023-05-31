public class Leetcod_278 {

    public static int firstBadVersion(int n){
        int left = 1;
        int right = n;
        int mid;
        int result = n;

        //Boolean isBadVersion = false;

        while(left<=right)
        {

            mid = (left+right)/2;

            if(isBadVersion(mid)){
              right = mid - 1;
            }else {
              left = mid +1;
            }
        }

        return  result;
    }



    public static void main(String[] args) {


        System.out.println(firstBadVersion(9));

    }
}
