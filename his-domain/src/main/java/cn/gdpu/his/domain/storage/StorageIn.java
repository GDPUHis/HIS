/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备出库											
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

package cn.gdpu.his.domain.storage;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.domain.HISCreateBaseDomain;

import java.util.*;

/**
 * 《设备出库》 实体
 * @author 郭旭辉
 *
 */
public class StorageIn extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private Long equipmentId; //设备数量
	private Integer count; //入库数量
	private String principal; //入库负责人
    
	/**
	 *默认空构造函数
	 */
	public StorageIn() {
		super();
	}
	 
	/**
	 * @return equipmentId 设备数量
	 */
	public Long getEquipmentId(){
		return this.equipmentId;
	}
	/**
	 * @param equipmentId 设备数量
	 */
	public void setEquipmentId(Long equipmentId){
		this.equipmentId = equipmentId;
	}
	/**
	 * @return count 入库数量
	 */
	public Integer getCount(){
		return this.count;
	}
	/**
	 * @param count 入库数量
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	/**
	 * @return principal 入库负责人
	 */
	public String getPrincipal(){
		return this.principal;
	}
	/**
	 * @param principal 入库负责人
	 */
	public void setPrincipal(String principal){
		this.principal = principal;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("equipmentId",getEquipmentId())
			.append("count",getCount())
			.append("principal",getPrincipal())
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
			.append(getEquipmentId())
			.append(getCount())
			.append(getPrincipal())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof StorageIn == false) return false;
		if(this == obj) return true;
		StorageIn other = (StorageIn)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
