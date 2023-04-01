package com.shierdp.service;

import com.shierdp.dto.Result;
import com.shierdp.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author shier
 */
public interface IBlogService extends IService<Blog> {

    Result queryHotBlog(Integer current);

    Result queryBlogById(Long id);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);

}
