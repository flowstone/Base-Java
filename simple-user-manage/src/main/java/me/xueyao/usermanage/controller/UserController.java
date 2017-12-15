package me.xueyao.usermanage.controller;

import me.xueyao.usermanage.pojo.EasyUIResult;
import me.xueyao.usermanage.pojo.User;
import me.xueyao.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XueYao
 * @date 2017-12-11
 */
@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
/*

    @RequestMapping("users")
    public String toUser() {
        return "users";
    }
*/

    @RequestMapping("list")
    @ResponseBody
    public EasyUIResult queryUsersByPage(@RequestParam("page") Integer pageNum,@RequestParam("rows") Integer pageSize) {
        return this.userService.queryEasyUIResult(pageNum, pageSize);

    }

    /**
     *
     * @param pageName
     * @return
     */
    @RequestMapping("/page/{pageName}")
    public String toUserAdd(@PathVariable("pageName") String pageName) {
        return pageName;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "save")
    @ResponseBody
    public Map<String, Object> addUser(User user) {
        Map<String, Object> map = new HashMap<>();

        Boolean b = this.userService.addUser(user);
        try {
            if (b) {
                map.put("status", "200");
            } else {
                map.put("status", "500");
            }
        } catch (Exception e) {
            map.put("status", "500");
            e.printStackTrace();
        }

        return  map;
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public Map<String, Object> updateUser(User user) {
        Map<String, Object> map = new HashMap<>();
        Boolean updateStatus = this.userService.updateUser(user);
        try {
            if (updateStatus) {
                map.put("status", "200");
            } else {
                map.put("status", "500");
            }
        } catch (Exception e) {
            map.put("status", "500");
        }

        return map;
    }

    /**
     * 删除用户
     * @param ids
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public Map<String, Object> deleteUser(@RequestParam("ids") List<Object> ids) {
        Map<String, Object> map = new HashMap<>();
        Boolean infoStatus = this.userService.deleteUser(ids);
        try {
            if (infoStatus) {
                map.put("status", "200");
            } else {
                map.put("status", "500");
            }
        } catch (Exception e) {
            map.put("status", 500);
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 导出Excel表格
     * @param model
     * @param pageNum 当前页
     * @param pageSize
     * @return
     */
    @RequestMapping("export/excel")
    public String exportExcel(Model model, @RequestParam("page") Integer pageNum, @RequestParam("rows") Integer pageSize) {
        EasyUIResult easyUIResult = this.userService.queryEasyUIResult(pageNum, pageSize);
        model.addAttribute("userList", easyUIResult.getRows());
        return "userExcelView";

    }

}
