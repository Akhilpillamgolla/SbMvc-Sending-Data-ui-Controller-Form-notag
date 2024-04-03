package com.SpringMvc.binding;

import lombok.Data;


@Data                  // LOMBOK REPLACEMENT of  getter & setter
public class Book {
	
	private String bookName;
	private String authorName;
	private String bookPrice;

}
