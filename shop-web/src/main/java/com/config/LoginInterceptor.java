package com.config;

import cn.hutool.json.JSONUtil;
import com.model.SysAdmin;
import com.util.HttpResult;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //设置跨域
        response.setContentType("textml;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "0");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With sessionState");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("XDomainRequestAllowed","1");
        String url = request.getRequestURL().toString();
        if (url.endsWith("/login")){
            return true;
        }
        SysAdmin sysAdmin = (SysAdmin) request.getSession().getAttribute("sysAdmin");
        if (sysAdmin == null){
            HttpResult httpResult = new HttpResult(HttpResult.CODE_LOGIN_FAILURE,"登录失效，请重新登录！");
            response.getWriter().write(JSONUtil.toJsonStr(httpResult));
            /*解决乱码*/
            response.setHeader("Content-type", "application/json;charset=UTF-8");
            response.setHeader("sessionState","false");
            return false;
        }
        return super.preHandle(request, response, handler);
    }

}
