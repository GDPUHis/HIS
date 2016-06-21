/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：分类表											
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

package cn.gdpu.his.service.sys;

import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.sys.ICategoryDAO;
import cn.gdpu.his.domain.sys.Category;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《分类》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("CategoryServiceImpl")
public class CategoryServiceImpl extends AbstractHISPageService<IHISBaseDAO<Category>, Category> implements ICategoryService<IHISBaseDAO<Category>,Category>{
    @Autowired
    private ICategoryDAO categoryDAO;

    @Override
    public IHISBaseDAO<Category> getDao() {
        return categoryDAO;
    }

}