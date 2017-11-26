package com.zdh.api.repository;

import com.zdh.api.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author zhangdahu
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    List<UserInfo> findByName(String name);
}
