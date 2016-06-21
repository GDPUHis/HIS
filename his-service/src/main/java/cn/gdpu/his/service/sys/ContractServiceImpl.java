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

package cn.gdpu.his.service.sys;

import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.sys.IContractDAO;
import cn.gdpu.his.domain.sys.Contract;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * 《合同管理》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("ContractServiceImpl")
public class ContractServiceImpl extends AbstractHISPageService<IHISBaseDAO<Contract>, Contract> implements IContractService<IHISBaseDAO<Contract>,Contract>{
    @Autowired
    private IContractDAO contractDAO;

    @Override
    public IHISBaseDAO<Contract> getDao() {
        return contractDAO;
    }

}