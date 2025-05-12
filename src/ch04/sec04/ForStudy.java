package ch04.sec04;

public class ForStudy {
    /*
        인덱스 초기화: 인덱스는 반복을 몇 번할지 기준값
        조건식: 인덱스 값을 비교하여 Go 할지 Die 할지 결정
        실행문: 반복 실행하고 싶은 내용
        인덱스 증감식: 인덱스 값을 증가하거나 감소시킨다.

        for (0: 인덱스 초기화; 1: 조건식; 3: 인덱스 증감식) {
            2: 실행문
        }

        실행 순서(0은 최초 1회만 실행)
        0 > 1 > 2 > 3
          > 1 > 2 > 3
          ...
     */
    public static void main(String[] args) {
        int i1 = 0;
        System.out.println(i1++);
        System.out.println(i1++);
        System.out.println(i1++);
        System.out.println(i1++);
        System.out.println(i1++);
        System.out.println(i1++);
        System.out.println(i1++);

        System.out.println("----------");

        for (int i2 = 0; i2 < 10_000_000; i2++) {
            System.out.println(i2);
        }
    }
}
