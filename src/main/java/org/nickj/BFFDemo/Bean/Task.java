package org.nickj.BFFDemo.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private String businessId;

    private String requestId;

    private String taskId;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;
}
