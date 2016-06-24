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


import cn.gdpu.common.domain.BaseDomain;
import cn.gdpu.common.domain.BizData4Page;
import cn.gdpu.common.service.IPageService;
import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.domain.sys.Category;
import cn.gdpu.his.domain.sys.CategoryEx;
import cn.gdpu.his.param.sys.CategoryParam;
import cn.gdpu.his.service.IHISBaseService;

import java.util.List;

/**
 * 《分类》 业务逻辑服务接口
 * @author 郭旭辉
 *
 */
public interface ICategoryService<D extends IHISBaseDAO<T>, T extends BaseDomain> extends IHISBaseService<D, T>,IPageService<D, T>{

    /**
     * 保存单条分类
     * @param param         分类实体参数
     * @param accountDto    当前操作用户
     * @return 返回，操作码
     */
    String add(CategoryParam param, AccountDto accountDto);

    /**
     * 更新分类
     * @param param         更新实体参数
     * @param accountDto    当前操作用户
     * @return 返回，操作码
     */
    String update(CategoryParam param, AccountDto accountDto);

    /**
     * 启用或停用分类
     * @param id        分类id
     * @param status    分类装填
     * @return  返回，操作码
     */
    String disableOrEnable(long id, int status);

    /**
     * 批量删除分类
     * @param ids   分类id列表
     * @return 返回，操作码
     */
    String deleteByIds(long[] ids);

    /**
     * 分页查询
     * @param name      分类名称
     * @param type      分类类型，1：食谱分类，2：商店分类,4：商品分类，8：活动分类
     * @param status    状态，）：正常，1：审核
     * @param pageNo    页码，默认1
     * @param pageSize  页大小，默认10
     * @return  返回分页结果
     */
    BizData4Page<CategoryEx> queryPage(String name, int type, int status, int pageNo, int pageSize);

    /**
     * 判断是否存在某条记录
     * @param property  字段名
     * @param value     字段值
     * @return 返回，true： 存在，false：不存在
     */
    boolean isExist(String property, Object value);

    /**
     * 根据type查询分类列表
     * @param type  分类类别，1：食谱分类，2：商店分类,4：商品分类，8：活动分类',
     * @return 返回，分类集合
     */
    List<Category> findList(int type);
}