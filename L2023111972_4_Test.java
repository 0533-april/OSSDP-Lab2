public class L2023111972_4_Test {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        
        // 测试用例1: 单个元素
        int[] nums1 = {10};
        int result1 = solution.maximumGap(nums1);
        System.out.println("测试1 - 单个元素 [10]: " + result1 + " (期望: 0) " + (result1 == 0 ? "YES" : "NO"));
        
        // 测试用例2: 两个元素
        int[] nums2 = {1, 2};
        int result2 = solution.maximumGap(nums2);
        System.out.println("测试2 - 两个元素 [1,2]: " + result2 + " (期望: 1) " + (result2 == 1 ? "YES" : "NO"));
        
        // 测试用例3: 示例用例
        int[] nums3 = {3, 6, 9, 1};
        int result3 = solution.maximumGap(nums3);
        System.out.println("测试3 - 示例 [3,6,9,1]: " + result3 + " (期望: 3) " + (result3 == 3 ? "YES" : "NO"));
        
        // 测试用例4: 重复元素
        int[] nums4 = {1, 1, 1, 1};
        int result4 = solution.maximumGap(nums4);
        System.out.println("测试4 - 重复元素 [1,1,1,1]: " + result4 + " (期望: 0) " + (result4 == 0 ? "YES" : "NO"));
        
        // 测试用例5: 大数值
        int[] nums5 = {1, 1000000000};
        int result5 = solution.maximumGap(nums5);
        System.out.println("测试5 - 大数值 [1,1000000000]: " + result5 + " (期望: 999999999) " + (result5 == 999999999 ? "YES" : "NO"));
        
        // 测试用例6: 逆序数组
        int[] nums6 = {9, 6, 3, 1};
        int result6 = solution.maximumGap(nums6);
        System.out.println("测试6 - 逆序 [9,6,3,1]: " + result6 + " (期望: 3) " + (result6 == 3 ? "YES" : "NO"));
        
        // 汇总结果
        System.out.println("\n=== 测试完成 ===");
        int passed = (result1 == 0 ? 1 : 0) + (result2 == 1 ? 1 : 0) + (result3 == 3 ? 1 : 0) + 
                     (result4 == 0 ? 1 : 0) + (result5 == 999999999 ? 1 : 0) + (result6 == 3 ? 1 : 0);
        System.out.println("通过: " + passed + "/6 个测试用例");
    }
}