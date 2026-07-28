class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int earliest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < m; j++) 
            {
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int startWaterAfterLand = Math.max(landFinish, waterStartTime[j]);
                int finishLandThenWater = startWaterAfterLand + waterDuration[j];
                int startLandAfterWater = Math.max(waterFinish, landStartTime[i]);
                int finishWaterThenLand = startLandAfterWater + landDuration[i];

                earliest = Math.min(earliest,
                           Math.min(finishLandThenWater, finishWaterThenLand));
            }
        }
        return earliest;
    }
}