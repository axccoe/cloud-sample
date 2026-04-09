
package com.example.sampleapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

// Step2 : dev Branch 로 변경후 Src 편집 및 Commit and Push
// --------------------------현재 진행 단계--------------------------
// Restful API 개발 : sampleapp1-[사번].cepg-aa.kubepia.net/api/v1/user GET 방식으로 사번을 리턴하는 API를 만드세요
// --------------------------현재 진행 단계--------------------------
// (1)작업이력과 함께 커밋 및 푸쉬하세요
// cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim 을 베이스로 하는 Dockerfile 을 작성
// (2)작업이력과 함께 커밋 및 푸쉬하세요
// Kubernetes manifest 작성 : ingress ,service, deployment, configMap, PVC
// Ingress manifest 작성 시 경로가 [Application이름]-[사번].cepg-aa.kubepia.net을 가리키도록 설정해주세요. (예시 : app-82000000.cepg-aa.kubepia.net )
// (3)작업이력과 함께 커밋 및 푸쉬하세요
// Git actions 워크플로 yml 파일 작성
// (4)작업이력과 함께 커밋 및 푸쉬하세요

// Restful API 개발 : sampleapp1-[사번].cepg-aa.kubepia.net/api/v1/user GET 방식으로 사번을 리턴하는 API를 만드세요
// --------------------------테스트 방법--------------------------
// 2. 의존성 설치 및 빌드 준비
// 템플릿 repo(cloud-sample)의 경우, Maven 기반이라 mvnw 또는 Gradle을 사용합니다.

// bash 에서 실행
// # Maven Wrapper 사용
// ./mvnw clean install → 빌드 준비
// ./mvnw spring-boot\:run → 로컬 서버 실행
// curl 또는 브라우저로 http\://localhost\:8080/api/v1/user 호출
// 사번 출력 확인 → 성공 시 Commit & Push 진행

// clean : 이전 빌드 결과 삭제
// install : src 코드와 의존성 컴파일 후 패키징
// 최초 실행 시 인터넷에서 라이브러리를 다운로드하므로 시간이 조금 걸릴 수 있습니다.
// --------------------------테스트 방법--------------------------
    private static final String EMPLOYEE_ID = "82188379"; // 조우철님 사번

    @GetMapping("/api/v1/user")
    public String getUserId() {
        return EMPLOYEE_ID;
    }
}
