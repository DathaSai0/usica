package com.usica.usica.config;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TagPrefix {
    public static final Map<String, String> PREFIX_MAP = Map.of(
            "user", "USR-",
            "employee", "EMP=",
            "client", "CLD-"
    );

    public String getPrefix(String type){
        return PREFIX_MAP.getOrDefault(type , "GEN");
    }

}
