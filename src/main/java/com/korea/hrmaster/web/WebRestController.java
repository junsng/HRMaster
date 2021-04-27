package com.korea.hrmaster.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController는 @ResponseBody를 모든 메소드에서 적용해준다.
//즉 hello 메소드의 결과는 "HelloWorld"라는 문자열을 JSON 형태로 반환하게 된다.
@RestController
public class WebRestController {

    @GetMapping("hello")
    public String hello(){
        return "HelloWorld";
    }
}
