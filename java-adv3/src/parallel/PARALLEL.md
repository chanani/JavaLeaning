# Fork/Join 프로엠워크 소개
  - 자바의 Fork/Join 프레임워크는 자바 7부터 도임된 java.util.concurrent 패키지의 일부로, 멀티코어 프로세서를 효율적으로 호라용하기 위한 병렬 처리 프레임워크이다.

## 주요 개념
  - 분할 정복(Divide and Conquer) 전략
    - 큰 작업(task)을 작은 단위로 재귀적으로 분할(fork)
    - 각 작은 작업의 결과를 합처(join) 최종 결과를 생성
    - 멀티코어 환경에서 작업을 효율적으로 분산 처리
  - 작업 훔치기(Work Stealing) 알고리즘
    - 각 스레드는 자신의 작업 큐를 가짐
    - 작업이 없는 스레드는 다른 바쁩 스레드의 큐에서 작업을 "훔쳐와서" 대신 처리
    - 부하 균형을자동으로 조절하여 효율성 향상
  - 주요 클래스
    - ForkJoinPool
      - Fork/Join 작업을 실행하는 특수한 ExecutorService 스레드 풀
      - 작업 스케줄링 및 스레드 관리를 담당
      - 기본적으로 사용ㅎ 가능한 프로세스 수 만큼 스레드 생성
      - 쉽게 이야기해서 분할 적복과 작업 훔치기에 특화된 스레드 풀이다.
    - ForkJoinTask
      - RecursiveTask<V> : 결과를 반환하는 작업
      - RecursiveAction : 결과를 반환하지 않는 작업