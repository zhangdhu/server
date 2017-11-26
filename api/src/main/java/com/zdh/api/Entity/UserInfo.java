package com.zdh.api.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user_info")
@Entity
public class UserInfo {
    @Id
    @GeneratedValue
    Long id;

    String name;
}
