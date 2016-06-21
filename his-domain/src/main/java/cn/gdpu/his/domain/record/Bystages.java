/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：分期记录表											
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
 * 《分期记录》 实体
 * @author 郭旭辉
 *
 */
public class Bystages extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private Long epHistoryId; //设备购买记录主键
	private Long apHistoryId; //附件购买记录主键
	private String operator; //操作人
	private Double money; //本期归还金额
    
	/**
	 *默认空构造函数
	 */
	public Bystages() {
		super();
	}
	 
	/**
	 * @return epHistoryId 设备购买记录主键
	 */
	public Long getEpHistoryId(){
		return this.epHistoryId;
	}
	/**
	 * @param epHistoryId 设备购买记录主键
	 */
	public void setEpHistoryId(Long epHistoryId){
		this.epHistoryId = epHistoryId;
	}
	/**
	 * @return apHistoryId 附件购买记录主键
	 */
	public Long getApHistoryId(){
		return this.apHistoryId;
	}
	/**
	 * @param apHistoryId 附件购买记录主键
	 */
	public void setApHistoryId(Long apHistoryId){
		this.apHistoryId = apHistoryId;
	}
	/**
	 * @return operator 操作人
	 */
	public String getOperator(){
		return this.operator;
	}
	/**
	 * @param operator 操作人
	 */
	public void setOperator(String operator){
		this.operator = operator;
	}
	/**
	 * @return money 本期归还金额
	 */
	public Double getMoney(){
		return this.money;
	}
	/**
	 * @param money 本期归还金额
	 */
	public void setMoney(Double money){
		this.money = money;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("epHistoryId",getEpHistoryId())
			.append("apHistoryId",getApHistoryId())
			.append("operator",getOperator())
			.append("money",getMoney())
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
			.append(getEpHistoryId())
			.append(getApHistoryId())
			.append(getOperator())
			.append(getMoney())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Bystages == false) return false;
		if(this == obj) return true;
		Bystages other = (Bystages)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
