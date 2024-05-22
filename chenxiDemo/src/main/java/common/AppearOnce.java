package common;


/**
 * @Author ping
 * @Date 2022/8/10 22:56
 * 只出现一次的字符
 */
public class AppearOnce {
    public static void main(String[] args) {
        once("jifddsfjg");
    }
    public static void once(String str){
        String[] strArr = str.split("");
        for (int i = 0; i < strArr.length; i++) {
            int num = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])){
                    num++;
                }
            }
            if (num == 1){
                System.out.println(strArr[i]);
            }
        }
    }
}
