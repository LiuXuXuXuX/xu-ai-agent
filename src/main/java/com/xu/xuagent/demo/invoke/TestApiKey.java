package com.xu.xuagent.demo.invoke;

/**
 * @author lx
 * @date 2026/5/4
 * @Description 仅用于测试API_KEY
 */
public interface TestApiKey {
    String API_KEY = System.getenv("DASHSCOPE_API_KEY");
}
