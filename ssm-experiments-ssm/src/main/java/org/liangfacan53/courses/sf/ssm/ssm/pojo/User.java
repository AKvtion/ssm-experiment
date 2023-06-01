package org.liangfacan53.courses.sf.ssm.ssm.pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Data
@Alias("User")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String password;
}

