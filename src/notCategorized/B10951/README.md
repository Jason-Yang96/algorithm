* EOF
- 파일 종료 조건이 없이 그냥 입력이 주어진 상태. 입력에서 더 이상의 읽을 수 있는 데이터 없을 때 반복문 종료해라. 
- 데이터 존재하지 않을 때를 EOF라고 한다(end of file)

### 방법1. Scanner 사용
- 더 이상 읽을 데이터가 없다면, NoSuchElementException을 던진다
-> Solution 
- (1) try-catch로 예외 발생 시 반복문 종료
- (2) hasNext()로 처리
### 방법2.1 BufferedReader + StringTokenizer
- readLine()을 통해 연산. 
- 한 행 전부를 읽기에 공백 단위로 입력한 뒤 문자열을 공백 단위로 분리
- 분리 방법을 StringTokenizer 사용
### 방법2.2 BufferedReader + Split
- 분리 방법을 split 사용
### 방법2.3 BufferedReader + String.charAt()
- 반복문을 할 때 마다 객체를 생성해 줄 필요가 있을까? 
- 무조건 한자리 정수만을 입력 받는다. 
- 공백의 위치도 자연스럽게 고정된 위치라는 것을 알 수 있다. 
- 하지만 charAt의 경우 아스키 코드를 반환하기 때문에 48을 빼주거나 '0'을 빼주어 숫자로 묵시적 형 변환을 해야 한다. 
