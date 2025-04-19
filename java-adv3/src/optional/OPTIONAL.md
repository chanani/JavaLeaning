# 옵셔널 베스트 프랙티스
  - 반환 타입으로만 사용하고, 필드에는 가급적 쓰지 말기
    - Optional은 주로 메서드의 반환값에 대해 "값이 없을 수도 있음"을 표기하기 위해 도입되었다.
    - 클래스의 필드(멤버 변수)에 Optional을 직접 두는 것은 권장하지 않는다.
  - 메서드 매개변수로 Optional을 사용하기 말기
    - 자바 공식 문서에 Optional은 메서드의 반환값으로 사용하기를 권장하며, 매개변수로 사용하지 말라고 명시되어 있다.
    - 호출하는 측에서는 단순히 null 전달 대신 Optional.empty()를 전달해야 하는 부담이 생기며, 결국 null을
      사용하든 Optional.empty()를 사용하든 큰 차이가 없어 가독성만 떨어진다.
  - 컬렉션(Collection)이나 배열 타입을 Optional로 감싸지 말기
    - List<T>, Set<T>, Map<K, V> 등 컬렉션 자체는 비어있는 상태(empty)를 표현할 수 있다.
    - 따라서 Optional<List<T>>처럼 다시 감싸면 Optional.empty()와 "빈 리스트"(Collections.emptyList())가 이중 표현이 되고, 혼란을 야기한다.
  - isPresent()와 get() 조합을 직접 사용하지 않기
    - Optional의 get() 메서드는 가급적 사용하지 않아야 한다.
    - if(opt.isPresent()) { ... opt.get() ...} else { ... } 는 사실상 null 체크와 다를 바 없으며, 깜빡하면
      NoSuchElementException 같은 예외가 발생할 위험이 있다.
    - 대신 orElse, orElseGet, OrElseThrow, ifPresentOrElse, map, filter 등의 메서드를 활용하면 간결하고 안전하게 처리할 수 있다.
  - orElseGet() vs orElse() 차이를 분명히 이해하기
    - orElse(T other)는 항상 other를 즉시 생성하거나 계산한다.
      - 즉 Optional 값이 존재해도 불필요한 연산/객체 생성이 일어날 수 있다.(즉시 평가)
    - orElseGet(Supplier<? extends T>)는 필요할 때만(빈 Optional 일 때만) Supplier를 호출한다.
      - 값이 이미 존재하는 경우 Supplier가 실행되지 않으므로, 비용이 큰 연산을 뒤로 미룰 수 있다.(지연평가)
  - 무조건 Optional이 좋은 것은 아니다.
    - Optional은 분명히 편의성과 안전성을 높여주지만, 모든 곳에서 "무조건" 사용하는 것은 오히려 코드 복잡성을 증가시킬 수 있다.
    - 다음과 같은 경우 Optional 사용이 오히려 불필요할 수 있다.
      - "항상 값이 있는" 상황
        - 비즈니스 로직상 null이 될 수 없는 경우, 그냥 일반 타입을 사용하거나, 방어적 코드로 예외를 던지는 편이 낫다.
      - "값이 없으면 예외를 던지는 것"이 더 자연스러운 상황
        - 예를 들어, ID 기반으로 무조건 존재하는 DB 엔티티를 찾아야 하는 경우, Optional 대신 예외를 던지는 게 API 설계상 명확할 수 있다. 
          물론 이런 부분은 비즈니스 상황에 따라 다를 수 있다.
      - "흔히 비는 경우"가 아니라 "흔히 채워져 있는" 경우
        - Optional을 쓰면 매번 .get(), .orElse(), orElseThrow() 등 처리가 강제되므로 오히려 코드가 장황해 질 수 있다.
      - "성능이 극도록 중요한" 로우레벨 코드
        - Optional은 래퍼 객체를 생성하므로, 수많은 객체가 단기간에 생겨나는 영역(예: 루프 내부)에서는 성능 영향을 줄 수 있다.
      