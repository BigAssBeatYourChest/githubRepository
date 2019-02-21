package com.baizhi.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by 杨宁
 * On 2019/1/15.
 */
@Controller
@RequestMapping("/imgCode")
public class CaptchaController {

    @RequestMapping("/getImgCode")
    public void myCaptcha(HttpServletRequest request, HttpServletResponse response){
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(60, 30, 1, 10);
        try {
            captcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        request.getSession().setAttribute("verificationCode",captcha.getCode());
    }
}
