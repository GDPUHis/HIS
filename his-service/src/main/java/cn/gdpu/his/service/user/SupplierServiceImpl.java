/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：供应商											
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

package cn.gdpu.his.service.user;

import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.user.ISupplierDAO;
import cn.gdpu.his.domain.user.Supplier;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《供应商》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("SupplierServiceImpl")
public class SupplierServiceImpl extends AbstractHISPageService<IHISBaseDAO<Supplier>, Supplier> implements ISupplierService<IHISBaseDAO<Supplier>,Supplier>{
    @Autowired
    private ISupplierDAO supplierDAO;

    @Override
    public IHISBaseDAO<Supplier> getDao() {
        return supplierDAO;
    }

}