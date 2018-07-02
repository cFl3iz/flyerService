package com.banff.controller;

import com.banff.bean.Book;
import com.banff.mongo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/book")
    public String book(Model model){
        List<Book> books = bookRepository.findAll(Sort.by(Sort.Direction.DESC, "updateTime"));
        model.addAttribute("books", books);
        return "book";
    }

}
