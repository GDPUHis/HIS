/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：设备使用情况，非高耗设备											
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

import cn.gdpu.common.param.CreateBaseParam;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 《设备使用情况，非高耗设备》 查询参数实体
 * @author 郭旭辉
 *
 */
public class IntegrityParam extends CreateBaseParam<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	*字段常量——设备主键id
	*/
	public static final String F_EquipmentId="equipmentId";
	/**
	*字段常量——grade
	*/
	public static final String F_Grade="grade";
	/**
	*字段常量——设备检测标题
	*/
	public static final String F_Title="title";
	/**
	*字段常量——设备检测内容
	*/
	public static final String F_Content="content";
	/**
	*字段常量——设备检测人
	*/
	public static final String F_Detector="detector";
	/**
	*字段常量——设备记录时间
	*/
	public static final String F_DetecteDate="detecteDate";
	/**
	*字段常量——设备检测记录人
	*/
	public static final String F_Noter="noter";
	/**
	*字段常量——设备检测记录时间
	*/
	public static final String F_NoteDate="noteDate";
	
	private Long equipmentId; //设备主键id
	private Integer grade; //grade
	private String title; //设备检测标题
	private String content; //设备检测内容
	private String detector; //设备检测人
	private String detecteDate; //设备记录时间
	private String noter; //设备检测记录人
	private String noteDate; //设备检测记录时间
    
	/**
	 *默认空构造函数
	 */
	public IntegrityParam() {
		super();
	}
	 
	/**
	 * @return equipmentId 设备主键id
	 */
	public Long getEquipmentId(){
		return this.equipmentId;
	}
	/**
	 * @param equipmentId 设备主键id
	 */
	public void setEquipmentId(Long equipmentId){
		this.equipmentId = equipmentId;
	}
	/**
	 * @return grade grade
	 */
	public Integer getGrade(){
		return this.grade;
	}
	/**
	 * @param grade grade
	 */
	public void setGrade(Integer grade){
		this.grade = grade;
	}
	/**
	 * @return title 设备检测标题
	 */
	public String getTitle(){
		return this.title;
	}
	/**
	 * @param title 设备检测标题
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 * @return content 设备检测内容
	 */
	public String getContent(){
		return this.content;
	}
	/**
	 * @param content 设备检测内容
	 */
	public void setContent(String content){
		this.content = content;
	}
	/**
	 * @return detector 设备检测人
	 */
	public String getDetector(){
		return this.detector;
	}
	/**
	 * @param detector 设备检测人
	 */
	public void setDetector(String detector){
		this.detector = detector;
	}
	/**
	 * @return detecteDate 设备记录时间
	 */
	public String getDetecteDate(){
		return this.detecteDate;
	}
	/**
	 * @param detecteDate 设备记录时间
	 */
	public void setDetecteDate(String detecteDate){
		this.detecteDate = detecteDate;
	}
	/**
	 * @return noter 设备检测记录人
	 */
	public String getNoter(){
		return this.noter;
	}
	/**
	 * @param noter 设备检测记录人
	 */
	public void setNoter(String noter){
		this.noter = noter;
	}
	/**
	 * @return noteDate 设备检测记录时间
	 */
	public String getNoteDate(){
		return this.noteDate;
	}
	/**
	 * @param noteDate 设备检测记录时间
	 */
	public void setNoteDate(String noteDate){
		this.noteDate = noteDate;
	}
	
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("equipmentId",getEquipmentId())
			.append("grade",getGrade())
			.append("title",getTitle())
			.append("content",getContent())
			.append("detector",getDetector())
			.append("detecteDate",getDetecteDate())
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
