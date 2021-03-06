package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kwin
 * @create 2019-12-27 16:19
 */
@Mapper
public interface DiscussPostMapper {

    /**
     * 用于查询一组帖子
     * @param userId 用户的id
     * @param offset 每一页起始行的行号
     * @param limit 每一页最多有多少行的数据
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit,int orderMode);

    /**
     * 查询帖子的行数
     * @Param 注解用于给参数取别名,
     * 如果只有一个参数,并且在<if>里使用,则必须加别名
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    /**
     * 新增帖子
     * @param discussPost
     * @return
     */
    int insertDiscussPost(DiscussPost discussPost);

    /**
     * 根据id查询帖子
     * @param id
     * @return
     */
    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id,int commentCount);

    int updateType(int id,int type);

    int updateStatus(int id,int status);

    int updateScore(int id,double score);
}

