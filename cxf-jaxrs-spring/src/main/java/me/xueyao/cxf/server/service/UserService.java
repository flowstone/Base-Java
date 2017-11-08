package me.xueyao.cxf.server.service;

import me.xueyao.cxf.server.domain.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-11-06
 */
//SEI的接口：暴露给客户端调用：资源
 @Path("/users")
 @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface UserService {
    /**
     * 保存用户
     * @param user
     */
    //@Path("/users") //资源URI
    @POST //保存
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    void save(User user);

    /**
     * 更新用户
     * @param user
     */
    //@Path("/users")
    @PUT //更新
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    void update(User user);

    /**
     * 删除用户
     * @param id
     */
    //@Path("/users/{id}") //路径参数
    @Path("/{id}")
    @DELETE//删除
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    void delete(@PathParam("id") Integer id);

    /**
     * 查询所有
     * @return
     */
    //@Path("/users")
    @GET //查询
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    //@Path("/users/{id}")
    @Path("/{id}")
    @GET
    //@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) //消费者
    //@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) //生产者
    User findById(@PathParam("id") Integer id);
}
