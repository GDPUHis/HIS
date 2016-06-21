/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备附件表											
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

package cn.gdpu.his.param.accessory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《设备附件》 查询参数实体
 * @author 郭旭辉
 *
 */
public class AccessoryParam extends CreateBaseParam<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——附件名称
	*/
	public static final String F_Name="name";
	/**
	*字段常量——所属设备主键
	*/
	public static final String F_EquipmentId="equipmentId";
	/**
	*字段常量——库存数量
	*/
	public static final String F_Stock="stock";
	/**
	*字段常量——单价
	*/
	public static final String F_Price="price";
	/**
	*字段常量——附件规格参数
	*/
	public static final String F_Norms="norms";
	/**
	*字段常量——附件厂商
	*/
	public static final String F_Manufacturer="manufacturer";
	
	private String name; //附件名称
	private Long equipmentId; //所属设备主键
	private Integer stock; //库存数量
	private Double price; //单价
	private String norms; //附件规格参数
	private String manufacturer; //附件厂商
    
	/**
	 *默认空构造函数
	 */
	public AccessoryParam() {
		super();
	}
	 
	/**
	 * @return name 附件名称
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * @param name 附件名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * @return equipmentId 所属设备主键
	 */
	public Long getEquipmentId(){
		return this.equipmentId;
	}
	/**
	 * @param equipmentId 所属设备主键
	 */
	public void setEquipmentId(Long equipmentId){
		this.equipmentId = equipmentId;
	}
	/**
	 * @return stock 库存数量
	 */
	public Integer getStock(){
		return this.stock;
	}
	/**
	 * @param stock 库存数量
	 */
	public void setStock(Integer stock){
		this.stock = stock;
	}
	/**
	 * @return price 单价
	 */
	public Double getPrice(){
		return this.price;
	}
	/**
	 * @param price 单价
	 */
	public void setPrice(Double price){
		this.price = price;
	}
	/**
	 * @return norms 附件规格参数
	 */
	public String getNorms(){
		return this.norms;
	}
	/**
	 * @param norms 附件规格参数
	 */
	public void setNorms(String norms){
		this.norms = norms;
	}
	/**
	 * @return manufacturer 附件厂商
	 */
	public String getManufacturer(){
		return this.manufacturer;
	}
	/**
	 * @param manufacturer 附件厂商
	 */
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("name",getName())
			.append("equipmentId",getEquipmentId())
			.append("stock",getStock())
			.append("price",getPrice())
			.append("norms",getNorms())
			.append("manufacturer",getManufacturer())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
