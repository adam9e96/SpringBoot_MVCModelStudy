package com.adam9e96.MVCModelStudy.controller;

import com.adam9e96.MVCModelStudy.entity.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloModelControllerTest {

    private HelloModelController helloModelController;
    private Model model;

    @BeforeEach
    void setUp() {
        helloModelController = new HelloModelController();
        model = new BindingAwareModelMap();
    }

    @Test
    void helloViewAddsAttributesToModel() {
        String viewName = helloModelController.helloView(model);

        assertThat(viewName).isEqualTo("helloThymeleaf");
        assertThat(model.getAttribute("nameList")).isInstanceOf(List.class);
        assertThat((List<String>) model.getAttribute("nameList")).containsExactly("조강현", "스틸로", "도란");
        assertThat(model.getAttribute("msg")).isEqualTo("타임리프!!!");
        assertThat(model.getAttribute("name")).isEqualTo("adam");
        assertThat(model.getAttribute("member")).isInstanceOf(Member.class);
        assertThat(((Member) model.getAttribute("member")).getId()).isEqualTo(5);
        assertThat(((Member) model.getAttribute("member")).getName()).isEqualTo("멤버객체1");
    }

    @Test
    void helloViewWithEmptyModel() {
        model = new BindingAwareModelMap();
        String viewName = helloModelController.helloView(model);

        assertThat(viewName).isEqualTo("helloThymeleaf");
        assertThat(model.getAttribute("nameList")).isNotNull();
        assertThat(model.getAttribute("msg")).isNotNull();
        assertThat(model.getAttribute("name")).isNotNull();
        assertThat(model.getAttribute("member")).isNotNull();
    }
}
