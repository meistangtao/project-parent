package com.tao.springboot.mapper;

import com.tao.springboot.bean.SysRoles;
import com.tao.springboot.bean.SysRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesMapper {
    long countByExample(SysRolesExample example);

    int deleteByExample(SysRolesExample example);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    List<SysRoles> selectByExample(SysRolesExample example);

    int updateByExampleSelective(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    int updateByExample(@Param("record") SysRoles record, @Param("example") SysRolesExample example);
}