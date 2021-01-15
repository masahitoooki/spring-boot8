package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

    //  入力画面
    @GetMapping("/input")
    public String input(@ModelAttribute("bookForm") BookForm bookForm) {
        return "input";
    }

    //  書籍情報画面
    @PostMapping("/bookinfo")
    public String toBookInfo(@ModelAttribute("bookForm") BookForm bookForm) {
        return "bookinfo";
    }

//  映画情報出力画面（追記分）
    @PostMapping("/movieinfo")
    public String toMovieinfo(@ModelAttribute("movieForm") MovieForm movieForm) {
        return "movieinfo";
    }
}
