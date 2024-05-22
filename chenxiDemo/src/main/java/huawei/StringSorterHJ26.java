package huawei;

import java.util.*;

/**
 * @Description 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type 输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA 输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * <p>
 * 如，输入： By?e 输出： Be?y
 * <p>
 * 数据范围：输入的字符串长度满足
 * <p>
 * 1≤n≤1000
 * <p>
 * 输入描述：
 * 输入字符串
 * 输出描述：
 * 输出字符串
 * 示例1
 * 输入：
 * A Famous Saying: Much Ado About Nothing (2012/8).
 * 复制
 * 输出：
 * A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
 * @Author ping
 * @Date 2023/12/22 15:04
 */
public class StringSorterHJ26 {
    public static String customSort(String input) {
        char[] charArray = input.toCharArray();
        List<Character> letters = new ArrayList<>();
        List<Character> nonLetters = new ArrayList<>();

        for (char ch : charArray) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            } else {
                nonLetters.add(ch);
            }
        }

        Collections.sort(letters, new CustomComparator());

        int letterIndex = 0;
        int nonLetterIndex = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                charArray[i] = letters.get(letterIndex++);
            } else {
                charArray[i] = nonLetters.get(nonLetterIndex++);
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "A Famous Saying: Much Ado About Nothing (2012/8).";
        String output = customSort(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

class CustomComparator implements Comparator<Character> {
    @Override
    public int compare(Character c1, Character c2) {
        int result = Character.toLowerCase(c1) - Character.toLowerCase(c2);
        return (result != 0) ? result : c1 - c2;
    }
}
