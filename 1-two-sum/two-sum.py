class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        storedNumbers = {}
        for i, num in enumerate(nums):
            complementary = target - num
            if complementary in storedNumbers:
                return [storedNumbers[complementary], i]
            storedNumbers[num] = i