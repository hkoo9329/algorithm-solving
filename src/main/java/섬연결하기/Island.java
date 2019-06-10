package 섬연결하기;

import java.util.ArrayList;
import java.util.List;

public class Island {

    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[][] island = new int[n][n];
        int minCost = costs[0][2];
        int minIsland1 = costs[0][0], minIslanc2 = costs[0][1];

        List visited = new ArrayList();

        for (int i = 0; i < n; i++) {
            visited.add(false);
        }
        for (int i=0;i<costs.length;i++){
            island[costs[i][0]][costs[i][1]] = costs[i][2];
            island[costs[i][1]][costs[i][0]] = costs[i][2];

            if (costs[i][2] < minCost){
                minCost = costs[i][2];
                minIsland1 = costs[i][0];
                minIslanc2 = costs[i][1];
            }
        }
        while (visited.contains(false)){
            answer+=minCost;
            visited.set(minIsland1, true);
            visited.set(minIslanc2, true);
            minCost = (int)1e9;

            for (int i=0;i<n;i++){
                if (visited.get(i).equals(true)){
                    for (int j=0;j<n;j++){
                        if (island[i][j] != 0 && visited.get(j).equals(false)
                        && minCost > island[i][j]){
                            minCost = island[i][j];
                            minIsland1 = i;
                            minIslanc2 = j;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
