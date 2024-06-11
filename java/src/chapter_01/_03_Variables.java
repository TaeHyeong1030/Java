package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "자바"; // name이라는 문자열 변수 선언, 프로그래밍에서는 등호가 있으면 오른쪽에 있는
                             // 어떤값을 왼쪽의 변수에다가 또는 객체에다가 집어넣겠다는 것
        int hour = 14;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // 하나의 문자를 표현할때 char형, 여러 문자를 표현할때 string형
        name = "강백호"; //변수는 언제든지 값을 바꿀 수 있다.
        System.out.println(name + " 님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789; //정밀한 소수를 사용할 때
        float f = 3.14123456789F; //간단한 소수를 사용할 때
        System.out.println(d);
        System.out.println(f);

        long L = 1000000000000L; //범위가 21억을 초과하지 않으면 int형, 21억을 초과하면 long형 사용
        L = 1_000_000_000_000L;
        System.out.println(L);
    }
}
