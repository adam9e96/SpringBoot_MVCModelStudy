package com.adam9e96.MVCModelStudy.controller;


import com.adam9e96.MVCModelStudy.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * HelloModelController는 "hello" 경로에 대한 요청을 처리하는 컨트롤러입니다.
 * 주로 모델(Model)을 사용하여 데이터를 뷰에 전달하는 역할을 합니다.
 * <p>
 * 이 컨트롤러는 타임리프(Thymeleaf) 뷰 엔진을 사용하여 데이터를 뷰에 렌더링합니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0.0
 */
@Controller
@RequestMapping("hello")
public class HelloModelController {

    /**
     * "hello/model" 경로로 들어오는 GET 요청을 처리합니다.
     * <p>
     * 이 메서드는 Model 객체에 데이터를 추가하고, 해당 데이터를 사용하여
     * 타임리프 템플릿을 렌더링합니다.
     * </p>
     *
     * @param model 데이터를 뷰로 전달하기 위해 사용되는 Model 객체
     * @return 렌더링할 타임리프 뷰의 이름
     * <url>
     * http://localhost:8080/hello/model
     * </url>
     */
    @GetMapping("model")
    public String helloView(Model model) {
        // Model에 데이터를 저장
        List<String> nameList = new ArrayList<>();
        nameList.add("조강현");
        nameList.add("스틸로");
        nameList.add("도란");
        Member member = new Member(5, "멤버객체1");


        model.addAttribute("nameList", nameList);
        model.addAttribute("msg", "타임리프!!!");
        model.addAttribute("name", "adam");
        model.addAttribute("member", member);

        return "helloThymeleaf";


    }
}
