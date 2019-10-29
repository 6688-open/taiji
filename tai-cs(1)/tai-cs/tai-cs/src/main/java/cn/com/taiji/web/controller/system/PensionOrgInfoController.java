package cn.com.taiji.web.controller.system;

import cn.com.taiji.common.annotation.Log;
import cn.com.taiji.common.base.AjaxResult;
import cn.com.taiji.common.enums.BusinessType;
import cn.com.taiji.common.page.TableDataInfo;
import cn.com.taiji.common.utils.poi.ExcelUtil;
import cn.com.taiji.framework.web.base.BaseController;
import cn.com.taiji.system.domain.PensionOrgInfo;
import cn.com.taiji.system.service.IPensionOrgInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 养老机构 信息操作处理
 * 
 * @author wudx
 * @date 2019-10-15
 */
@Controller
@RequestMapping("/system/pensionOrgInfo")
public class PensionOrgInfoController extends BaseController
{
    private String prefix = "system/pensionOrgInfo";
	
	@Autowired
	private IPensionOrgInfoService pensionOrgInfoService;
	
	@GetMapping()
	public String pensionOrgInfo()
	{
	    return prefix + "/pensionOrgInfo";
	}
	
	/**
	 * 查询养老机构列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PensionOrgInfo pensionOrgInfo)
	{
		startPage();
        List<PensionOrgInfo> list = pensionOrgInfoService.selectPensionOrgInfoList(pensionOrgInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出养老机构列表
	 */
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PensionOrgInfo pensionOrgInfo)
    {
    	List<PensionOrgInfo> list = pensionOrgInfoService.selectPensionOrgInfoList(pensionOrgInfo);
        ExcelUtil<PensionOrgInfo> util = new ExcelUtil<PensionOrgInfo>(PensionOrgInfo.class);
        return util.exportExcel(list, "pensionOrgInfo");
    }
	
	/**
	 * 新增养老机构
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存养老机构
	 */
	@Log(title = "养老机构", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(PensionOrgInfo pensionOrgInfo)
	{		
		return toAjax(pensionOrgInfoService.insertPensionOrgInfo(pensionOrgInfo));
	}

	/**
	 * 修改养老机构
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		PensionOrgInfo pensionOrgInfo = pensionOrgInfoService.selectPensionOrgInfoById(id);
		mmap.put("pensionOrgInfo", pensionOrgInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存养老机构
	 */
	@Log(title = "养老机构", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PensionOrgInfo pensionOrgInfo)
	{		
		return toAjax(pensionOrgInfoService.updatePensionOrgInfo(pensionOrgInfo));
	}
	
	/**
	 * 删除养老机构
	 */
	@Log(title = "养老机构", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(pensionOrgInfoService.deletePensionOrgInfoByIds(ids));
	}
	
}
