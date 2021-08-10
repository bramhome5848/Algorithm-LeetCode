package D20210810;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 310. Minimum Height Trees
 */
public class Q0310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        Queue<Integer> que = new LinkedList<>();
        List<Integer>[] data = new List[n];
        int[] inDegree = new int[n];

        for(int i=0 ; i<n ; i++) data[i] = new ArrayList<>();
        for(int[] edge : edges) {
            data[edge[0]].add(edge[1]);
            data[edge[1]].add(edge[0]);
            inDegree[edge[0]]++;
            inDegree[edge[1]]++;
        }

        for(int i=0 ; i<n ; i++) {
            if(inDegree[i] < 2) que.add(i); //only way
        }

        while(n > 2) {
            int size = que.size();
            n -= size;
            for(int i=0 ; i<size ; i++) {
                int node = que.poll();
                for(int next : data[node]) {
                    inDegree[next]--;
                    if(inDegree[next] == 1) que.add(next);
                }
            }
        }

        return new ArrayList<>(que);
    }
}
