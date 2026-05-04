package com.xu.xuagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lx
 * @date 2026/5/4
 * @Description
 */
@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/check")
    public String check() {
        return "ok";
    }
}
