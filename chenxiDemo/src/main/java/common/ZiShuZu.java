package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ping
 * @Date 2022/11/24 18:04
 */
public class ZiShuZu {
    public static void main(String[] args) {
        int[] intsArr = new int[]{3, 5, 4, 2, 1};
        List list = new ArrayList();
        for (int i = 0; i < intsArr.length; i++) {
            list.add(intsArr[i]);
        }
        ArrayList<Integer> inlist = new ArrayList<>();
        List<ArrayList<Integer>> result = new ArrayList<>();
        ziShuZu(list, 0, inlist, result);
        int num = 0;
        for (List<Integer> finalList : result) {
            int[] ints = new int[finalList.size()];
            for (int i = 0; i < finalList.size(); i++) {
                ints[i] = finalList.get(i);
            }
            Arrays.sort(ints);
            if (ints[ints.length - 1] <= intsArr[0] || ints[ints.length - 1] <= intsArr[intsArr.length - 1]) {
                System.out.println(Arrays.toString(ints));
                num++;
            }
        }
        System.out.println("数量为" + num);
    }

    public static void ziShuZu(List<Integer> intsArr, int n, ArrayList<Integer> inlists, List<ArrayList<Integer>> finalList) {
        for (int i = n; i < intsArr.size(); i++) {
            inlists.add(intsArr.get(i));
            finalList.add(new ArrayList<>(inlists));
            ziShuZu(intsArr, i + 1, inlists, finalList);
            inlists.remove(inlists.size() - 1);
        }
    }
}
