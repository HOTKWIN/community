package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author kwin
 * @create 2019-12-27 9:12
 */
@Service("alphaService")
//@Scope("prototype") //Ioc的多例模式
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    /**
     * 会在构造器之后执行
     */
    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    /**
     * 会在对象销毁之前执行
     */
    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

    /**
     * 模拟进行查询
     * @return
     */
    public String find(){
        String select = alphaDao.select();
        return select;
    }
}
