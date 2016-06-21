/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：购买计划详情											
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

package cn.gdpu.his.domain.plan;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.domain.BaseDomain;

import java.util.*;

/**
 * 《购买计划详情》 实体
 * @author 郭旭辉
 *
 */
public class Plandetail extends BaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private Long equipment; //设别主键
	private Long planId; //计划主键
	private Integer count; //购买数量
	private Double price; //购买单价
	private String supplierCode; //供应商代码
	private Integer byStages; //是否分期，0：否，1：是
	private Integer byStagesNum; //分期次数
    
	/**
	 *默认空构造函数
	 */
	public Plandetail() {
		super();
	}
	 
	/**
	 * @return equipment 设别主键
	 */
	public Long getEquipment(){
		return this.equipment;
	}
	/**
	 * @param equipment 设别主键
	 */
	public void setEquipment(Long equipment){
		this.equipment = equipment;
	}
	/**
	 * @return planId 计划主键
	 */
	public Long getPlanId(){
		return this.planId;
	}
	/**
	 * @param planId 计划主键
	 */
	public void setPlanId(Long planId){
		this.planId = planId;
	}
	/**
	 * @return count 购买数量
	 */
	public Integer getCount(){
		return this.count;
	}
	/**
	 * @param count 购买数量
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	/**
	 * @return price 购买单价
	 */
	public Double getPrice(){
		return this.price;
	}
	/**
	 * @param price 购买单价
	 */
	public void setPrice(Double price){
		this.price = price;
	}
	/**
	 * @return supplierCode 供应商代码
	 */
	public String getSupplierCode(){
		return this.supplierCode;
	}
	/**
	 * @param supplierCode 供应商代码
	 */
	public void setSupplierCode(String supplierCode){
		this.supplierCode = supplierCode;
	}
	/**
	 * @return byStages 是否分期，0：否，1：是
	 */
	public Integer getByStages(){
		return this.byStages;
	}
	/**
	 * @param byStages 是否分期，0：否，1：是
	 */
	public void setByStages(Integer byStages){
		this.byStages = byStages;
	}
	/**
	 * @return byStagesNum 分期次数
	 */
	public Integer getByStagesNum(){
		return this.byStagesNum;
	}
	/**
	 * @param byStagesNum 分期次数
	 */
	public void setByStagesNum(Integer byStagesNum){
		this.byStagesNum = byStagesNum;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("equipment",getEquipment())
			.append("planId",getPlanId())
			.append("count",getCount())
			.append("price",getPrice())
			.append("supplierCode",getSupplierCode())
			.append("byStages",getByStages())
			.append("byStagesNum",getByStagesNum())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getEquipment())
			.append(getPlanId())
			.append(getCount())
			.append(getPrice())
			.append(getSupplierCode())
			.append(getByStages())
			.append(getByStagesNum())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Plandetail == false) return false;
		if(this == obj) return true;
		Plandetail other = (Plandetail)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
