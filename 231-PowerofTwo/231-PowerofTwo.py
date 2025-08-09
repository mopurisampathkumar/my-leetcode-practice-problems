# Last updated: 8/9/2025, 11:29:53 AM
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        return n > 0 and not (n & n - 1)