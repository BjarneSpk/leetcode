use crate::utils::list::ListNode;

struct Solution {}

impl Solution {
    pub fn add_two_numbers(
        l1: Option<Box<ListNode>>,
        l2: Option<Box<ListNode>>,
    ) -> Option<Box<ListNode>> {
        let mut new_head: Box<ListNode> = Box::new(ListNode::new(0));
        let mut new_tail = &mut new_head;
        let mut carry = 0;

        let (mut nl, mut nr) = (l1, l2);
        while nl.is_some() || nr.is_some() || carry > 0 {
            let val1 = nl.as_ref().map_or(0, |node| node.val);
            let val2 = nr.as_ref().map_or(0, |node| node.val);

            let sum = val1 + val2 + carry;
            carry = sum / 10;

            new_tail.next = Some(Box::new(ListNode::new(sum % 10)));
            new_tail = new_tail.next.as_mut().unwrap(); // Move the tail forward

            if let Some(node) = nl {
                nl = node.next;
            } else {
                nl = None;
            }

            if let Some(node) = nr {
                nr = node.next;
            } else {
                nr = None;
            }
        }

        new_head.next
    }
}
