class Solution(object):
    def moveZeroes(self, nums):
        for i, n in enumerate(nums[1:], start = 1):
            if n == 0:
                continue
            
            j = i
            while j > 0 and nums[j-1] == 0:
                j -= 1
                
            nums[i], nums[j] = 0, n    
        