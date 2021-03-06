/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备使用情况											
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

package cn.gdpu.his.param.record;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import cn.gdpu.common.param.CreateBaseParam;

import java.util.*;

/**
 * 《设备使用情况》 查询参数实体
 * @author 郭旭辉
 *
 */
public class EmploymentParam extends CreateBaseParam<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——使用内容
	*/
	public static final String F_Content="content";
	/**
	*字段常量——使用人
	*/
	public static final String F_UseMan="useMan";
	/**
	*字段常量——使用时间
	*/
	public static final String F_UseDate="useDate";
	/**
	*字段常量——本次使用价格
	*/
	public static final String F_Price="price";
	/**
	*字段常量——记录人
	*/
	public static final String F_Noter="noter";
	/**
	*字段常量——记录时间
	*/
	public static final String F_NoteDate="noteDate";
	
	private String content; //使用内容
	private String useMan; //使用人
	private String useDate; //使用时间
	private Double price; //本次使用价格
	private String noter; //记录人
	private String noteDate; //记录时间
    
	/**
	 *默认空构造函数
	 */
	public EmploymentParam() {
		super();
	}
	 
	/**
	 * @return content 使用内容
	 */
	public String getContent(){
		return this.content;
	}
	/**
	 * @param content 使用内容
	 */
	public void setContent(String content){
		this.content = content;
	}
	/**
	 * @return useMan 使用人
	 */
	public String getUseMan(){
		return this.useMan;
	}
	/**
	 * @param useMan 使用人
	 */
	public void setUseMan(String useMan){
		this.useMan = useMan;
	}
	/**
	 * @return useDate 使用时间
	 */
	public String getUseDate(){
		return this.useDate;
	}
	/**
	 * @param useDate 使用时间
	 */
	public void setUseDate(String useDate){
		this.useDate = useDate;
	}
	/**
	 * @return price 本次使用价格
	 */
	public Double getPrice(){
		return this.price;
	}
	/**
	 * @param price 本次使用价格
	 */
	public void setPrice(Double price){
		this.price = price;
	}
	/**
	 * @return noter 记录人
	 */
	public String getNoter(){
		return this.noter;
	}
	/**
	 * @param noter 记录人
	 */
	public void setNoter(String noter){
		this.noter = noter;
	}
	/**
	 * @return noteDate 记录时间
	 */
	public String getNoteDate(){
		return this.noteDate;
	}
	/**
	 * @param noteDate 记录时间
	 */
	public void setNoteDate(String noteDate){
		this.noteDate = noteDate;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("content",getContent())
			.append("useMan",getUseMan())
			.append("useDate",getUseDate())
			.append("price",getPrice())
			.append("noter",getNoter())
			.append("noteDate",getNoteDate())
			.append("creator",getCreator())
			.append("createDate",getCreateDate())
			.append("lastModifier",getLastModifier())
			.append("lastModDate",getLastModDate())
			.append("status",getStatus())
			.toString();
	}
	
}
