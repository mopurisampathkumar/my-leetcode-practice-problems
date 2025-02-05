# LeetCode Practice Solutions

Welcome to my LeetCode practice repository! This repository contains my solutions to various LeetCode problems, along with my thought process, approach, and time complexity analysis for each problem.

## Table of Contents
- [About](#about)
- [Problems Solved](#problems-solved)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)

## About
This repository is a collection of my solutions to LeetCode problems. I use this to track my progress, improve my problem-solving skills, and share my approaches with others. Each problem includes:
- Problem description
- My approach to solving the problem
- Solution code
- Time and space complexity analysis

## Problems Solved
Here is a list of problems I've solved so far:

| Problem ID | Problem Name | Difficulty | Solution Link |
|------------|--------------|------------|---------------|
| 1          | Two Sum      | Easy       | [Solution](https://github.com/mopurisampathkumar/LEETCODE-PRACTICE-PROBLEMS/blob/main/1-two-sum/two-sum.java) |
| 2          | Add Two Numbers | Medium | [Solution](./solutions/add-two-numbers.md) |
| 3          | Longest Substring Without Repeating Characters | Medium | [Solution](./solutions/longest-substring.md) |
| ...        | ...          | ...        | ...           |

(Add more rows as you solve more problems.)

---

## Example Problem: Two Sum

### Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`. You may assume that each input would have exactly one solution, and you may not use the same element twice.

**Example:**

### Approach
1. Use a hash map to store the difference between the target and each element as we iterate through the array.
2. For each element, check if it exists in the hash map.
   - If it does, return the current index and the index stored in the hash map.
   - If it doesn't, store the difference (target - current element) in the hash map with its index.

### Solution Code
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] a = new int[2];
        for(int i = 0; i < nums.length ; i++){
            int value = target - nums[i];
            if(map.containsKey(value)){
                return new int[]{i,map.get(value)};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
```
### Time Complexity
Time Complexity: O(n), where n is the number of elements in the array. We traverse the list only once.

Space Complexity: O(n), as we store elements in a hash map.

### How to Use
Clone the repository:
``` git clone https://github.com/your-username/your-repo.git```

Navigate to the problem you're interested in:
``` cd solutions ```
Open the solution file to view the code and explanation.
