package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author kwin
 * @create 2019-12-27 9:04
 */
@Repository("alphaDaoHibernateImpl")
public class AlphaDaoHibernateImpl implements AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }


}
