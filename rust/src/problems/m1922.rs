struct Solution;

impl Solution {
    const SCALAR: i64 = 10_i64.pow(9) + 7;
    pub fn count_good_numbers(n: i64) -> i32 {
        (Self::count_permutations(5, (n + 1) / 2) * Self::count_permutations(4, n / 2)
            % Self::SCALAR) as i32
    }

    fn count_permutations(base: i64, n: i64) -> i64 {
        match n {
            0 => 1,
            _ if n % 2 == 0 => Self::count_permutations(base.pow(2) % Self::SCALAR, n / 2),
            _ => {
                (base * Self::count_permutations(base.pow(2) % Self::SCALAR, n / 2)) % Self::SCALAR
            }
        }
    }
}
