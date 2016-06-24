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

import cn.gdpu.common.domain.AccountDto;
import cn.gdpu.common.domain.BizData4Page;
import cn.gdpu.common.exception.BizException;
import cn.gdpu.common.utils.ERRORCODE;
import cn.gdpu.common.utils.PageUtils;
import cn.gdpu.common.utils.RETURNCODE;
import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.sys.ICategoryDAO;
import cn.gdpu.his.domain.sys.Category;
import cn.gdpu.his.domain.sys.CategoryEx;
import cn.gdpu.his.param.sys.CategoryParam;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

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

    @Override
    public String add(CategoryParam param, AccountDto accountDto) {
        if (!isExist(param.F_Name, param.getName())) {
            Category category = new Category();
            category.setName(param.getName());
            category.setPriority(param.getPriority());
            category.setType(param.getType());
            category.setStatus(0);
            category.setCreator(accountDto.getUid());
            category.setCreateDate(System.currentTimeMillis());
            if(categoryDAO.insert(category) == 1){
                return RETURNCODE.ADD_COMPLETE.getMessage();
            }else{
                throw new BizException(ERRORCODE.OPERATION_FAIL.getCode(), ERRORCODE.OPERATION_FAIL.getMessage());
            }
        } else {
            throw new BizException(ERRORCODE.CATEGORY_EXIST.getCode(), ERRORCODE.CATEGORY_EXIST.getMessage());
        }
    }

    @Override
    public String update(CategoryParam param, AccountDto accountDto) {
        Category category;
        category = this.findOne(param.F_Name, param.getName());
        if (category != null && !Objects.equals(category.getId(), param.getId())) {
            throw new BizException(ERRORCODE.CATEGORY_EXIST.getCode(), ERRORCODE.CATEGORY_EXIST.getMessage());
        } else{
            category = new Category();
            category.setId(param.getId());
            category.setName(param.getName());
            category.setPriority(param.getPriority());
            category.setType(param.getType());
            category.setLastModifier(accountDto.getUid());
            category.setLastModDate(System.currentTimeMillis());
            if(categoryDAO.updateById(category) == 1){
                return RETURNCODE.UPDATE_COMPLETE.getMessage();
            }else {
                throw new BizException(ERRORCODE.OPERATION_FAIL.getCode(), ERRORCODE.OPERATION_FAIL.getMessage());
            }
        }
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public String disableOrEnable(long id, int status) {
        if (categoryDAO.updateStatus(id, status) == 1){
            return RETURNCODE.SUCCESS_COMPLETE.getMessage();
        }
        throw new BizException(ERRORCODE.OPERATION_FAIL.getCode(), ERRORCODE.OPERATION_FAIL.getMessage());
    }

    @Override
    public String deleteByIds(long[] ids) {
        if (categoryDAO.deleteBatch(ids) != 0){
            return RETURNCODE.DELETE_COMPLETE.getMessage();
        }
        throw new BizException(ERRORCODE.OPERATION_FAIL.getCode(), ERRORCODE.OPERATION_FAIL.getMessage());
    }

    @Override
    public BizData4Page<CategoryEx> queryPage(String name, int type, int status, int pageNo, int pageSize) {
        List<CategoryEx> data = categoryDAO.queryListEx(name, type, status, (pageNo - 1) * pageSize, pageSize);
        int records = categoryDAO.countEx(name, type, status);
        return PageUtils.toBizData4Page(data, pageNo, pageSize, records);
    }

    @Override
    public boolean isExist(String property, Object value) {
        return this.findOne(property, value) != null;
    }

    @Override
    public List<Category> findList(int type) {
        return categoryDAO.findListEx(type, 0);
    }

}