/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：购买计划详情											
{  功能描述:										
{															
{  ---------------------------------------------------------------------------	
{  维护历史:													
{  日期        维护人        维护类型						
{  ---------------------------------------------------------------------------	
{  2016-06-21  郭旭辉        新建	
{ 	                                                                     
{*****************************************************************************
*/

package cn.gdpu.his.service.plan;

import cn.gdpu.common.dao.IBaseDAO;
import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.plan.IPlandetailDAO;
import cn.gdpu.his.domain.plan.Plandetail;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《购买计划详情》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("PlandetailServiceImpl")
public class PlandetailServiceImpl extends AbstractHISPageService<IHISBaseDAO<Plandetail>, Plandetail> implements IPlandetailService<IHISBaseDAO<Plandetail>,Plandetail>{
    @Autowired
    private IPlandetailDAO plandetailDAO;

    @Override
    public IHISBaseDAO<Plandetail> getDao() {
        return plandetailDAO;
    }

}