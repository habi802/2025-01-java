package ch04.sec03;

public class SwitchStudy {
    /*
    switch 에서는 관계 연산자(>, <, >=, <=, !=) 사용할 수 없다.
    오로지 == equal 만 가능
    switch 는 case 에 맞는 값이 있으면 진입을 하고 break; 키워드를 만날 때까지 모두 실행한다.

    switch (변수) {
        case 값1:
            처리1;
            break;
        case 값2:
            처리2;
            break;

        [ ... ]

        default:
            나머지 처리;
            break;
    }
    */
    public static void main(String[] args) {
        int num = 1;
        switch(num) {
            case 1:
                System.out.println("1입니다.");
            case 2:
            case 3:
                System.out.println("2 또는 3입니다.");
                break;
            default:
                System.out.println("값이 없네요.");
            case 4:
                System.out.println("4입니다.");
                break;
        }
        System.out.println("-- 끝 --");
    }
}
