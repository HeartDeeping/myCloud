package com.hd.gateway.predicate;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.cloud.gateway.handler.AsyncPredicate;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.QueryRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.List;
import java.util.function.Predicate;

/**
 * 自定义断言工厂
 */
@Component
public class VipRoutePredicateFactory extends AbstractRoutePredicateFactory<VipRoutePredicateFactory.Config> {


    public VipRoutePredicateFactory(Class<Config> configClass) {
        super(configClass);
    }

    @Override
    public AsyncPredicate<ServerWebExchange> applyAsync(Config config) {
        return super.applyAsync(config);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return null;
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return super.shortcutFieldOrder();
    }

    @Validated
    public static class Config {
        private @NotEmpty String param;
        private String regexp;

        public Config() {
        }

        public String getParam() {
            return this.param;
        }

        public VipRoutePredicateFactory.Config setParam(String param) {
            this.param = param;
            return this;
        }

        public String getRegexp() {
            return this.regexp;
        }

        public VipRoutePredicateFactory.Config setRegexp(String regexp) {
            this.regexp = regexp;
            return this;
        }
    }
}
