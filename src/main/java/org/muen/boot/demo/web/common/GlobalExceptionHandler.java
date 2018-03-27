package org.muen.boot.demo.web.common;

import org.muen.boot.demo.web.util.WebConstant;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**import
 * @program: wxshop
 * @description: 统一异常处理
 * @author: Parasomnia
 * @create: 2018-03-13 15:04
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 默认异常处理方式
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResult businessExceptionHandler(HttpServletRequest req,Exception ex){
        JsonResult json = new JsonResult();
        json.setCode(WebConstant.ERR_CODE);
        json.setMsg(ex.getMessage());
        json.setUrl(req.getRequestURI());
        return json;
    }



}
