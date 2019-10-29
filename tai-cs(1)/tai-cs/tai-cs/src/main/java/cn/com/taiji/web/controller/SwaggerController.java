package cn.com.taiji.web.controller;

import cn.com.taiji.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * swagger 接口
 *
 * @author wudx
 */
@Controller
@RequestMapping("/rest/swagger")
public class SwaggerController extends BaseController {
    @GetMapping()
    public String index() {
        return redirect("/swagger-ui.html");
    }


}
