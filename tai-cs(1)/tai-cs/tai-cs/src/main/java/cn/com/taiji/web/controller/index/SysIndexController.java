package cn.com.taiji.web.controller.index;

import cn.com.taiji.common.config.Global;
import cn.com.taiji.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页 业务处理
 *
 * @author wudx
 */
@Controller
public class SysIndexController extends BaseController {

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap) {
        mmap.put("copyrightYear", Global.getCopyrightYear());
        return "index";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap) {
        mmap.put("version", Global.getVersion());
        return "main";
    }
}
