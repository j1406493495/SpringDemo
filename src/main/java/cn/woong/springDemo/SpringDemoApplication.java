package cn.woong.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 该注解开启组件扫描和自动配置
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
	    // 负责启动引导应用程序
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
