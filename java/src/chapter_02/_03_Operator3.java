package chapter_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다. (참이면 true, 거짓이면 false 로 결과가 나온다.)
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다.
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다.
        System.out.println(5 >= 7); // 5는 7보다 크거나 같다.

        System.out.println(5 < 3); // 5는 3보다 작다. (false)
        System.out.println(5 <= 3); // 5는 3보다 작거나 같다.

        System.out.println(5 == 5); // 5는 5와 같다. (같다라고 표현할때는 =을 두개 붙여야 됨.)
        System.out.println(5 == 3); // 5는 3과 같다.
        System.out.println(5 != 5); // 5는 5와 같지 않다.
        System.out.println(5 != 3); // 5는 3과 같지 않다.
    }
}
