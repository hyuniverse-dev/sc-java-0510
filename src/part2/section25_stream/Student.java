package part2.section25_stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    @Override
    public int compareTo(Student o) {
        // score와 o.score가 같을 경우는 0을 리턴,
        // score가 o.score보다 작을 경우는 음수를 리턴,
        // score가 o.score보다 큰 경우는 양수를 리턴
        return Integer.compare(score, o.score);
    }
}
