/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：出库调配											
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
 * 《出库调配》 实体
 * @author 郭旭辉
 *
 */
public class StorageDeploy extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private Long equipmentId; //设别主键
	private String sources; //调配源
	private Integer count; //设备调配申请数量
	private String proposer; //设备调配申请人
	private String target; //调配目标
	private String appliedDate; //调配申请时间
	private String auditor; //调配审核人
	private String detail; //调配细则
    
	/**
	 *默认空构造函数
	 */
	public StorageDeploy() {
		super();
	}
	 
	/**
	 * @return equipmentId 设别主键
	 */
	public Long getEquipmentId(){
		return this.equipmentId;
	}
	/**
	 * @param equipmentId 设别主键
	 */
	public void setEquipmentId(Long equipmentId){
		this.equipmentId = equipmentId;
	}
	/**
	 * @return sources 调配源
	 */
	public String getSources(){
		return this.sources;
	}
	/**
	 * @param sources 调配源
	 */
	public void setSources(String sources){
		this.sources = sources;
	}
	/**
	 * @return count 设备调配申请数量
	 */
	public Integer getCount(){
		return this.count;
	}
	/**
	 * @param count 设备调配申请数量
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	/**
	 * @return proposer 设备调配申请人
	 */
	public String getProposer(){
		return this.proposer;
	}
	/**
	 * @param proposer 设备调配申请人
	 */
	public void setProposer(String proposer){
		this.proposer = proposer;
	}
	/**
	 * @return target 调配目标
	 */
	public String getTarget(){
		return this.target;
	}
	/**
	 * @param target 调配目标
	 */
	public void setTarget(String target){
		this.target = target;
	}
	/**
	 * @return appliedDate 调配申请时间
	 */
	public String getAppliedDate(){
		return this.appliedDate;
	}
	/**
	 * @param appliedDate 调配申请时间
	 */
	public void setAppliedDate(String appliedDate){
		this.appliedDate = appliedDate;
	}
	/**
	 * @return auditor 调配审核人
	 */
	public String getAuditor(){
		return this.auditor;
	}
	/**
	 * @param auditor 调配审核人
	 */
	public void setAuditor(String auditor){
		this.auditor = auditor;
	}
	/**
	 * @return detail 调配细则
	 */
	public String getDetail(){
		return this.detail;
	}
	/**
	 * @param detail 调配细则
	 */
	public void setDetail(String detail){
		this.detail = detail;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("equipmentId",getEquipmentId())
			.append("sources",getSources())
			.append("count",getCount())
			.append("proposer",getProposer())
			.append("target",getTarget())
			.append("appliedDate",getAppliedDate())
			.append("auditor",getAuditor())
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
			.append(getEquipmentId())
			.append(getSources())
			.append(getCount())
			.append(getProposer())
			.append(getTarget())
			.append(getAppliedDate())
			.append(getAuditor())
			.append(getDetail())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof StorageDeploy == false) return false;
		if(this == obj) return true;
		StorageDeploy other = (StorageDeploy)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
