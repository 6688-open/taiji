package cn.com.taiji.system.mapper;

import cn.com.taiji.system.domain.PensionOrgInfo;
import java.util.List;	

/**
 * 养老机构 数据层
 * 
 * @author wudx
 * @date 2019-10-15
 */
public interface PensionOrgInfoMapper 
{
	/**
     * 查询养老机构信息
     * 
     * @param id 养老机构ID
     * @return 养老机构信息
     */
	public PensionOrgInfo selectPensionOrgInfoById(String id);
	
	/**
     * 查询养老机构列表
     * 
     * @param pensionOrgInfo 养老机构信息
     * @return 养老机构集合
     */
	public List<PensionOrgInfo> selectPensionOrgInfoList(PensionOrgInfo pensionOrgInfo);
	
	/**
     * 新增养老机构
     * 
     * @param pensionOrgInfo 养老机构信息
     * @return 结果
     */
	public int insertPensionOrgInfo(PensionOrgInfo pensionOrgInfo);
	
	/**
     * 修改养老机构
     * 
     * @param pensionOrgInfo 养老机构信息
     * @return 结果
     */
	public int updatePensionOrgInfo(PensionOrgInfo pensionOrgInfo);
	
	/**
     * 删除养老机构
     * 
     * @param id 养老机构ID
     * @return 结果
     */
	public int deletePensionOrgInfoById(String id);
	
	/**
     * 批量删除养老机构
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePensionOrgInfoByIds(String[] ids);
	
}