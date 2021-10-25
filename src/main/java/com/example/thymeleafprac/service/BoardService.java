package com.example.thymeleafprac.service;

import com.example.thymeleafprac.model.Board;
import com.example.thymeleafprac.model.User;
import com.example.thymeleafprac.repository.BoardRepository;
import com.example.thymeleafprac.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, @Valid Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
