package com.st.controller;

import com.st.service.StartCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * 查看上传日志控制类
 * Created by sxm on 2016/10/19.
 */
@Controller
@RequestMapping("index")
public class IndexPageController {

    @Autowired
    private StartCountService startCountService;

    @RequestMapping("/one")
    public @ResponseBody void InitServerInfo(){
        HashMap parm = new HashMap();
        parm.put("step","step1");
        int count = startCountService.getCount(parm);
        System.out.println(count);
    }
}
