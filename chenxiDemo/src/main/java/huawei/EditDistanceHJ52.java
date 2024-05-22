package huawei;

/**
 * @Description Levenshtein 距离，又称编辑距离，指的是两个字符串之间，由一个转换成另一个所需的最少编辑操作次数。许可的编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符。编辑距离的算法是首先由俄国科学家 Levenshtein 提出的，故又叫 Levenshtein Distance 。
 * 例如：
 * 字符串A: abcdefg
 * 字符串B: abcdef
 * 通过增加或是删掉字符 ”g” 的方式达到目的。这两种方案都需要一次操作。把这个操作所需要的次数定义为两个字符串的距离。
 * 要求：给定任意两个字符串，写出一个算法计算它们的编辑距离。
 * 1≤len(str)≤1000
 * 输入描述：
 * 每组用例一共2行，为输入的两个字符串
 * 输出描述：
 * 每组用例输出一行，代表字符串的距离
 * 示例1
 * 输入：
 * abcdefg
 * abcdef
 * 复制
 * 输出：
 * 1
 *
 *
 * 创建一个二维数组dp，其中dp[i][j]表示字符串A的前i个字符和字符串B的前j个字符之间的编辑距离。
 *
 * 初始化数组，确保dp[i][0] = i和dp[0][j] = j，因为将一个字符串变为空字符串的编辑距离为其长度。
 *
 * 使用动态规划的方法填充数组。遍历字符串A和B的每个字符，计算编辑距离。如果当前字符相等，dp[i][j] = dp[i-1][j-1]；否则，取替换、插入、删除的最小值，并加上相应的编辑操作次数。
 *
 * 最终dp[lenA][lenB]即为两个字符串的编辑距离。
 * @Author ping
 * @Date 2023/12/22 15:33
 */
public class EditDistanceHJ52 {
    /**
     * 计算两个字符串之间的Levenshtein距离。
     *
     * @param str1 第一个字符串
     * @param str2 第二个字符串
     * @return 两个字符串之间的Levenshtein距离
     */
    public static int getDistance(String str1, String str2) {
        int m = str1.length(); // 第一个字符串的长度
        int n = str2.length(); // 第二个字符串的长度
        int[][] dp = new int[m + 1][n + 1]; // 用于存储每个位置的编辑距离的二维数组

        // 初始化dp数组的第一行和第一列
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // 第一行的每个元素都等于i，表示将第一个字符串的前i个字符插入到第二个字符串的开头
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // 第一列的每个元素都等于j，表示将第二个字符串的前j个字符插入到第一个字符串的开头
        }

        // 填充dp数组的剩余部分
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // 如果两个字符相同，则编辑距离为dp[i-1][j-1]
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // 如果两个字符不同，则编辑距离为1加上三个条件中的最小值
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        // 循环遍历二维数组中的每个元素，并将其打印到控制台上
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m][n]; // 返回dp数组的最后一个元素，即为两个字符串之间的编辑距离
    }

    public static void main(String[] args) {
        String str1 = "abcd"; // 第一个字符串
        String str2 = "abce"; // 第二个字符串
        int distance = getDistance(str1, str2); // 计算两个字符串之间的编辑距离
        System.out.println("The Levenshtein distance between " + str1 + " and " + str2 + " is " + distance); // 输出结果
    }
}
