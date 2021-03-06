/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：系统用户基础信息（模拟表）											
{  功能描述:										
{															
{  ---------------------------------------------------------------------------	
{  维护历史:													
{  日期        维护人        维护类型						
{  ---------------------------------------------------------------------------	
{  2016-06-24  郭旭辉        新建	
{ 	                                                                     
{*****************************************************************************
*/

package cn.gdpu.his.domain.user;

import cn.gdpu.common.domain.HISCreateBaseDomain;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 《系统用户基础信息（模拟表）》 实体
 * @author 郭旭辉
 *
 */
public class User extends HISCreateBaseDomain<Long> {
	private static final long serialVersionUID = 1L;
	
	private String username; //账号
	private String password; //密码
	private String name; //姓名
	private String phone; //联系电话
	private String lineTel; //固定电话
	private Integer age; //年龄
	private Integer gender; //性别
	private String jobNumber; //工号
	private Integer positionId; //职位
	private Integer departmentId; //所属部门
	private String code; //uuid
	private Integer userTypes; //用户身份，1：普通用户，2：科室负责人；4：管理员；8:超级管理员
    
	/**
	 *默认空构造函数
	 */
	public User() {
		super();
	}
	 
	/**
	 * @return username 账号
	 */
	public String getUsername(){
		return this.username;
	}
	/**
	 * @param username 账号
	 */
	public void setUsername(String username){
		this.username = username;
	}
	/**
	 * @return password 密码
	 */
	public String getPassword(){
		return this.password;
	}
	/**
	 * @param password 密码
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * @return name 姓名
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * @param name 姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * @return phone 联系电话
	 */
	public String getPhone(){
		return this.phone;
	}
	/**
	 * @param phone 联系电话
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	 * @return lineTel 固定电话
	 */
	public String getLineTel(){
		return this.lineTel;
	}
	/**
	 * @param lineTel 固定电话
	 */
	public void setLineTel(String lineTel){
		this.lineTel = lineTel;
	}
	/**
	 * @return age 年龄
	 */
	public Integer getAge(){
		return this.age;
	}
	/**
	 * @param age 年龄
	 */
	public void setAge(Integer age){
		this.age = age;
	}
	/**
	 * @return gender 性别
	 */
	public Integer getGender(){
		return this.gender;
	}
	/**
	 * @param gender 性别
	 */
	public void setGender(Integer gender){
		this.gender = gender;
	}
	/**
	 * @return jobNumber 工号
	 */
	public String getJobNumber(){
		return this.jobNumber;
	}
	/**
	 * @param jobNumber 工号
	 */
	public void setJobNumber(String jobNumber){
		this.jobNumber = jobNumber;
	}
	/**
	 * @return positionId 职位
	 */
	public Integer getPositionId(){
		return this.positionId;
	}
	/**
	 * @param positionId 职位
	 */
	public void setPositionId(Integer positionId){
		this.positionId = positionId;
	}
	/**
	 * @return departmentId 所属部门
	 */
	public Integer getDepartmentId(){
		return this.departmentId;
	}
	/**
	 * @param departmentId 所属部门
	 */
	public void setDepartmentId(Integer departmentId){
		this.departmentId = departmentId;
	}
	/**
	 * @return code uuid
	 */
	public String getCode(){
		return this.code;
	}
	/**
	 * @param code uuid
	 */
	public void setCode(String code){
		this.code = code;
	}
	/**
	 * @return userTypes 用户身份，1：普通用户，2：科室负责人；4：管理员；8:超级管理员
	 */
	public Integer getUserTypes(){
		return this.userTypes;
	}
	/**
	 * @param userTypes 用户身份，1：普通用户，2：科室负责人；4：管理员；8:超级管理员
	 */
	public void setUserTypes(Integer userTypes){
		this.userTypes = userTypes;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("username",getUsername())
			.append("password",getPassword())
			.append("name",getName())
			.append("phone",getPhone())
			.append("lineTel",getLineTel())
			.append("age",getAge())
			.append("gender",getGender())
			.append("jobNumber",getJobNumber())
			.append("positionId",getPositionId())
			.append("departmentId",getDepartmentId())
			.append("code",getCode())
			.append("userTypes",getUserTypes())
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
			.append(getUsername())
			.append(getPassword())
			.append(getName())
			.append(getPhone())
			.append(getLineTel())
			.append(getAge())
			.append(getGender())
			.append(getJobNumber())
			.append(getPositionId())
			.append(getDepartmentId())
			.append(getCode())
			.append(getUserTypes())
			.append(getCreator())
			.append(getCreateDate())
			.append(getLastModifier())
			.append(getLastModDate())
			.append(getStatus())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof User == false) return false;
		if(this == obj) return true;
		User other = (User)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}
