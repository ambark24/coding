import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by amkumar on 7/15/2019.
 */

public class TwoNumbersTest {
   @Test
   public  void test1() {
      int [] nums = new int []{2,7,11,15};
      int target = 9;
      Assert.assertArrayEquals(new int[]{0,1}, TwoNumbers.twoSum(nums, target));


   }











}
