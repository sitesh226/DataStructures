package Arrays;

public class PascalsTriangle {

    private static void getPascalsTriangle(int rows){
        int [][] result=new int[rows][rows];

        for(int i=0;i<rows;i++){
            for (int j=0;j<=i;j++){
                if(i==j||j==0){
                    result[i][j]=1;
                }else{
                    result[i][j]=result[i-1][j]+result[i-1][j-1];
                }
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getPascalsTriangle(5);
    }
}
