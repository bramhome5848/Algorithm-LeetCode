package D20210727;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 210. Course Schedule II
 */
public class Q0210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        //위상정렬 사용
        int[] inDegree = new int[numCourses];
        int[] result = new int[numCourses];
        int index = 0;
        int count = 0;

        List<Integer>[] outDegree = new List[numCourses];
        Queue<Integer> que = new LinkedList<>();

        for(int i=0 ; i<numCourses ; i++) {
            outDegree[i] = new ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
            outDegree[prerequisite[1]].add(prerequisite[0]);
        }

        for(int i=0 ; i<numCourses ; i++) {
            if(inDegree[i] == 0) que.add(i);
        }

        while(!que.isEmpty()) {
            int value = que.poll();
            result[index++] = value;
            count++;

            for(int i=0 ; i<outDegree[value].size() ; i++) {
                if(--inDegree[outDegree[value].get(i)] == 0) {
                    que.add(outDegree[value].get(i));
                }
            }
        }

        return count == numCourses ? result : new int[]{};
    }
}
