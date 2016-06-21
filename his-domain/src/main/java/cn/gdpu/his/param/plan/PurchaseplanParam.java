/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：购买计划											
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

package cn.gdpu.his.param.plan;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《购买计划》 查询参数实体
 * @author 郭旭辉
 *
 */
public class PurchaseplanParam extends CreateBaseParam<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——标题
	*/
	public static final String F_Title="title";
	/**
	*字段常量——购买总额
	*/
	public static final String F_Total="total";
	/**
	*字段常量——是否完成购买，0：未完成，1：完成
	*/
	public static final String F_IsFinish="isFinish";
	
	private String title; //标题
	private Double total; //购买总额
	private Integer isFinish; //是否完成购买，0：未完成，1：完成
    
	/**
	 *默认空构造函数
	 */
	public PurchaseplanParam() {
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
	 * @return total 购买总额
	 */
	public Double getTotal(){
		return this.total;
	}
	/**
	 * @param total 购买总额
	 */
	public void setTotal(Double total){
		this.total = total;
	}
	/**
	 * @return isFinish 是否完成购买，0：未完成，1：完成
	 */
	public Integer getIsFinish(){
		return this.isFinish;
	}
	/**
	 * @param isFinish 是否完成购买，0：未完成，1：完成
	 */
	public void setIsFinish(Integer isFinish){
		this.isFinish = isFinish;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("title",getTitle())
			.append("total",getTotal())
			.append("isFinish",getIsFinish())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
