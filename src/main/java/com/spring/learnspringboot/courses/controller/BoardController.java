package com.spring.learnspringboot.courses.controller;

import com.spring.learnspringboot.courses.bean.Board;
import com.spring.learnspringboot.courses.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board")
    public String index(Model model, @RequestParam(value="page", defaultValue="0") Integer page){
        System.out.printf("테스트");

        PageRequest pageRequest = PageRequest.of(page, 10);
        Page<Board> boardList =  boardRepository.findAll(pageRequest);

        model.addAttribute("boardList",boardList);
        model.addAttribute("number", boardList.getNumber());
        model.addAttribute("totalPages", boardList.getTotalPages());
        model.addAttribute("totalElements", boardList.getTotalElements());
        model.addAttribute("size", boardList.getSize());
        model.addAttribute("data",boardList.getContent());
        return "board";
    }

    @GetMapping("/board/create")
    public String create(){
        return "create";
    }

    @PostMapping("/board")
    public String save(@ModelAttribute Board board){
        boardRepository.save(board);
        return "redirect:/board";
    }

    @GetMapping("/board/{id}")
    public String view(@PathVariable long id, Model model){
        Optional<Board> board = boardRepository.findById(id);
        if(board.isEmpty()){
            throw new RuntimeException("Board not found with id " + id);
        }
        model.addAttribute("board",board.get());
        return "view";
    }

    @GetMapping("/board/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        Optional<Board> board = boardRepository.findById(id);
        if(board.isEmpty()){
            throw new RuntimeException("Board not found with id " + id);
        }
        model.addAttribute("board",board.get());
        return "edit";
    }

    @PutMapping("/board/{id}")
    public String update(@PathVariable long id, @ModelAttribute Board board){
        boardRepository.save(board);
        return "redirect:/board/"+id;
    }

    @DeleteMapping("/board/{id}")
    public String delete(@PathVariable long id, @ModelAttribute Board board){
        boardRepository.deleteById(id);
        return "redirect:/board";
    }

}
