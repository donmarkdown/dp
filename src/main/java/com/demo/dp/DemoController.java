package com.demo.dp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ^_^!
 *
 * @author pcheng reviewcode@163.com
 * @date 19:54 2020/1/7
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("echo")
    public String echo() {
        return "today is nice day~~~";
    }
}
