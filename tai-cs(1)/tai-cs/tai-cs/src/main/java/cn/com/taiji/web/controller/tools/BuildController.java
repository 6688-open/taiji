package cn.com.taiji.web.controller.tools;

import cn.com.taiji.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * build 表单构建
 *
 * @author wudx
 */
@Controller
@RequestMapping("/tool/build")
public class BuildController extends BaseController
{
    private String prefix = "tool/build";

    @GetMapping()
    public String build()
    {
        return prefix + "/build";
    }
}
