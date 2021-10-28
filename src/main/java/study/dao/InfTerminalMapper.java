package study.dao;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import study.model.InfTerminal;

@Mapper
public interface InfTerminalMapper {
    int deleteByPrimaryKey(String id);

    int insert(InfTerminal record);

    int insertSelective(InfTerminal record);

    InfTerminal selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InfTerminal record);

    int updateByPrimaryKey(InfTerminal record);
}