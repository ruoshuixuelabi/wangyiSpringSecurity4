package cn.sm1234.security;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
/**
 * @author admin
 */
@Configuration
public class ErrorPageConfig {
    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        /*
         * ErrorPage:定义错误页面
         * 参数一：HttpStatus.FORBIDDEN： 该错误接收什么错误状态码
         * 参数二：交给哪个请求处理
         */
        return container -> container.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/403"));
    }
}
