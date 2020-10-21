package com.leetcode_1;

import java.util.HashSet;
import java.util.Set;

//	https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
//	3.���ظ��ַ�����Ӵ���
public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		// ��ϣ���ϣ���¼ÿ���ַ��Ƿ���ֹ�
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // ��ָ�룬��ʼֵΪ -1���൱���������ַ�������߽����࣬��û�п�ʼ�ƶ�
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // ��ָ�������ƶ�һ���Ƴ�һ���ַ�
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // ���ϵ��ƶ���ָ��
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // �� i �� rk ���ַ���һ�����������ظ��ַ��Ӵ�
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
