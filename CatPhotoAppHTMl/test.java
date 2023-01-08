public class test{
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        int n = 4;
        int k = 3;
        int count = 0;
        int sum = 0;
        for (int i=0;i<=n-k;i++){
            int temp=i;
            for(int j=1;j<=k;j++){
                sum += arr[temp];
                temp +=1;
            }
            if(sum%2==0){
                count++;
            }
            sum = 0;
        }
        if(count==0){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }
    }
}