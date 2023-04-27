package org.liangfacan53.courses.sf.ssm.spring.pojo;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String password;
}

