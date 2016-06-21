/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备基础信息表											
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

package cn.gdpu.his.service.equipment;

import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.equipment.IEquipmentDAO;
import cn.gdpu.his.domain.equipment.Equipment;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《设备基础信息》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("EquipmentServiceImpl")
public class EquipmentServiceImpl extends AbstractHISPageService<IHISBaseDAO<Equipment>, Equipment> implements IEquipmentService<IHISBaseDAO<Equipment>,Equipment>{
    @Autowired
    private IEquipmentDAO equipmentDAO;

    @Override
    public IHISBaseDAO<Equipment> getDao() {
        return equipmentDAO;
    }

}