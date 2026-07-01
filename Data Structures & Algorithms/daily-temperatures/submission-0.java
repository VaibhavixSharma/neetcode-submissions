class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr = new int[temp.length];
        int count = 0;
        for(int i = 0; i<temp.length; i++){
            arr[i] = 0;
            for(int j = i+1; j<temp.length;j++){
                count++;
                if(temp[i]<temp[j]){
                    arr[i] = count;
                    break;
                }
            }
            count = 0;
        }
        return arr;
    }
}
