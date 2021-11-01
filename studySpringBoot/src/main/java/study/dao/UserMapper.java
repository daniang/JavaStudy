package study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import study.model.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}