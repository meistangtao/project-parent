package com.tao.springboot.mapper;

import com.tao.springboot.bean.SysUsers;
import com.tao.springboot.bean.SysUsersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUsersMapper {
    long countByExample(SysUsersExample example);

    int deleteByExample(SysUsersExample example);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    List<SysUsers> selectByExample(SysUsersExample example);

    @Select("select * from sys_users where username=#{username}")
    List<SysUsers> selectByUsername(String username);

    int updateByExampleSelective(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    int updateByExample(@Param("record") SysUsers record, @Param("example") SysUsersExample example);


}