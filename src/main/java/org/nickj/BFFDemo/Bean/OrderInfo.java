package org.nickj.BFFDemo.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

    private String taskId;

    private String orderType;

    private String params;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

}
