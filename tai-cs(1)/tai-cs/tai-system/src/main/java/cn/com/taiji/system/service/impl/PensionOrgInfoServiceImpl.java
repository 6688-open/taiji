package cn.com.taiji.system.service.impl;

import java.util.List;

import cn.com.taiji.common.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.com.taiji.system.mapper.PensionOrgInfoMapper;
import cn.com.taiji.system.domain.PensionOrgInfo;
import cn.com.taiji.system.service.IPensionOrgInfoService;
import cn.com.taiji.common.support.Convert;

/**
 * 养老机构 服务层实现
 * 
 * @author wudx
 * @date 2019-10-15
 */
@Service
public class PensionOrgInfoServiceImpl implements IPensionOrgInfoService 
{
	@Autowired
	private PensionOrgInfoMapper pensionOrgInfoMapper;

	/**
     * 查询养老机构信息
     * 
     * @param id 养老机构ID
     * @return 养老机构信息
     */
    @Override
	public PensionOrgInfo selectPensionOrgInfoById(String id)
	{
	    return pensionOrgInfoMapper.selectPensionOrgInfoById(id);
	}
	
	/**
     * 查询养老机构列表
     * 
     * @param pensionOrgInfo 养老机构信息
     * @return 养老机构集合
     */
	@Override
	public List<PensionOrgInfo> selectPensionOrgInfoList(PensionOrgInfo pensionOrgInfo)
	{
	    return pensionOrgInfoMapper.selectPensionOrgInfoList(pensionOrgInfo);
	}
	
    /**
     * 新增养老机构
     * 
     * @param pensionOrgInfo 养老机构信息
     * @return 结果
     */
	@Override
	public int insertPensionOrgInfo(PensionOrgInfo pensionOrgInfo)
	{
		IdGenerator id = new IdGenerator();
		pensionOrgInfo.setId(String.valueOf(id.nextId()));
	    return pensionOrgInfoMapper.insertPensionOrgInfo(pensionOrgInfo);
	}
	
	/**
     * 修改养老机构
     * 
     * @param pensionOrgInfo 养老机构信息
     * @return 结果
     */
	@Override
	public int updatePensionOrgInfo(PensionOrgInfo pensionOrgInfo)
	{
	    return pensionOrgInfoMapper.updatePensionOrgInfo(pensionOrgInfo);
	}

	/**
     * 删除养老机构对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePensionOrgInfoByIds(String ids)
	{
		return pensionOrgInfoMapper.deletePensionOrgInfoByIds(Convert.toStrArray(ids));
	}
	
}
