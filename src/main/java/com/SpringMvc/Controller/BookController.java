package com.SpringMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringMvc.binding.Book;

@Controller
public class BookController {

	@GetMapping("LoadForm") // method is used to load the form
	public String loadForm() {

		return "index";
	}

	@PostMapping("/saveBook") // method is used to save the form
	public String handleSubmitBtn(Book bookobj, Model model) {

		model.addAttribute("book", bookobj);

		return "bookdata";
	}

}
