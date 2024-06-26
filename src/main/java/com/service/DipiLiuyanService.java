package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DipiLiuyanEntity;
import java.util.Map;

/**
 * 地皮留言 服务类
 */
public interface DipiLiuyanService extends IService<DipiLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}