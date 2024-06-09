package Test3;
import javax.swing.*;
import java.util.stream.DoubleStream;

//주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
//
// "When organizing items, always label each group with the appropriate
// category. category: books, category: electronics, category: clothing, category: kitchenware,
// and so on. "
//1.변수 문자 선언
//2.매서드(변수)
//3.매서드 구조 만들기
//3-1. category: 가 시작하는 인덱스 값을 반환함 indexOf("category:") 못찾으면 -1
//3-2. 못찾을때까지(-1이 반환될때까지) 반복문을 사용하여 category: 다음에 위치하는(+10) 단어를 추출한다.
//,까지 포함시키면 ,(마지막문자열은 미포함이므로 바로 원하는 단어가 출력된다)
public class Test3 {
    public static void main (String[] args) {
        String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware,and so on. ";
        printCategory(str);
    }
    static void printCategory(String str) {
        int startIndex = str.indexOf("category:",0);
        int endIndex = str.indexOf(",",startIndex);
        // statIndex 이후에서 찾아라

        while (startIndex != -1){
            System.out.println(str.substring(startIndex +10, endIndex));
            startIndex = str.indexOf("category:",endIndex);
            endIndex = str.indexOf(",",startIndex);
        }
    }
}
