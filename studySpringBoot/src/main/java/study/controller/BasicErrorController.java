package study.controller;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class BasicErrorController extends AbstractErrorController {



    public BasicErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    public BasicErrorController(ErrorAttributes errorAttributes, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorViewResolvers);
    }

//    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response){
//        //获取错误状态码
//
//        HttpStatus status = getStatus(request);
//        //getErrorAttributes 根据错误信息来封装一些model数据，用于页面显示
//
////        Map<String,Object> model = Collections.unmodifiableMap(
////                getErrorAttributes(request,getErrorAttributes(request, MediaType.TEXT_HTML)));
//
//    }




}
