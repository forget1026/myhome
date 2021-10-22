package com.example.thymeleafprac.controller;

import com.example.thymeleafprac.model.Board;
import com.example.thymeleafprac.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> boardList = boardRepository.findAll();
        model.addAttribute("boards", boardList);
        return "board/list";
    }
}
