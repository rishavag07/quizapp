package com.incture.QuizApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/q")
public class QuestionController {
    @GetMapping ("/a")
    public String getAllQuestion(){
        return "HI,these are your question";
    }

}
