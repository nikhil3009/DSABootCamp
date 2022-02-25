package Nick;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {1,2,3},
                {1,3,3}
        };
        System.out.println(maxAcount(arr));
    }
    static int maxAcount(int[][] a){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<a.length;person++){
            int sum = 0;
            for(int accounts = 0; accounts<a[person].length;accounts++){

                sum += a[person][accounts];
                if(sum>ans){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
