package cz.upce.tddc.finalproject.controller;

import cz.upce.tddc.finalproject.entity.Memo;
import cz.upce.tddc.finalproject.repository.MemosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

    @Autowired
    private MemosRepository memos;
    
    @GetMapping("/")
    public String index() {
        Memo memo = new Memo("" + memos.count());
        memos.save(memo);
        
        return "Hello World " + memos.count();
    }
}
