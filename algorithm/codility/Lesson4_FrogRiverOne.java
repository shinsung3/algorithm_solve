package algorithm.codility;

public class Lesson4_FrogRiverOne {
    // you can also use imports, for example:
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }
    public static int solution(int X, int[] A) {
        // Implement your solution here
        // A[3] != 4
        // A[0] = 1 => 나뭇잎이 떨어진 것 파악
        // true, false?
        // A[1] = 3
        // A[6] = 5 == x true?
        // A[4] = 9 // index
        // A[7] = 4
        // A[9] = 2 ?? -> 9
        // x = 5
        // [T,T,T,T,T]
        // A[2] = 4
        // a = 2 A[2]
        // arr[2] = true
        int answer = -1;
        int cnt = X;
        boolean[] count = new boolean[X+1];
        for(int i=0; i<A.length; i++){
            //index
            if(A[i] > X){
                continue;
            }
            //이미 되어져있었다면
            if(count[A[i]]){
                continue;
            }
            count[A[i]] = true;
            cnt--;
            if(cnt == 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
