import java.util.Arrays;

public class change {
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 9, 8, 7, 1, 2, 4};
        // 상훈이가 버블소트함수를 제작하고 정렬전 a와 정렬후 b를 출력하시오.
        System.out.println("정렬 전 a : " + Arrays.toString(a));
        int []b = bublesort(a);
        
        System.out.println("정렬 후 b : " + Arrays.toString(b));

        // 상배가 이진탐색 함수를 제작하고 b에서 3의 인덱스를 찾으시오.
    }
    public static int[] bublesort(int a[]){
        for(int i = 0; i < a.length-1; i++){
            int temp = 0;
            for(int j = 0; j < a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;

    }
}