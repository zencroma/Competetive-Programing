import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.transform.Templates;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {
    public boolean ContainsDuplicate(int[] nums) {
// Use linked hashset to store distinct numbers
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            // If the set already contains the number, then it's a duplicate
            if (set.contains(nums[i])) {
                return true;
            }
        }
        return false;

    }
}