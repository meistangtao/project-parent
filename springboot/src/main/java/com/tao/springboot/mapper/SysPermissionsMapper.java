package com.tao.springboot.mapper;

import com.tao.springboot.bean.SysPermissions;
import com.tao.springboot.bean.SysPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionsMapper {
    long countByExample(SysPermissionsExample example);

    int deleteByExample(SysPermissionsExample example);

    int insert(SysPermissions record);

    int insertSelective(SysPermissions record);

    List<SysPermissions> selectByExample(SysPermissionsExample example);

    int updateByExampleSelective(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    int updateByExample(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);
}