/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备增值记录表											
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

package cn.gdpu.his.domain.equipment;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.domain.HISCreateBaseDomain;

import java.util.*;

/**
 * 《设备增值记录》 实体
 * @author 郭旭辉
 *
 */
public class Appreciation extends HISCreateBaseDomain<Integer> {
	private static final long serialVersionUID = 1L;
	
	private String title; //增值记录标题
	private Long equipmentId; //设备主键
	private Double addValue; //增值额度
	private String detail; //增值详情
    
	/**
	 *默认空构造函数
	 */
	public Appreciation() {
		super();
	}
	 
	/**
	 * @return title 增值记录标题
	 */
	public String getTitle(){
		return this.title;
	}
	/**
	 * @param title 增值记录标题
	 */
	public void setTitle(String title){
		this.title = title;
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
	 * @return addValue 增值额度
	 */
	public Double getAddValue(){
		return this.addValue;
	}
	/**
	 * @param addValue 增值额度
	 */
	public void setAddValue(Double addValue){
		this.addValue = addValue;
	}
	/**
	 * @return detail 增值详情
	 */
	public String getDetail(){
		return this.detail;
	}
	/**
	 * @param detail 增值详情
	 */
	public void setDetail(String detail){
		this.detail = detail;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("title",getTitle())
			.append("equipmentId",getEquipmentId())
			.append("addValue",getAddValue())
			.append("detail",getDetail())
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
			.append(getTitle())
			.append(getEquipmentId())
			.append(getAddValue())
			.append(getDetail())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Appreciation == false) return false;
		if(this == obj) return true;
		Appreciation other = (Appreciation)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
