package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting 정수형에서 실수형으로, 실수형에서 정수형으로

        //int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        //float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // 93.0 + 98.8, 정수와 실수 부위 계산인데 그 결과가 실수로 들어 갈때는 자동으로 double이 들어가서 굳이 안적어도 됨.
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        // 정수를 실수로 형 변환
        double convertedScoreDouble = score; // 191 -> 191.0
        //int -> long -> float -> double 점점 커지는 범위 (자동 형변환) 앞에 (int) , (double) 안붙여도됨

        //실수를 정수로 형 변환
        int convertedScoreint = (int) score_d; // 191.9 -> 191
        //double -> float -> long -> int 는 (수동 형변환) 점점 더 작아질때는 (int) , (double) 붙여야됨.

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // 괄호속에 들어가는 데이터가 올바른 정수 또는 실수가 아닐때
        int error = Integer.parseInt("자바");
        //따옴표 속에 있는 데이터가 올바를때만 출력이 됨.

    }
}
