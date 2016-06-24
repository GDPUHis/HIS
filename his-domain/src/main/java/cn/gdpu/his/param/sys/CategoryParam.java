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
{  2016-06-24  郭旭辉        新建	
{ 	                                                                     
{*****************************************************************************
*/

package cn.gdpu.his.param.sys;

import cn.gdpu.common.param.CreateBaseParam;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 《分类》 查询参数实体
 * @author 郭旭辉
 *
 */
public class CategoryParam extends CreateBaseParam<Integer> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——分类名称
	*/
	public static final String F_Name="name";
	/**
	*字段常量——排序
	*/
	public static final String F_Priority="priority";
	/**
	*字段常量——分类类型，1：设备分类，2：附件分类，4：合同分类...
	*/
	public static final String F_Type="type";
	
	private String name; //分类名称
	private Integer priority; //排序
	private Integer type; //分类类型，1：设备分类，2：附件分类，4：合同分类...
    
	/**
	 *默认空构造函数
	 */
	public CategoryParam() {
		super();
	}
	 
	/**
	 * @return name 分类名称
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * @param name 分类名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * @return priority 排序
	 */
	public Integer getPriority(){
		return this.priority;
	}
	/**
	 * @param priority 排序
	 */
	public void setPriority(Integer priority){
		this.priority = priority;
	}
	/**
	 * @return type 分类类型，1：设备分类，2：附件分类，4：合同分类...
	 */
	public Integer getType(){
		return this.type;
	}
	/**
	 * @param type 分类类型，1：设备分类，2：附件分类，4：合同分类...
	 */
	public void setType(Integer type){
		this.type = type;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("name",getName())
			.append("priority",getPriority())
			.append("type",getType())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
