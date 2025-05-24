package part2.section20_java_base_module.chapter5_annotation;

/*
    어노테이션(Annotation)
        - 코드에서 @(앳 기호)로 작성되는 요소를 어노테이션(Annotation) 이라고 한다.
        - 클래스, 인터페이스를 컴파일 또는 실행할 때 어떻게 컴파일 또는 실행할지를 알려주는 설정정보이다.
    어노테이션 용도
        1. 컴파일 시 사용하는 정보를 전달
        2. 빌드 툴이 코드를 자동으로 생성할 때 사용하는 정보를 전달
        3. 실행 시 특정 기능을 처리할 때 사용하는 정보를 전달
    어노테이션 대표적인 예
        1. @Override 는 컴파일 시 메소드 재정의를 검사하도록 설정한 예시이다.
           정확히 재정의 되어있지 않다면 컴파일 에러를 발생시키도록 구현되어 있다.
    어노테이션 사용 범위
        1. 현대적인 프로그래밍에서는 거의 필수적이다.
        2. 대표적으로 Spring Framework 또는 Spring Boot 같은 경우 다양한 어노테이션을 사용한다.
        3. OpenAPI(Swagger) 도 다양한 어노테이션을 사용한다.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD}) // 필드와 메소드는 해당 어노테이션을 사용할 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationName {
    /*
        커스텀 어노테이션 생성 방법

        1. 어노테이션 적용 대상 설정
            - 클래스, 필드, 생성자, 메소드, 로컬 변수 또는 패키지 등
              어노테이션을 사용할 수 있는 대상을 지정한다.
            - @Target 사용해서 적용 대상을 지정한다.

        2. 어노테이션 유지 정책 설정
            - 커스텀 어노테이션을 언제까지 유지할 것인지를 지정한다.
            - SOURCE, CLASS, RUNTIME 로 사용이 가능하다.
                1. SOURCE: 컴파일 할 때 적용 / 컴파일 후엔 제거된다.
                2. CLASS: 메모리로 로딩할 때 적용 / 메모리로 로딩된 후에 제거된다.
                3. RUNTIME: 실행할 때 적용 / 실행 중인 동안 계속 유지된다.
            - @Retention 사용해서 유지 정책을 설정한다.
     */
}
