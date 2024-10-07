mod problems;

use rust::utils;

use problems::m2181;

fn main() {
    let list = m2181::Solution::create();
    let result = m2181::Solution::merge_nodes(list);
}
