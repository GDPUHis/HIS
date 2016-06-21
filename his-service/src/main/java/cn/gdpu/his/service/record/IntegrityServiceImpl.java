/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备使用情况，非高耗设备											
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
import cn.gdpu.his.dao.record.IIntegrityDAO;
import cn.gdpu.his.domain.record.Integrity;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《设备使用情况，非高耗设备》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("IntegrityServiceImpl")
public class IntegrityServiceImpl extends AbstractHISPageService<IHISBaseDAO<Integrity>, Integrity> implements IIntegrityService<IHISBaseDAO<Integrity>,Integrity>{
    @Autowired
    private IIntegrityDAO integrityDAO;

    @Override
    public IHISBaseDAO<Integrity> getDao() {
        return integrityDAO;
    }

}