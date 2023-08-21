class Solution {
    // problem : https://leetcode.com/problems/pascals-triangle-ii/description/
    // level : easy
    public List<Integer> getRow(int rowIndex) {
        List<Integer> aws = new ArrayList();
        aws.add(1);
        if(rowIndex == 0){
            return aws;
        }
        aws.add(1);
        if(rowIndex == 1){
            return aws;
        }
        for(int i =1; i < rowIndex; i++){
            aws.add(0,1);
            for(int j = 1; j < aws.size() -1; j++){
                aws.set(j, aws.get(j) + aws.get(j+1));
            }
        }
        return aws;
    }
}