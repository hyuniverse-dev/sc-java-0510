package part2.section20_java_base_module.chapter1_object;

/*
    롬복(lombok) 어노테이션 사용하기
        - IDE에서 롬복 어노테이션을 인식하도록 플러그인 설치한다.
        - maven repository 에서 lombok jar파일을 다운로드 받고 프로젝트에 포함시킨다.
            * alt + insert 단축키를 사용해서 IDE 통해서 다운로드 진행하면 간편하다.

    롬복 어노테이션 장점
        - 명시적으로 기술해야 하는 코드들을 어노테이션 기반으로 간결하게 작성할 수 있다.
        - 실제 현업에서는 Getter/Setter/toString() 메소드를 명시적으로 작성하는 경우는 드물다.
        - 대부분 롬복 라이브러리를 사용하여 대체한다.
 */


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Member3 {

    private String id;
    private String name;
    private int age;
}
