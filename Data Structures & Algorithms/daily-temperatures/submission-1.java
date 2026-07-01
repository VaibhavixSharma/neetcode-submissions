class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr = new int[temp.length];
        for(int i = 0; i<temp.length; i++){
            arr[i] = 0;
            for(int j = i+1; j<temp.length;j++){
                if(temp[i]<temp[j]){
                    arr[i] = j-i;
                    break;
                }
            }
        }
        return arr;
    }
}
