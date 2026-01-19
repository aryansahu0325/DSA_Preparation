import java.util.*;
public class subsequence_sumcheck
{
    public static void main(String args[])
    {
        int nums[]={1,1,2};
        int sum=0;
        int idx=0;
        int target=2;
        List<Integer> curr=new ArrayList<>();
        System.out.println(printsub(idx,nums,sum,curr,target));
    }
    public static boolean printsub(int idx, int nums[],int sum, List<Integer> curr, int target)
    {
        if (idx == nums.length) {
            if(sum==target) {
                System.out.println(curr);
                return true;
            }
            return false;
        }
        //take condition
        curr.add(nums[idx]);
        if(printsub(idx+1, nums,sum+ nums[idx] ,curr, target)){
            return true;
        }
        //nottake calling
        curr.remove(curr.size()-1);
        if(printsub(idx+1, nums,sum ,curr, target)){
            return true;
        }
        return false;
    }
}
