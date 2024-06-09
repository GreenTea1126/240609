package Test1;

//주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
//예를들어, 문자열 “Monitor”의 경우 “nit”을 반환해야 합니다.
//만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.
// 1.홀수인경우 2.가운데 길이 3글자 반환 3.3보다작으면 문자열 전체 반환

public class Test1 {
    public static void main(String[] args) {
        System.out.println(getMiddleThree("Monitor"));
    }

    public static String getMiddleThree(String str) {
        if (str.length() % 2 == 1) {
            if (str.length() < 3) {
                return str;
            } else {
                return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
            }
        } else {
            return "짝수입니다";
        }
    }
}

// 문제 해결하는 방식
// 1.무엇을 반환하여 구현할것인가?
// => System.out.println(getMiddleThree("Monitor"));
// 구현 // 모니터 입력시 가운데 세글자를 빼내서 표시
// 2. 가운데 3글자 매서드 만들기
// 3. 경우의 수 만들기
// 4. 홀수인 경우 // 짝수인경우 "짝수입니다."
// 4-1. 홀수에서 3자리 보다 작으면 그대로 반환
// 4-2. 홀수에서 3자리 보다 크면 = > 그밖에 가운데 3자리 추출