class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        // for(int i=0;i<boxTypes.length;i++){
        //      for(int j=0;j<boxTypes[0].length;j++){
        //     System.out.print(boxTypes[i][j]+" ");
        // }
        //     System.out.println();
        // }
        int result=0;
        for(int i=0;i<boxTypes.length;i++)
        {
            if(truckSize>0)
            {
                if(truckSize>=boxTypes[i][0])
                {    
                   truckSize = truckSize - boxTypes[i][0]; 
                    result = result + (boxTypes[i][0]*boxTypes[i][1]);
                }
                else
                {
                    
                    result = result + (truckSize*boxTypes[i][1]);
                    truckSize = 0;
                }
                
                
                
                
            }
            else
            {
                break;
            }
        }
        return result;
    }
}