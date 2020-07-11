# java-racingCar 
# 자동차경주 게임 저장소 (OOP 스터디 네번째 미션)
## 프로그래밍 요구 사항
- **모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외**
- **MVC 패턴 구조를 유지하면서 구현한다.**
- **자바 코드 컨벤션을 지키면서 프로그래밍한다.**
    - 참고문서: [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html) 또는 [https://myeonguni.tistory.com/1596](https://myeonguni.tistory.com/1596)
- **indent(인덴트, 들여쓰기) depth를 3을 넘지 않도록 구현한다. 2까지만 허용한다.**
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- **else 예약어를 쓰지 않는다.**
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- **함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.**
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
## 기능 요구사항
+ 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
+ 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
+ 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
+ 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
+ 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 4이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
+ 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
![capture](./image/cap.JPG)


## 구현해야할 기능 목록
+ InputView
  + 자동차 이름 입력 받기
  + 시도 회수 받기
+ Model - RacingGame
  + randome number 생성하여 이동하는 로직 구현.
  + 각 객체에 이동로직 적용.
+ OutputView
  + 자동차들의 현재 이동거리를 출력
  + RacingGame의 결과를 받아서 전체 결과를 출력
+ Validator
  + 사용자 입력 검증
