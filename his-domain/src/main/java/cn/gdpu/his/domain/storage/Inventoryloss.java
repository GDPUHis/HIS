/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：inventory loss											
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
 * 《inventory loss》 实体
 * @author 郭旭辉
 *
 */
public class Inventoryloss extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private Long equipmentId; //设备主键
	private Long accessoryId; //附件主键
	private Integer oStatus; //盘亏对象主键，0：损坏，1：报废
	private String noter; //盘亏人
	private String noteDate; //盘亏时间
    
	/**
	 *默认空构造函数
	 */
	public Inventoryloss() {
		super();
	}
	 
	/**
	 * @return equipmentId 设备主键
	 */
	public Long getEquipmentId(){
		return this.equipmentId;
	}
	/**
	 * @param equipmentId 设备主键
	 */
	public void setEquipmentId(Long equipmentId){
		this.equipmentId = equipmentId;
	}
	/**
	 * @return accessoryId 附件主键
	 */
	public Long getAccessoryId(){
		return this.accessoryId;
	}
	/**
	 * @param accessoryId 附件主键
	 */
	public void setAccessoryId(Long accessoryId){
		this.accessoryId = accessoryId;
	}
	/**
	 * @return oStatus 盘亏对象主键，0：损坏，1：报废
	 */
	public Integer getOStatus(){
		return this.oStatus;
	}
	/**
	 * @param oStatus 盘亏对象主键，0：损坏，1：报废
	 */
	public void setOStatus(Integer oStatus){
		this.oStatus = oStatus;
	}
	/**
	 * @return noter 盘亏人
	 */
	public String getNoter(){
		return this.noter;
	}
	/**
	 * @param noter 盘亏人
	 */
	public void setNoter(String noter){
		this.noter = noter;
	}
	/**
	 * @return noteDate 盘亏时间
	 */
	public String getNoteDate(){
		return this.noteDate;
	}
	/**
	 * @param noteDate 盘亏时间
	 */
	public void setNoteDate(String noteDate){
		this.noteDate = noteDate;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("equipmentId",getEquipmentId())
			.append("accessoryId",getAccessoryId())
			.append("oStatus",getOStatus())
			.append("noter",getNoter())
			.append("noteDate",getNoteDate())
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
			.append(getAccessoryId())
			.append(getOStatus())
			.append(getNoter())
			.append(getNoteDate())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Inventoryloss == false) return false;
		if(this == obj) return true;
		Inventoryloss other = (Inventoryloss)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
