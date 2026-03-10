package com.hd.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractChangeRequestUriGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * 自定义拦截器添
 */
@Component
public class MyFilter extends AbstractNameValueGatewayFilterFactory {
    @Override
    public GatewayFilter apply(String routeId, Consumer<NameValueConfig> consumer) {
        return super.apply(routeId, consumer);
    }

    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return null;
    }
}
