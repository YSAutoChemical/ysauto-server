package com.ys.carmanageserver.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class SwaggerConfig : WebMvcConfigurer {
    @Bean
    fun openApi(): OpenAPI =
        OpenAPI()
            .info(
                Info()
                    .title("YS Auto Swagger")
                    .description("YS Auto 사진 관리 서비스 스웨거")
                    .version("1.0.0")
                    .contact(Contact().name("woocurlee").email("woocurlee@gmail.com")),
            )
}
