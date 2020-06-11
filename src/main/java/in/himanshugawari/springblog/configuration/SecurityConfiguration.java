package in.himanshugawari.springblog.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.headers().frameOptions().disable();
		http.authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests().antMatchers("/h2-console/**")
				.permitAll();
		
		// http.authorizeRequests().antMatchers("/api/auth/**").permitAll().anyRequest().authenticated();
		// http.addFilterBefore(jwtAuthenticationFilter,
		// UsernamePasswordAuthenticationFilter.class);
	}

	/*
	 * @Override public void configure(HttpSecurity httpSecurity) throws Exception {
	 * httpSecurity.cors().and() .csrf().disable() .authorizeRequests()
	 * .antMatchers("/api/auth/**") .permitAll() .antMatchers(HttpMethod.GET,
	 * "/api/subreddit") .permitAll() .antMatchers(HttpMethod.GET, "/api/posts/")
	 * .permitAll() .antMatchers(HttpMethod.GET, "/api/posts/**") .permitAll()
	 * .antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**",
	 * "/configuration/security", "/swagger-ui.html", "/webjars/**") .permitAll()
	 * .anyRequest() .authenticated();
	 * httpSecurity.addFilterBefore(jwtAuthenticationFilter,
	 * UsernamePasswordAuthenticationFilter.class); }
	 */

	/*
	 * @Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder();
	 * }
	 */

}
