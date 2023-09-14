package academy.prog.chatserversprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import static org.springframework.security.config.Customizer.withDefaults;

@SpringBootApplication
//@EnableWebSecurity
public class ChatServerSprintApplication {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(option -> option.disable())
//                .authorizeHttpRequests(auth -> {
//                    auth.requestMatchers("/test").hasRole("ADMIN");
//                    auth.requestMatchers(HttpMethod.POST, "/add").permitAll();
//                    auth.requestMatchers(HttpMethod.GET, "/get").permitAll();
//                })
//                .httpBasic(withDefaults());
//
//        return http.build();
//    }
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.addAllowedOrigin("http://127.0.0.1:5500"); // Здійснювати запити з цього джерела
//        configuration.addAllowedMethod(HttpMethod.GET);
//        configuration.addAllowedMethod(HttpMethod.POST);
//        // Додайте додаткові методи, які дозволено використовувати
//        // configuration.addAllowedHeader("Authorization"); // Додайте дозволені заголовки, якщо потрібно
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ChatServerSprintApplication.class, args);
    }
}
