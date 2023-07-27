package domainModel;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Courses implements Entity {
    private int id;
    private String courseName;
    private int score;
}
