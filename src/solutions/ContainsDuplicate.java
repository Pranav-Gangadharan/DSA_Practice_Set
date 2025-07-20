package solutions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static void main(String[] args) {
    int[] nums ={1,2,3,1};
    System.out.println(solution(nums));
  }

  public static boolean solution(int[] nums) {

    // Brute Force approach
//    for(int i =0; i<nums.length;i++){
//      for(int j=i+1; j<nums.length;j++){
//        if(nums[i]== nums[j])
//            return true;
//      }
//    }
//    return false;

    //Hashset Approach

    Set<Integer> seen = new HashSet<>();

    for(int num : nums) {
      if(seen.contains(num)){
        return true;
      }
      seen.add(num);
    }
    return false;
  }
}
