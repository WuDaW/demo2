package com.wu.demo2.mapper;

import com.wu.demo2.modals.Tongzhi;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TongzhiMapper {

    @Select("select * from t_tongzhi")
    List<Tongzhi> getAllTongzhi();

    @Insert("insert into t_tongzhi values(null, #{title})")
    int addTongzhi(@Param("title") String title);

    @Update("update t_tongzhi")
    int updateTongzhi();

    @Delete("delete from t_tongzhi where id=#{id}")
    int deleteTongzhi(@Param("id") int id);

}
