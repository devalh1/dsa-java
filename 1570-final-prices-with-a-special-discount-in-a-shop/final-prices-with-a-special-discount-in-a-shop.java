class Solution {
    public int[] finalPrices(int[] prices) {
        int output[]= new int[prices.length];
        for(int i = 0;i<prices.length;i++){
             output[i]=prices[i];
                for(int j = i+1;j<prices.length;j++){    
                    if(prices[i]>=prices[j]){
                        output[i]= prices[i]-prices[j];
                        break;
                    }
                    else
                        output[i] = prices[i];
                }
        }
        return output;
    }
}