/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备保养维护记录											
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

package cn.gdpu.his.domain.record;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.domain.HISCreateBaseDomain;

import java.util.*;

/**
 * 《设备保养维护记录》 实体
 * @author 郭旭辉
 *
 */
public class Maintain extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private String title; //标题
	private String content; //维护内容
	private String supplierCode; //维护供应商代码
	private Integer maintainType; //维护类型，0：维修，1：保养
	private Double charge; //维护费用
	private String noter; //记录员
	private String noteDate; //记录时间
	private String supplement; //维修补充
    
	/**
	 *默认空构造函数
	 */
	public Maintain() {
		super();
	}
	 
	/**
	 * @return title 标题
	 */
	public String getTitle(){
		return this.title;
	}
	/**
	 * @param title 标题
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 * @return content 维护内容
	 */
	public String getContent(){
		return this.content;
	}
	/**
	 * @param content 维护内容
	 */
	public void setContent(String content){
		this.content = content;
	}
	/**
	 * @return supplierCode 维护供应商代码
	 */
	public String getSupplierCode(){
		return this.supplierCode;
	}
	/**
	 * @param supplierCode 维护供应商代码
	 */
	public void setSupplierCode(String supplierCode){
		this.supplierCode = supplierCode;
	}
	/**
	 * @return maintainType 维护类型，0：维修，1：保养
	 */
	public Integer getMaintainType(){
		return this.maintainType;
	}
	/**
	 * @param maintainType 维护类型，0：维修，1：保养
	 */
	public void setMaintainType(Integer maintainType){
		this.maintainType = maintainType;
	}
	/**
	 * @return charge 维护费用
	 */
	public Double getCharge(){
		return this.charge;
	}
	/**
	 * @param charge 维护费用
	 */
	public void setCharge(Double charge){
		this.charge = charge;
	}
	/**
	 * @return noter 记录员
	 */
	public String getNoter(){
		return this.noter;
	}
	/**
	 * @param noter 记录员
	 */
	public void setNoter(String noter){
		this.noter = noter;
	}
	/**
	 * @return noteDate 记录时间
	 */
	public String getNoteDate(){
		return this.noteDate;
	}
	/**
	 * @param noteDate 记录时间
	 */
	public void setNoteDate(String noteDate){
		this.noteDate = noteDate;
	}
	/**
	 * @return supplement 维修补充
	 */
	public String getSupplement(){
		return this.supplement;
	}
	/**
	 * @param supplement 维修补充
	 */
	public void setSupplement(String supplement){
		this.supplement = supplement;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("title",getTitle())
			.append("content",getContent())
			.append("supplierCode",getSupplierCode())
			.append("maintainType",getMaintainType())
			.append("charge",getCharge())
			.append("noter",getNoter())
			.append("noteDate",getNoteDate())
			.append("supplement",getSupplement())
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
			.append(getContent())
			.append(getSupplierCode())
			.append(getMaintainType())
			.append(getCharge())
			.append(getNoter())
			.append(getNoteDate())
			.append(getSupplement())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Maintain == false) return false;
		if(this == obj) return true;
		Maintain other = (Maintain)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
