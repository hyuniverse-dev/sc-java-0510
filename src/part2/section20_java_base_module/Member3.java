package part2.section20_java_base_module;

/*
    롬복(lombok) 어노테이션 사용하기
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
