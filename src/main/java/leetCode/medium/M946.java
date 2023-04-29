package leetCode.medium;

import java.util.Stack;

/*
 * @lc app=leetcode id=946 lang=java
 *
 * [946] Validate Stack Sequences
 */

// @lc code=start
public class M946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j= 0;
        while ( i < pushed.length || j < popped.length ) {
            if ( !stack.empty() && stack.peek() == popped[j] ) {
                stack.pop();
                j++;
            } else {
                stack.push( pushed[i] );
                i++;
            }
            if ( i == pushed.length && !stack.empty() && stack.peek() != popped[j] ) {
                break;
            }
        }
        return stack.empty();
    }
}
// @lc code=end

