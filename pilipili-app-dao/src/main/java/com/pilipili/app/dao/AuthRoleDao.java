package com.pilipili.app.dao;

import com.pilipili.app.domain.auth.AuthRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthRoleDao {
    AuthRole getRoleByCode(String code);
}
