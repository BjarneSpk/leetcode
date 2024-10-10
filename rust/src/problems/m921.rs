pub struct Solution {}

impl Solution {
    pub fn min_add_to_make_valid(s: String) -> i32 {
        let mut close = 0;
        let mut open = 0;
        for c in s.as_bytes() {
            if *c == b'(' {
                open += 1;
            } else if *c == b')' && open > 0 {
                open -= 1;
            } else {
                close += 1;
            }
        }
        open + close
    }
}
