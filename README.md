* 주제
  * 모니터링
  * Circuit Breaker
* 대용량 시스템에서의 모니터링
  * MSA 기반이 되면서 중요해짐
    -> 작은 메소드, 작은 클래스 선호 -> 아키텍처 버전
    -> VM 클라우드서버, Docker, SpringBoot (WAS)
  * Monolithic 환경 -> Application 동작/장애
    -> Application 서버 : L4, L7 스위치
  * MSA 환경 -> 내가 잘 만들어도 장애가 남
    -> 회원서버, 결제서버, 리뷰서버...
    -> 리뷰서버 죽었다고 하면?
    -> 모니터링이 중요해졌어요.
    -> 프로메테우스, 그라파나, ...
* SpringBoot Actuator
* Circuit Breaker Pattern
  * 라이브러리
    * Netflix's Hystrix
    * Resilience4j
    * Alibaba's Sentinel
    * Spring Retry
  
