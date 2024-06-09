package Test2;
//여러분은 아주 크게 짖는 개를 키우고 있습니다.
// hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
// 만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
// 만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.
//
// barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
// barkingDogProblem(true, 7) ==> "든든하군!"
// barkingDogProblem(false, 5) ==> "든든하군!"

// 문제해결 알고리즘
// 1.어떤 시간에 짖는게 참이면(불리언사용) 결과값을 반환
// 2.매서드 사용 barkingDogProblem 만들기
// 2-1. 짖는것 00시에 일어난다면(참이라면)
// 2-2. 매개변수 0~23이 아닌경우
// 2-3. 매개변수 0~23인 경우
// 2-4. 7시 이전이나 20시 이후에 짖으면 짖으면안돼!
// 2-5. 7시 이후나 20시 이전에 짖으면 든든하군!
public class Test2 {
    public static void main(String[] args) {
        System.out.println(barkingDogProblem(true, 23));
    }

    static String barkingDogProblem(boolean barking, int hour) {
        if (hour < 0 || hour > 23) {
            return "올바른 값을 입력하세요";
        }

        if (barking) {
            if (hour < 7 || hour > 20) {
                return "짖으면 안돼!";
            } else {
                return "든든하군!";
            }
        }
        return "든든하군!";
        }
    }

