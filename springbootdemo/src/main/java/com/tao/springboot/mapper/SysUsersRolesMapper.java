package com.tao.springboot.mapper;

import com.tao.springboot.bean.SysUsersRoles;
import com.tao.springboot.bean.SysUsersRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersRolesMapper {
    long countByExample(SysUsersRolesExample example);

    int deleteByExample(SysUsersRolesExample example);

    int insert(SysUsersRoles record);

    int insertSelective(SysUsersRoles record);

    List<SysUsersRoles> selectByExample(SysUsersRolesExample example);

    int updateByExampleSelective(@Param("record") SysUsersRoles record, @Param("example") SysUsersRolesExample example);

    int updateByExample(@Param("record") SysUsersRoles record, @Param("example") SysUsersRolesExample example);
}