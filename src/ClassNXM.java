public class ClassNXM {
    static int r = 3;
    static int c = 4;
    static int[][] arr;

    public static void main(String[] args) {

        int r = 3;
        int c = 4;
        int b = 1;
        int t = 2;

        arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[b][t] = 1;
                if (((arr[b][t] == 1 && arr[b + 1][t + 1] == 0)&&(b<r&&t<c))&&((arr[b-1][t-1]==0)&&b>0&&c>0)) {


                    arr[b + 1][t] = 1;
                    arr[b][t + 1] = 1;
                    arr[b + 1][t + 1] = 1;
                    arr[b + 1][t - 1] = 1;
                    arr[b - 1][t] = 1;
                    arr[b - 1][t+1] = 1;
                    arr[b][t - 1] = 1;
                    arr[b - 1][t - 1] = 1;
                    System.out.print(arr[i][j]+" ");
                }

                else
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }

        }
}


