package me.xueyao.usermanage.controller;

import me.xueyao.usermanage.pojo.User;
import me.xueyao.usermanage.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author XueYao
 * @date 2017-12-15
 */
@RestController
@RequestMapping(value = "rest/user")
public class RESTfulUserController {
    @Autowired
    private UserService userService;

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    @GetMapping(value = "{id}")
    public ResponseEntity<User> queryUserById(@PathVariable("id") Long id) {
        try {
            if (id.longValue() < 1) {
                //400
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }
            User user = this.userService.queryUserById(id);
            if (null == user) {
                //404
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            //200
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> saveUser(User user) {
        try {
            if (StringUtils.isBlank(user.getUserName())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            this.userService.addUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    /**
     * 更新数据
     * @param user
     * @return
     */
    @PutMapping
    public ResponseEntity<Void> updateUser(User user) {
        try {
            if (null == user.getId() || user.getId().longValue() < 1) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            this.userService.updateUser(user);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
