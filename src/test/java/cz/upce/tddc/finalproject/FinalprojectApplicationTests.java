package cz.upce.tddc.finalproject;

import cz.upce.tddc.finalproject.entity.Memo;
import cz.upce.tddc.finalproject.repository.MemosRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class FinalprojectApplicationTests {

        @Autowired
        private MemosRepository memos;
    
	@Test
	void testThatDbIsWorking() {
            memos.deleteAll();
            
            Memo memo = new Memo("Hello world");
            memos.save(memo);
            
            Memo actual = memos.findAll().iterator().next();
            Assertions.assertEquals("Hello world", actual.getMemo());
            System.out.println("From TEST: " + actual.getMemo());
	}

}
