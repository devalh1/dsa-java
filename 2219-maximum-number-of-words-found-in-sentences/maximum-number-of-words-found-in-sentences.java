class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i = 0;i<sentences.length;i++){
            int spaceCount=0;
            int j = 0;
            int sentenceLength = sentences[i].length();
            do{
                if(sentences[i].charAt(j)==' '){
                    spaceCount++;
                }
                j++;
            }while(j<sentenceLength);
            if(max<spaceCount)
                max = spaceCount;
        }
        return max+1;
    }
}