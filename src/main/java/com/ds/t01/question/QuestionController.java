package com.ds.t01.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class QuestionController {
	
	private final QuestionService questionService;
	
	@GetMapping("question/list")
	public String list(Model model) {
		List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
		return "qlist";
	}
	
}
