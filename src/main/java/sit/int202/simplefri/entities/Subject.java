package sit.int202.simplefri.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Subject {
    private String id, title;
    private double credit;
}
