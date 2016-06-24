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

package cn.gdpu.his.domain.sys;

import cn.gdpu.common.domain.HISCreateBaseDomain;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 《分类》 实体
 * @author 郭旭辉
 *
 */
public class Category extends HISCreateBaseDomain<Integer> {
	private static final long serialVersionUID = 1L;
	
	private String name; //分类名称
	private Integer priority; //排序
	private Integer type; //分类类型，1：设备分类，2：附件分类，4：合同分类...
    
	/**
	 *默认空构造函数
	 */
	public Category() {
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
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getName())
			.append(getPriority())
			.append(getType())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Category == false) return false;
		if(this == obj) return true;
		Category other = (Category)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
