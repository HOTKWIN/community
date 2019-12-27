package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author kwin
 * @create 2019-12-27 9:07
 */
@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao {

    @Override
    public String select() {
        return "MyBatis";
    }
}
