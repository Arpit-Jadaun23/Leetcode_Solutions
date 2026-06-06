class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int srow = 0, scol = 0, erow = m-1, ecol = n-1;

        while(srow <= erow && scol <= ecol){
            //top boundary
            for(int j=scol; j<=ecol; j++){
                list.add(matrix[srow][j]);
            }

            //right boundary
            for(int i=srow+1; i<=erow; i++){
                list.add(matrix[i][ecol]);
            }

            //bottom boundary
            for(int j=ecol-1; j>=scol; j--){
                if(srow == erow){
                    break;
                }
                list.add(matrix[erow][j]);
            }

            //left boundary
            for(int i=erow-1; i>=srow+1; i--){
                if(scol == ecol){
                    break;
                }
                list.add(matrix[i][scol]);
            }

            srow++; erow--; scol++; ecol--;
        }

        return list;
    }
}