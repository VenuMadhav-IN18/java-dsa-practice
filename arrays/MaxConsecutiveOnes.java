 
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        maxConsecutive(arr,k);
    }
    static void maxConsecutive(int[] arr,int k){
        int start=0;
        int end=0;
        int count=0;
        int maxlen=0;
        while(end<arr.length){
            if(arr[end]==0){
                count++;
            }
            if(count>k){
                if(arr[start]==0) count--;
                start++;

            }
            if(count<=k) maxlen=Math.max(maxlen, end-start+1);
            end++;
        }
        System.out.println(maxlen);
    }
}
