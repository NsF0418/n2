package com.ujiuye.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jackson  {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User(1001,"zhubajie","worinima","齐天大圣","11111","2000-01-01");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        System.out.println(s);
    }
}
