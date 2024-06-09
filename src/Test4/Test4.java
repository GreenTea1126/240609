package Test4;
//다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.
//String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
//for (초기화; 조건식; 증감식) {
//반복할 코드 블록
//}
public class Test4 {
    public static void main(String[] args) {
        String str = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
        water(str);
        blackWater(str);
    }
    public static void water(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void blackWater(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(str.length() - 1 - i));
        }
    }
}
