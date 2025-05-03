# kotlin-baseball-precourse

1-9까지 유니크한 수로 이루어진 3자리 수를 맞추는 게임

- 규칙
  - 수가 같은 자리, 스트라이크
  - 다른 자리, 볼
  - 해당사항 없음, 낫싱
- 컴퓨터
  - 1-9 사이 임의의 수 3개 선택
- 유저가 3개 숫자와 위치를 맞히면 게임 종료
- 종료 후, 다시 시작하거나 종료 선택 가능
- 잘못된 값 입력에 `IllegalArgumentException` 후 종료

- 입력
  - 1-9 사이 유니크한 3개의 수로 이루어진 3자리 수
  - 게임 종료 후, 재시작/종료 1/2로 선택

## Feature List

Model
- computer
  - has 3 unique numbers in range of 1 to 9 to form 3 digits number, using random value generator
  - has method to take user's number to match with its number
- user
  - has 3 unique numbers in range of 1 to 9 to form 3 digits number, from user input
  - has method to update the number to call in each round

View
- input
  - take 3 digits number
    - each 3 are unique number in range of 1 to 9
    - no blank
  - take restart or exit
    - 1 to restart
    - 2 to exit
    - no blank
- output
  - show matching result

Controller
- game manager
  - manage progress of game