package com.vinicius.pos.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthenticationServerConfig extends AuthorizationServerConfigurerAdapter {

	
	@Autowired AuthenticationManager authentionManager;
	
	
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(geTokenStore()).accessTokenConverter(getAcessTokenConverterJwt()).authenticationManager(authentionManager);
	}


	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("apiBibliotecaClient").secret("api123").scopes("write","read")
		.authorizedGrantTypes("password","refresh_token").accessTokenValiditySeconds(3600).refreshTokenValiditySeconds(3600*24);
	}

	@Bean
	public JwtAccessTokenConverter getAcessTokenConverterJwt() {
	JwtAccessTokenConverter converter = new JwtAccessTokenConverter();converter.setSigningKey("apiBiblioteca");return converter;}
	
	@Bean
	public TokenStore geTokenStore() {return new JwtTokenStore(getAcessTokenConverterJwt());}
	
}
