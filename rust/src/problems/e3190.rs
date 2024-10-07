pub struct Solution {}

impl Solution {
    pub fn minimum_operations(nums: Vec<i32>) -> i32 {
        nums.iter().map(|n| (n - (n / 3 * 3)).abs().signum()).sum()
    }
}
