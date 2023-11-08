package com.example.article.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EvaluationController {
    @GetMapping("/eval/list")
    public String listForm() throws Exception{
        return "evaluation/list";
    }
}
