package com.us.example.domain;

import lombok.Data;

/**
 * Created by yangyibo on 17/1/20.
 */
@Data
public class Permission {

    private int id;
    //权限名称
    private String name;

    //权限描述
    private String description;

    //授权链接
    private String url;

    //父节点id
    private int pid;
}
