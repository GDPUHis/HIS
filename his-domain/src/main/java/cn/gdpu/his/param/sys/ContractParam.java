/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：合同管理											
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

package cn.gdpu.his.param.sys;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《合同管理》 查询参数实体
 * @author 郭旭辉
 *
 */
public class ContractParam extends CreateBaseParam<Integer> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——合同标题
	*/
	public static final String F_Title="title";
	/**
	*字段常量——合同图片
	*/
	public static final String F_CategoryId="categoryId";
	/**
	*字段常量——合同图片附件
	*/
	public static final String F_PicUrl="picUrl";
	/**
	*字段常量——供应商代码
	*/
	public static final String F_SupplierCode="supplierCode";
	
	private String title; //合同标题
	private Integer categoryId; //合同图片
	private String picUrl; //合同图片附件
	private String supplierCode; //供应商代码
    
	/**
	 *默认空构造函数
	 */
	public ContractParam() {
		super();
	}
	 
	/**
	 * @return title 合同标题
	 */
	public String getTitle(){
		return this.title;
	}
	/**
	 * @param title 合同标题
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 * @return categoryId 合同图片
	 */
	public Integer getCategoryId(){
		return this.categoryId;
	}
	/**
	 * @param categoryId 合同图片
	 */
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}
	/**
	 * @return picUrl 合同图片附件
	 */
	public String getPicUrl(){
		return this.picUrl;
	}
	/**
	 * @param picUrl 合同图片附件
	 */
	public void setPicUrl(String picUrl){
		this.picUrl = picUrl;
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
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("title",getTitle())
			.append("categoryId",getCategoryId())
			.append("picUrl",getPicUrl())
			.append("supplierCode",getSupplierCode())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
