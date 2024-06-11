package chapter_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 결과는 2.5이지만 컴퓨터에서 정수 계산하면 결과도 정수로 나오기 떄문에 앞에있는 2만 나옴.
        System.out.println(2 / 4);
        System.out.println(4 % 2); // %는 나머지 연산, 나누고 남은 값
        System.out.println(5 % 2);

        //우선 순위 연산
        System.out.println(2 + 2 * 2); // 수학이랑 똑같이 곱하기 먼저 계산됨.
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2)); // 괄호 안에 있는 거 부터 계산하고 나머지 계산함

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        //val++; 문장의 연산을 먼저 수행하고 나서 벨류에다가 1이 더해짐.
        //++val; 밸류에다 1을 더하는 연산을 먼저 하고 다른 문장을 수행
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0 ctrl + d를 누르면 문장 그대로 아래에 복사됨
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
