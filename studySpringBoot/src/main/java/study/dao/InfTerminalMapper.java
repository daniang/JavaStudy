package study.dao;

import study.model.InfTerminal;

public interface InfTerminalMapper {
    int deleteByPrimaryKey(String id);

    int insert(InfTerminal record);

    int insertSelective(InfTerminal record);

    InfTerminal selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InfTerminal record);

    int updateByPrimaryKey(InfTerminal record);
}