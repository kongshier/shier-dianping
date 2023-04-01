package com.shierdp.service.impl;

import com.shierdp.entity.BlogComments;
import com.shierdp.mapper.BlogCommentsMapper;
import com.shierdp.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author shier
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
