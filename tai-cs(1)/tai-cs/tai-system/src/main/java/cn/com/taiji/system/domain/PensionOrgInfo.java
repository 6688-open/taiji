package cn.com.taiji.system.domain;

import cn.com.taiji.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import cn.com.taiji.common.base.BaseEntity;
import java.util.Date;

/**
 * 养老机构表 pension_org_info
 * 
 * @author wudx
 * @date 2019-10-15
 */
public class PensionOrgInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private String id;
	/** 场所名称 */
	private String placeName;
	/** 负责人id */
	private String headerId;
	/** 行政区划代码 */
	private String areaCode;
	/** 地址 */
	private String address;
	/** 11-公办福利院、12-民办养老院、13-社区小微型养老机构、14-农村敬老院、21-省级养老示范点、22-社区日间照料中心、23-幸福之家、24-互动幸福屋、25-宣老自主屋、26-养老健康屋 */
	private String placeType;
	/** 1-公办、2-民办、3-公办民营 */
	@Excel(name="经营类型", readConverterExp = "公办=1,民办=2,公办民营=3")
	private String businessType;
	/** 服务电话 */
	private String servicePhone;
	/** 使用面积 */
	private Integer useArea;
	/** 床位数量 */
	private Integer bedNum;
	/** 入住人数 */
	private Integer checkinNum;
	/** 10-是、11-自建、12-自建医院、13-自建医务室、00-否、01-签约、02-签约一级医院、03-签约二级医院、04-签约三级医院 */
	private String isEstablishMedical;
	/** 0-禁用、1-正常 */
	private String status;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 1-未删除，-1-已删除 */
	private Integer logicFlag;
	/** 1-全托服务、2-日托服务、3-喘息服务 */
	private String serviceScope;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setPlaceName(String placeName) 
	{
		this.placeName = placeName;
	}

	public String getPlaceName() 
	{
		return placeName;
	}
	public void setHeaderId(String headerId) 
	{
		this.headerId = headerId;
	}

	public String getHeaderId() 
	{
		return headerId;
	}
	public void setAreaCode(String areaCode) 
	{
		this.areaCode = areaCode;
	}

	public String getAreaCode() 
	{
		return areaCode;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setPlaceType(String placeType) 
	{
		this.placeType = placeType;
	}

	public String getPlaceType() 
	{
		return placeType;
	}
	public void setBusinessType(String businessType) 
	{
		this.businessType = businessType;
	}

	public String getBusinessType() 
	{
		return businessType;
	}
	public void setServicePhone(String servicePhone) 
	{
		this.servicePhone = servicePhone;
	}

	public String getServicePhone() 
	{
		return servicePhone;
	}
	public void setUseArea(Integer useArea) 
	{
		this.useArea = useArea;
	}

	public Integer getUseArea() 
	{
		return useArea;
	}
	public void setBedNum(Integer bedNum) 
	{
		this.bedNum = bedNum;
	}

	public Integer getBedNum() 
	{
		return bedNum;
	}
	public void setCheckinNum(Integer checkinNum) 
	{
		this.checkinNum = checkinNum;
	}

	public Integer getCheckinNum() 
	{
		return checkinNum;
	}
	public void setIsEstablishMedical(String isEstablishMedical) 
	{
		this.isEstablishMedical = isEstablishMedical;
	}

	public String getIsEstablishMedical() 
	{
		return isEstablishMedical;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setLogicFlag(Integer logicFlag) 
	{
		this.logicFlag = logicFlag;
	}

	public Integer getLogicFlag() 
	{
		return logicFlag;
	}
	public void setServiceScope(String serviceScope) 
	{
		this.serviceScope = serviceScope;
	}

	public String getServiceScope() 
	{
		return serviceScope;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("placeName", getPlaceName())
            .append("headerId", getHeaderId())
            .append("areaCode", getAreaCode())
            .append("address", getAddress())
            .append("placeType", getPlaceType())
            .append("businessType", getBusinessType())
            .append("servicePhone", getServicePhone())
            .append("useArea", getUseArea())
            .append("bedNum", getBedNum())
            .append("checkinNum", getCheckinNum())
            .append("isEstablishMedical", getIsEstablishMedical())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("logicFlag", getLogicFlag())
            .append("serviceScope", getServiceScope())
            .toString();
    }
}
