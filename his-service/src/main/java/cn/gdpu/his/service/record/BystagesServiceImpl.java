/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：分期记录表											
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

package cn.gdpu.his.service.record;

import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.record.IBystagesDAO;
import cn.gdpu.his.domain.record.Bystages;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《分期记录》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("BystagesServiceImpl")
public class BystagesServiceImpl extends AbstractHISPageService<IHISBaseDAO<Bystages>, Bystages> implements IBystagesService<IHISBaseDAO<Bystages>,Bystages>{
    @Autowired
    private IBystagesDAO bystagesDAO;

    @Override
    public IHISBaseDAO<Bystages> getDao() {
        return bystagesDAO;
    }

}