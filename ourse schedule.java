class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix= new int[numCourses][numCourses];
        int[] arr=new int[numCourses];
        int c=0;
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            if(matrix[b][a]==0){
                arr[a]++;
            }
            matrix[b][a]=1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int s=q.poll();
            c++;
            for(int i=0;i<numCourses;i++){
                if(matrix[s][i]!=0){
                    if(--arr[i]==0){
                        q.offer(i);
                    }
                }
            }
        }

        return c==numCourses;
    }
}
