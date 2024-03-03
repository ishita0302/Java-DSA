class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return sol(dp,m-1,n-1);
        //return dp[n][m];
    }
    public int sol(int[][] dp,int m, int n){
        if(n==0 || m==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n]=sol(dp,m-1,n)+sol(dp,m,n-1);
    }
}
