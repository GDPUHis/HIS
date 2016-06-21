/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备购买记录											
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

package cn.gdpu.his.param.equipment;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《设备购买记录》 查询参数实体
 * @author 郭旭辉
 *
 */
public class EphistoryParam extends CreateBaseParam<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——附件主键
	*/
	public static final String F_AccessoryId="accessoryId";
	/**
	*字段常量——购买数量
	*/
	public static final String F_Count="count";
	/**
	*字段常量——购买单价
	*/
	public static final String F_Price="price";
	/**
	*字段常量——供应商代码
	*/
	public static final String F_SupplierCode="supplierCode";
	/**
	*字段常量——购买办理人
	*/
	public static final String F_Transactor="transactor";
	/**
	*字段常量——购买日期
	*/
	public static final String F_PurcharDate="purcharDate";
	/**
	*字段常量——是否分期，0：否，1：是
	*/
	public static final String F_ByStages="byStages";
	/**
	*字段常量——分期次数
	*/
	public static final String F_ByStagesNum="byStagesNum";
	
	private Long accessoryId; //附件主键
	private Integer count; //购买数量
	private Double price; //购买单价
	private String supplierCode; //供应商代码
	private String transactor; //购买办理人
	private String purcharDate; //购买日期
	private Integer byStages; //是否分期，0：否，1：是
	private Integer byStagesNum; //分期次数
    
	/**
	 *默认空构造函数
	 */
	public EphistoryParam() {
		super();
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
	 * @return transactor 购买办理人
	 */
	public String getTransactor(){
		return this.transactor;
	}
	/**
	 * @param transactor 购买办理人
	 */
	public void setTransactor(String transactor){
		this.transactor = transactor;
	}
	/**
	 * @return purcharDate 购买日期
	 */
	public String getPurcharDate(){
		return this.purcharDate;
	}
	/**
	 * @param purcharDate 购买日期
	 */
	public void setPurcharDate(String purcharDate){
		this.purcharDate = purcharDate;
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
			.append("accessoryId",getAccessoryId())
			.append("count",getCount())
			.append("price",getPrice())
			.append("supplierCode",getSupplierCode())
			.append("transactor",getTransactor())
			.append("purcharDate",getPurcharDate())
			.append("byStages",getByStages())
			.append("byStagesNum",getByStagesNum())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
