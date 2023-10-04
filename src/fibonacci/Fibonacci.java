package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20; // 출력할 피보나치 수열의 길이

        // 피보나치 수열 계산
        int[] fibonacci = new int[n]; //배열 선언 & new 연산자로 생성
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        // 피보나치 수열 출력
        System.out.println("피보나치 수열:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}