import java.util.*;
public class sunsequence_array_sum
{
    public static void main(String args[])
    {
        int nums[]={1,1,2};
        int sum=0;
        int idx=0;
        int target=2;
        List<Integer> curr=new ArrayList<>();
        printsub(idx,nums,sum,curr,target);
    }
    public static void printsub(int idx, int nums[],int sum, List<Integer> curr, int target)
    {
        if (idx == nums.length) {
            if(sum==target)
                System.out.println(curr);
            return;
        }
        //take condition
        curr.add(nums[idx]);
        printsub(idx+1, nums,sum+ nums[idx] ,curr, target);
        //nottake calling
        curr.remove(curr.size()-1);
        printsub(idx+1, nums, sum, curr, target);
    }
}
