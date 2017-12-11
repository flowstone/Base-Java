package me.xueyao.springmvc.exception;

import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author XueYao
 * @date 2017-12-11
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv = new ModelAndView();
        if (ex instanceof MaxUploadSizeExceededException) {
            mv.setViewName("hello");
            mv.addObject("msg", "对不起，您上传的文件大小超过范围");
        }
        return  mv;
    }
}
