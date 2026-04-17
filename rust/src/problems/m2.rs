use rust::utils::list::ListNode;

pub struct Solution {}

impl Solution {
    pub fn add_two_numbers(
        l1: Option<Box<ListNode>>,
        l2: Option<Box<ListNode>>,
    ) -> Option<Box<ListNode>> {
        let mut head = Box::new(ListNode::new(-1));
        let mut tail = &mut head;
        let mut current = (l1, l2);
        let mut carry = 0;
        while current.0.is_some() || current.1.is_some() || carry != 0 {
            let (c0, c1) = current;
            let sum = c0.as_ref().map_or(0, |n| n.val) + c1.as_ref().map_or(0, |n| n.val) + carry;
            carry = sum / 10;

            tail.next = Some(Box::new(ListNode::new(sum % 10)));
            tail = tail.next.as_mut().unwrap();

            current = (c0.and_then(|n| n.next), c1.and_then(|n| n.next));
        }

        head.next
    }
}
