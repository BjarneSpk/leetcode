struct Solution {}

impl Solution {
    pub fn check_powers_of_three(n: i32) -> bool {
        match n % 3 {
            2 => false,
            _ if n != 0 => Self::check_powers_of_three(n / 3),
            _ => true,
        }
    }
}
