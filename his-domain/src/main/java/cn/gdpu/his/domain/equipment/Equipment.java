/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备基础信息表											
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
 * 《设备基础信息》 实体
 * @author 郭旭辉
 *
 */
public class Equipment extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private String name; //设备名称
	private Integer categoryId; //设备类型
	private String manufacturer; //设备厂商
	private String deadline; //设备使用期限
	private Integer count; //设备库存数量（针对高耗）
	private Integer quantity; //设备数量
	private Integer isHighConsumption; //是否为高耗设备，0：非高耗，1：高耗
	private Integer isInport; //是否为进口设备，0：非进口，1：进口
	private Double usePrice; //使用价格
	private Double price; //购买价格
    
	/**
	 *默认空构造函数
	 */
	public Equipment() {
		super();
	}
	 
	/**
	 * @return name 设备名称
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * @param name 设备名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * @return categoryId 设备类型
	 */
	public Integer getCategoryId(){
		return this.categoryId;
	}
	/**
	 * @param categoryId 设备类型
	 */
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}
	/**
	 * @return manufacturer 设备厂商
	 */
	public String getManufacturer(){
		return this.manufacturer;
	}
	/**
	 * @param manufacturer 设备厂商
	 */
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	/**
	 * @return deadline 设备使用期限
	 */
	public String getDeadline(){
		return this.deadline;
	}
	/**
	 * @param deadline 设备使用期限
	 */
	public void setDeadline(String deadline){
		this.deadline = deadline;
	}
	/**
	 * @return count 设备库存数量（针对高耗）
	 */
	public Integer getCount(){
		return this.count;
	}
	/**
	 * @param count 设备库存数量（针对高耗）
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	/**
	 * @return quantity 设备数量
	 */
	public Integer getQuantity(){
		return this.quantity;
	}
	/**
	 * @param quantity 设备数量
	 */
	public void setQuantity(Integer quantity){
		this.quantity = quantity;
	}
	/**
	 * @return isHighConsumption 是否为高耗设备，0：非高耗，1：高耗
	 */
	public Integer getIsHighConsumption(){
		return this.isHighConsumption;
	}
	/**
	 * @param isHighConsumption 是否为高耗设备，0：非高耗，1：高耗
	 */
	public void setIsHighConsumption(Integer isHighConsumption){
		this.isHighConsumption = isHighConsumption;
	}
	/**
	 * @return isInport 是否为进口设备，0：非进口，1：进口
	 */
	public Integer getIsInport(){
		return this.isInport;
	}
	/**
	 * @param isInport 是否为进口设备，0：非进口，1：进口
	 */
	public void setIsInport(Integer isInport){
		this.isInport = isInport;
	}
	/**
	 * @return usePrice 使用价格
	 */
	public Double getUsePrice(){
		return this.usePrice;
	}
	/**
	 * @param usePrice 使用价格
	 */
	public void setUsePrice(Double usePrice){
		this.usePrice = usePrice;
	}
	/**
	 * @return price 购买价格
	 */
	public Double getPrice(){
		return this.price;
	}
	/**
	 * @param price 购买价格
	 */
	public void setPrice(Double price){
		this.price = price;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("name",getName())
			.append("categoryId",getCategoryId())
			.append("manufacturer",getManufacturer())
			.append("deadline",getDeadline())
			.append("count",getCount())
			.append("quantity",getQuantity())
			.append("isHighConsumption",getIsHighConsumption())
			.append("isInport",getIsInport())
			.append("usePrice",getUsePrice())
			.append("price",getPrice())
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
			.append(getCategoryId())
			.append(getManufacturer())
			.append(getDeadline())
			.append(getCount())
			.append(getQuantity())
			.append(getIsHighConsumption())
			.append(getIsInport())
			.append(getUsePrice())
			.append(getPrice())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Equipment == false) return false;
		if(this == obj) return true;
		Equipment other = (Equipment)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
