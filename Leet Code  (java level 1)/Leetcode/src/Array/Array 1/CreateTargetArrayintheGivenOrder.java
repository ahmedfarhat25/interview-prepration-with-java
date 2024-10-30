public class CreateTargetArrayintheGivenOrder
{
    class Solution
    {
        public int[] createTargetArray(int[] nums, int[] index)
        {
            ArrayList<Integer> arr= new ArrayList<>();
            int arr1[]=new int[nums.length];
            for(int i=0; i<nums.length; i++)
            {
                arr.add(index[i],nums[i]);
            }
            for(int i=0; i<arr.size(); i++){
                arr1[i]=arr.get(i);
            }
            return arr1;
        }
    }
}
