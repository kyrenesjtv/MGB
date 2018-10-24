package com.gjp.example.Utils;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.thymeleaf.expression.Maps;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 耿俊鹏 on 2018/8/24.
 */
@Component
@Aspect
public class AopUtil {

    @Pointcut("execution(* com.gjp.example.Controller..*.*(..))")
    public void executeService(){

    }
    @Before("executeService()")
    public void doBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("我是前置通知!!!");
        //获取目标方法的参数信息
        Object[] obj = joinPoint.getArgs();
        //AOP代理类的信息
        joinPoint.getThis();
        //代理的目标对象
        joinPoint.getTarget();
        //用的最多 通知的签名
        Signature signature = joinPoint.getSignature();
        //代理的是哪一个方法
        System.out.println(signature.getName());
        //AOP代理类的名字
        System.out.println(signature.getDeclaringTypeName());
        //AOP代理类的类（class）信息
        signature.getDeclaringType();
        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        //如果要获取Session信息的话，可以这样写：
        //HttpSession session = (HttpSession) requestAttributes.resolveReference(RequestAttributes.REFERENCE_SESSION);
        Enumeration<String> enumeration = request.getParameterNames();
        Map<String, String> parameterMap = new HashMap();
        while (enumeration.hasMoreElements()) {
            String parameter = enumeration.nextElement();
            parameterMap.put(parameter, request.getParameter(parameter));
        }
        String str = JSON.toJSONString(parameterMap);
        if (obj.length > 0) {
            System.out.println("请求的参数信息为：" + str);
        }
    }

    @AfterReturning(returning = "res",pointcut ="executeService()")
    public void doAfterReturning(JoinPoint joinPoint,Object res){
        System.out.println(res);
    }

    @AfterReturning(pointcut ="executeService()",returning = "res",argNames = "res")
    public void doAfterReturning2(String res){
        System.out.println(res);
    }
    }
