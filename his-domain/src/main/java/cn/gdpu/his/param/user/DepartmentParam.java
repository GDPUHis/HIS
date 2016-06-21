/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：用户所属部门（模拟表）											
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

package cn.gdpu.his.param.user;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《用户所属部门（模拟表）》 查询参数实体
 * @author 郭旭辉
 *
 */
public class DepartmentParam extends CreateBaseParam<Integer> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——部门名称
	*/
	public static final String F_Name="name";
	/**
	*字段常量——部门位置
	*/
	public static final String F_Address="address";
	/**
	*字段常量——部门描述
	*/
	public static final String F_Description="description";
	
	private String name; //部门名称
	private String address; //部门位置
	private String description; //部门描述
    
	/**
	 *默认空构造函数
	 */
	public DepartmentParam() {
		super();
	}
	 
	/**
	 * @return name 部门名称
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * @param name 部门名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * @return address 部门位置
	 */
	public String getAddress(){
		return this.address;
	}
	/**
	 * @param address 部门位置
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 * @return description 部门描述
	 */
	public String getDescription(){
		return this.description;
	}
	/**
	 * @param description 部门描述
	 */
	public void setDescription(String description){
		this.description = description;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("name",getName())
			.append("address",getAddress())
			.append("description",getDescription())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
