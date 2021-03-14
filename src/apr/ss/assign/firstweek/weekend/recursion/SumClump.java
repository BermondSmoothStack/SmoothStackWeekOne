package apr.ss.assign.firstweek.weekend.recursion;

import java.util.Stack;

public class SumClump {

    public static boolean groupSumClump(Integer index, Integer[] group, Integer target) {
        if (index == 0)
            group = clump(group);

        if (index >= group.length) {
            return target == 0;
        } else {
            return groupSumClump(index + 1, group, target - group[index]) ||
                    groupSumClump(index + 1, group, target);
        }
    }

    private static Integer[] clump(Integer[] raw){
        Stack<Integer> clumped = new Stack<>();
        Integer subClump = raw[0];
        for (int i = 1; i < raw.length;i++) {
            if (raw[i - 1].equals(raw[i]))
                subClump += raw[i];
            else {
                clumped.push(subClump);
                subClump = raw[i];
            }
        }
        clumped.push(subClump);
        return clumped.toArray(new Integer[0]);
    }
}
