import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L2022211851_5_Test {

    // 测试用例设计的总体原则：
    // 1. 边界值测试：测试空数组、单元素数组等边界情况。
    // 2. 等价类划分：将输入分为不同的等价类，如正数、负数、零等。
    // 3. 随机测试：对大数组进行随机测试，以验证算法在大数据量下的正确性。
    // 4. 特殊情况测试：测试包含相同元素的数组。
    // 5. 正常情况测试：测试包含不同元素的数组。

    @Test
    public void testNumSubseq() {
        Solution5 solution = new Solution5();

        // 测试目的：验证算法对于包含不同元素的数组，且目标和为数组元素之和的情况。
        // 测试示例 1
        int[] nums1 = {3, 5, 6, 7};
        int target1 = 9;
        int expected1 = 4;
        assertEquals("计算子序列的数量不正确", expected1, solution.numSubseq(nums1, target1));

        // 测试目的：验证算法对于包含重复元素的数组，且目标和为数组元素之和的情况。
        // 测试示例 2
        int[] nums2 = {3, 3, 6, 8};
        int target2 = 10;
        int expected2 = 6;
        assertEquals("计算子序列的数量不正确", expected2, solution.numSubseq(nums2, target2));

        // 测试目的：验证算法对于包含多个不同元素的数组，且目标和较大，需要组合多个元素的情况。
        // 测试示例 3
        int[] nums3 = {2, 3, 3, 4, 6, 7};
        int target3 = 12;
        int expected3 = 61;
        assertEquals("计算子序列的数量不正确", expected3, solution.numSubseq(nums3, target3));

        // 测试目的：验证算法对于空数组的处理。
        // 测试示例 4
        int[] nums4 = {};
        int target4 = 0;
        int expected4 = 1; // 空数组的情况下，存在一个空子序列，其和为0
        assertEquals("空数组情况下计算子序列的数量不正确", expected4, solution.numSubseq(nums4, target4));

        // 测试目的：验证算法对于单元素数组的处理。
        // 测试示例 5
        int[] nums5 = {1};
        int target5 = 1;
        int expected5 = 1; // 单元素数组的情况下，只有该元素本身可以构成子序列
        assertEquals("单元素数组情况下计算子序列的数量不正确", expected5, solution.numSubseq(nums5, target5));

        // 测试目的：验证算法对于包含负数的数组的处理。
        // 测试示例 6
        int[] nums6 = {-1, 2, 3, 4};
        int target6 = 5;
        int expected6 = 5; // 包含负数的情况下，需要正确计算子序列的数量
        assertEquals("包含负数的数组计算子序列的数量不正确", expected6, solution.numSubseq(nums6, target6));
    }
}
