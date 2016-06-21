package cn.gdpu.his.service;


import cn.gdpu.common.domain.BaseDomain;
import cn.gdpu.common.service.IBaseService;
import cn.gdpu.common.service.IPageService;
import cn.gdpu.his.dao.IHISBaseDAO;

/**
 * Created by 郭旭辉 on 2016/3/13.
 */
/*
    @authot simagle
*/
public interface IHISBaseService<D extends IHISBaseDAO<T>, T extends BaseDomain> extends IBaseService<D, T>, IPageService<D, T> {
}
