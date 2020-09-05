package com.tao.springboot.mapper;

import com.tao.springboot.bean.SysRolesPermissions;
import com.tao.springboot.bean.SysRolesPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesPermissionsMapper {
    long countByExample(SysRolesPermissionsExample example);

    int deleteByExample(SysRolesPermissionsExample example);

    int insert(SysRolesPermissions record);

    int insertSelective(SysRolesPermissions record);

    List<SysRolesPermissions> selectByExample(SysRolesPermissionsExample example);

    int updateByExampleSelective(@Param("record") SysRolesPermissions record, @Param("example") SysRolesPermissionsExample example);

    int updateByExample(@Param("record") SysRolesPermissions record, @Param("example") SysRolesPermissionsExample example);
}