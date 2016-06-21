package cn.gdpu.his.service;


import cn.gdpu.common.domain.BaseDomain;
import cn.gdpu.common.service.impl.AbstractPageService;
import cn.gdpu.his.dao.IHISBaseDAO;

/**
 * Created by 郭旭辉 on 2016/3/13.
 */

public abstract class AbstractHISPageService<D extends IHISBaseDAO,T extends BaseDomain> extends AbstractPageService<D, T> {

}
