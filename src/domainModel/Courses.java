package domainModel;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Courses {
    private int id;
    private String courseName;
    private int score;
}
