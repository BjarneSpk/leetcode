use crate::utils::list::ListNode;

pub struct Solution {}

impl Solution {
    pub fn merge_nodes(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        let mut new_head: Option<Box<ListNode>> = None;
        let mut new_tail = &mut new_head;

        let mut current = head;
        let mut sum = 0;
        while let Some(mut node) = current {
            if node.val == 0 {
                if sum != 0 {
                    let new = Some(Box::new(ListNode::new(sum)));
                    *new_tail = new;
                    new_tail = &mut new_tail.as_mut().unwrap().next;
                }
                sum = 0;
            } else {
                sum += node.val;
            }
            current = node.next.take();
        }
        new_head
    }

    pub fn create() -> Option<Box<ListNode>> {
        let mut head = Box::new(ListNode::new(0));
        for i in (0..10).rev() {
            let mut new = Box::new(ListNode::new(i));
            new.next = Some(head);
            head = new
        }

        Some(head)
    }
}
