public class RTM566 {
    public static void main(String[] args){
        RTM566 rtm = new RTM566();
        int[][] nums = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] newNums = rtm.matrixReshape(nums,r,c);
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.println(newNums[i][j]);
            }
        }

    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int row = nums.length;
        int column = nums[0].length;
        int[][] newM = new int [r][c];
        if((row * column) == (r * c)){
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    newM[i][j] = nums[(i * c + j )/column][(i * c + j )%column];
                }
            }
            
        }
        else{ 
            return newM = nums;
        }
        return newM;
        
    }
}