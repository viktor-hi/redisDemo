package cn.chen.dao;

import cn.chen.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author haixin
 * @time 2019/12/1
 */
@Mapper
public interface AccountMapper {
    public List<Account> selectAll();
}
