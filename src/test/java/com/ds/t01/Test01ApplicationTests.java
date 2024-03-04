package com.ds.t01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ds.t01.answer.Answer;
import com.ds.t01.answer.AnswerRepository;
import com.ds.t01.question.Question;
import com.ds.t01.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class Test01ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
    private AnswerRepository answerRepository;
	
	@Test
	void contextLoads() {
	}
	
	// 생성
//	@Test
//	void testJpa() {
//		Question q1 = new Question();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);  // 첫번째 질문 저장
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);  // 두번째 질문 저장
//	}
	
	// 조회
	@Test
	void testJpa2() {
		// SELECT * FROM QUESTION
		List<Question> all = this.questionRepository.findAll();
        assertEquals(1, all.size());

//        Question q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
        
//        Optional<Question> oq = this.questionRepository.findById(27);
//        if(oq.isPresent()) {
//            q = oq.get();
//            assertEquals("sbb가 무엇인가요?", q.getSubject());
//        }
        
//        q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(23, q.getId()); // 테스트 할때마다 id 바꿔줘야함..
        
//        q = this.questionRepository.findBySubjectAndContent(
//                "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
        // assertEquals(23, q.getId());
        
//        Optional<Question> oq = this.questionRepository.findById(29);
//        q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);
        
//        Optional<Question> oq = this.questionRepository.findById(30);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());
	}

	@Transactional
	@Test
	void TestJPA03() {
		Optional<Question> oq = this.questionRepository.findById(30);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        
//        long count = this.answerRepository.count();
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q); // 답변에 따른 질문 id 
//        a.setCreateDate(LocalDateTime.now()); // 실행 날짜..
//        this.answerRepository.save(a);
//        count++;
//        assertEquals(count, this.answerRepository.count());
        
        List<Answer> answerList = q.getAnswerList();
        
        System.out.println( answerList.size() );

        assertEquals(2, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}
	
}
