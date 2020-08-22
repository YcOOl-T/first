/**
 * Author:ty
 * 2020/7/25
 */
public class TestSuanFa {
    public static void main(String[] args) {
        int nums[]={0,3,4,7,0};
        for (Integer i:nums
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=0){
                nums[j]=nums[i];
                if (i!=j){
                    nums[i]=0;
                }
                j++;
            }

        }
        for (Integer i:nums
        ) {
            System.out.print(i+" ");
        }
    }
}
