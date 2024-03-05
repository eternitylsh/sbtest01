package com.ds.t01.question;

import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ds.t01.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:8090")
public class QuestionController {
	
	private final QuestionService questionService;
	
	@GetMapping("question/list")
	public List<Question> list() {
		return this.questionService.getList();
	}
	
	@GetMapping("/question/{id}")
	public Question detail(@PathVariable("id") Integer id) {
        return this.questionService.getQuestion(id);
    }

//    @PostMapping("/board")
//    public BoardEntity create(@RequestBody BoardDto boardDto) {
//        return boardService.create(boardDto);
//    }
//
//    @PatchMapping("/board")
//    public BoardEntity update(@RequestBody BoardDto boardDto) {
//        return boardService.update(boardDto);
//    }
//
//    @DeleteMapping("/board/{id}")
//    public void delete(@PathVariable Long id) {
//        boardService.delete(id);
//    }
}
