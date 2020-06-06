package strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/6 11:22
 */
public class JDK {
    public static void main(String[] args) {
        Integer[] data = {9, 1, 2, 8, 4, 3};
        //实现降序排序，返回-1放左边，1放右边，0保持不变
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        //策略
//        public static <T> void sort(T[] a, Comparator<? super T> c) {
//            if (c == null) {
//                sort(a);
//            } else {
//                if (Arrays.LegacyMergeSort.userRequested)
//                    legacyMergeSort(a, c);
//                else
//                    TimSort.sort(a, 0, a.length, c, null, 0, 0);
//            }
//        }
        Arrays.sort(data,comparator);
        System.out.println(Arrays.toString(data));
    }
}
