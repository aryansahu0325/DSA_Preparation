import java.util.*;
public class subsequence_sumcount
{
    public static void main(String args[])
    {
        int nums[]={1,2,3,4,5,6};
        int sum=0;
        int idx=0;
        int target=8;
        List<Integer> curr=new ArrayList<>();
        System.out.println(printsub(idx,nums,sum,curr,target));
    }
    public static int printsub(int idx, int nums[],int sum, List<Integer> curr, int target)
    {
        if (idx == nums.length) {
            if(sum==target) {
                return 1;
            }
            else
                return 0;
        }
        //take condition
        curr.add(nums[idx]);
        int take=printsub(idx+1, nums,sum+ nums[idx] ,curr, target);
        //nottake calling
        curr.remove(curr.size()-1);
        int nottake=printsub(idx+1, nums,sum ,curr, target);
            return take+nottake;
    }
}
