
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = nums.get(0); 
        int min = nums.get(0); 

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i); 
            }
        }; 

        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) < min) {
                min = nums.get(j); 
            }
        }; 
        
        return max - min;
    }
}
