package xyz.ruankun.sxsicau.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger的注释
 *
 * @Api：修饰整个类，描述Controller的作用
 *
 * @ApiOperation：描述一个类的一个方法，或者说一个接口
 *
 * @ApiParam：单个参数描述
 *
 * @ApiModel：用对象来接收参数
 *
 * @ApiProperty：用对象接收参数时，描述对象的一个字段
 *
 * @ApiResponse：HTTP响应其中1个描述
 *
 * @ApiResponses：HTTP响应整体描述
 *
 * @ApiIgnore：使用该注解忽略这个API
 *
 * @ApiClass
 *
 * @ApiError
 *
 * @ApiErrors
 *
 * @ApiParamImplicit
 *
 * @ApiParamsImplicit
 */
@Component
@ComponentScan(basePackages = {"xyz.ruankun.sxsicau.controller"})
public class SwaggerConfiguration implements WebMvcConfigurer {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("实习毕业管理信息系统")
                .description("api由阮中华提供")
                .license("0")
                .licenseUrl("= =！")
                .termsOfServiceUrl("")
                .version("1.0")
                .contact(new Contact("阮中华","https://ruankun.xyz", "qkmc@outlook.com"))
                .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("xyz.ruankun.sxsicau.controller"))
                .build()
                .apiInfo(apiInfo());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
