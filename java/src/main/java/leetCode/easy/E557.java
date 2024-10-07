package leetCode.easy;

public class E557 {
    public String reverseWords(String s) {
        char[] sentence = s.toCharArray();
        int start = 0, end = 0;
        for (int i = 0; i <= sentence.length; i++) {
            if (i != sentence.length && sentence[i] != ' ') continue;
            end = i - 1;
            for (; start < end; start++, end--) {
                char tmp = sentence[start];
                sentence[start] = sentence[end];
                sentence[end] = tmp;
            }
            start = i + 1;
        }
        return new String(sentence);
    }
}
