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

package cn.gdpu.his.dao.sys;

import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.domain.sys.Category;
import cn.gdpu.his.domain.sys.CategoryEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 《分类》 数据访问接口
 *
 * @author 郭旭辉
 */
public interface ICategoryDAO extends IHISBaseDAO<Category> {

    /**
     * 获取分类列表
     *
     * @param name   分类名称
     * @param type   分类类型
     * @param status 分类状态
     * @param offset 偏移量
     * @param rows   行数
     * @return 返回，分类列表
     */
    List<CategoryEx> queryListEx(@Param("name") String name, @Param("type") int type, @Param("status") int status, @Param("offset") int offset, @Param("rows") int rows);

    /**
     * 统计分类大小
     *
     * @param name   分类名称
     * @param type   分类类型
     * @param status 分类状态
     * @return 返回，统计结果
     */
    int countEx(@Param("name") String name, @Param("type") Integer type, @Param("status") Integer status);

    /**
     * 根据id更新分类
     *
     * @param param 分类实体参数
     * @return 返回，0：失败，1：成功
     */
    int updateById(@Param("param") Category param);

    /**
     * 更新分类状态
     *
     * @param id     分类id
     * @param status 分类状态，0：启用，1：停用
     * @return 返回，0：失败，1：成功
     */
    int updateStatus(@Param("id") long id, @Param("status") int status);

    /**
     * 批量删除分类
     *
     * @param ids id列表
     * @return 返回，0：失败， 非零：成功
     */
    int deleteBatch(@Param("ids") long[] ids);

    /**
     * 根据type
     *
     * @param type   分类类别，1：设备，2：附件，3：合同,
     * @param status 0：启用，1：禁用
     * @return 返回，分类集合
     */
    List<Category> findListEx(@Param("type") int type, @Param("status") int status);
}