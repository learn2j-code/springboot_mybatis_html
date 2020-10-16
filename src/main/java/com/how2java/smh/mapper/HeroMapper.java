package com.how2java.smh.mapper;

import com.how2java.smh.pojo.Hero;
import com.how2java.smh.pojo.HeroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface HeroMapper {
    long countByExample(HeroExample example);

    int deleteByExample(HeroExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hero record);

    int insertSelective(Hero record);

    List<Hero> selectByExample(HeroExample example);

    Hero selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hero record, @Param("example") HeroExample example);

    int updateByExample(@Param("record") Hero record, @Param("example") HeroExample example);

    int updateByPrimaryKeySelective(Hero record);

    int updateByPrimaryKey(Hero record);
}