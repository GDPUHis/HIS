/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：供应商											
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

package cn.gdpu.his.param.user;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《供应商》 查询参数实体
 * @author 郭旭辉
 *
 */
public class SupplierParam extends CreateBaseParam<Integer> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——供应商名称
	*/
	public static final String F_Name="name";
	/**
	*字段常量——供应商地址
	*/
	public static final String F_Address="address";
	/**
	*字段常量——供应商负责人
	*/
	public static final String F_Principal="principal";
	/**
	*字段常量——供应商联系电话
	*/
	public static final String F_Phone="phone";
	/**
	*字段常量——供应商座机
	*/
	public static final String F_LineTelephone="lineTelephone";
	/**
	*字段常量——供应商传真号
	*/
	public static final String F_Fax="fax";
	/**
	*字段常量——供应商邮箱
	*/
	public static final String F_Email="email";
	/**
	*字段常量——供应商代码
	*/
	public static final String F_Code="code";
	
	private String name; //供应商名称
	private String address; //供应商地址
	private String principal; //供应商负责人
	private String phone; //供应商联系电话
	private String lineTelephone; //供应商座机
	private String fax; //供应商传真号
	private String email; //供应商邮箱
	private String code; //供应商代码
    
	/**
	 *默认空构造函数
	 */
	public SupplierParam() {
		super();
	}
	 
	/**
	 * @return name 供应商名称
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * @param name 供应商名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * @return address 供应商地址
	 */
	public String getAddress(){
		return this.address;
	}
	/**
	 * @param address 供应商地址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 * @return principal 供应商负责人
	 */
	public String getPrincipal(){
		return this.principal;
	}
	/**
	 * @param principal 供应商负责人
	 */
	public void setPrincipal(String principal){
		this.principal = principal;
	}
	/**
	 * @return phone 供应商联系电话
	 */
	public String getPhone(){
		return this.phone;
	}
	/**
	 * @param phone 供应商联系电话
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	 * @return lineTelephone 供应商座机
	 */
	public String getLineTelephone(){
		return this.lineTelephone;
	}
	/**
	 * @param lineTelephone 供应商座机
	 */
	public void setLineTelephone(String lineTelephone){
		this.lineTelephone = lineTelephone;
	}
	/**
	 * @return fax 供应商传真号
	 */
	public String getFax(){
		return this.fax;
	}
	/**
	 * @param fax 供应商传真号
	 */
	public void setFax(String fax){
		this.fax = fax;
	}
	/**
	 * @return email 供应商邮箱
	 */
	public String getEmail(){
		return this.email;
	}
	/**
	 * @param email 供应商邮箱
	 */
	public void setEmail(String email){
		this.email = email;
	}
	/**
	 * @return code 供应商代码
	 */
	public String getCode(){
		return this.code;
	}
	/**
	 * @param code 供应商代码
	 */
	public void setCode(String code){
		this.code = code;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("name",getName())
			.append("address",getAddress())
			.append("principal",getPrincipal())
			.append("phone",getPhone())
			.append("lineTelephone",getLineTelephone())
			.append("fax",getFax())
			.append("email",getEmail())
			.append("code",getCode())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
