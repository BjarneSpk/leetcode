struct Solution {}

impl Solution {
    pub fn min_operations(grid: Vec<Vec<i32>>, x: i32) -> i32 {
        let mut nums = Vec::with_capacity(grid.len() * grid[0].len());
        grid.iter()
            .for_each(|row| row.iter().for_each(|cell| nums.push(*cell)));
        nums.sort_unstable();

        let median = nums[(nums.len() - 1) / 2];

        let mut min_operations = 0;

        for i in nums {
            if i % x != median % x {
                return -1;
            }
            min_operations += (median - i).abs() / x
        }

        min_operations
    }
}
