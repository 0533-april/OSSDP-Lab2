import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试用例设计原则：
 * 使用等价类划分方法，将输入划分为以下等价类：
 * 1. 数组长度：小于2、等于2、大于2
 * 2. 数组元素：有重复、无重复
 * 3. 数组顺序：已排序、逆序、乱序
 * 4. 数值范围：正常值、边界值（如0和最大值）
 */
public class L2023111972_4_Test {

    // 测试目的：验证当数组元素个数小于2时，返回0
    // 测试用例：数组长度为1
    @Test
    public void testSingleElement() {
        Solution4 solution = new Solution4();
        int[] nums = {10};
        int result = solution.maximumGap(nums);
        assertEquals(0, result);
    }

    // 测试目的：验证当数组有两个元素时，能正确计算差值
    // 测试用例：两个元素，正序
    @Test
    public void testTwoElements() {
        Solution4 solution = new Solution4();
        int[] nums = {1, 2};
        int result = solution.maximumGap(nums);
        assertEquals(1, result);
    }

    // 测试目的：验证示例用例是否正确
    // 测试用例：示例1
    @Test
    public void testExample1() {
        Solution4 solution = new Solution4();
        int[] nums = {3, 6, 9, 1};
        int result = solution.maximumGap(nums);
        assertEquals(3, result);
    }

    // 测试目的：验证有重复元素时，最大差值是否正确
    // 测试用例：所有元素相同
    @Test
    public void testDuplicateElements() {
        Solution4 solution = new Solution4();
        int[] nums = {1, 1, 1, 1};
        int result = solution.maximumGap(nums);
        assertEquals(0, result);
    }

    // 测试目的：验证大数值间隔是否正确
    // 测试用例：最小值和最大值
    @Test
    public void testLargeGap() {
        Solution4 solution = new Solution4();
        int[] nums = {1, 1000000000};
        int result = solution.maximumGap(nums);
        assertEquals(999999999, result);
    }
}