package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
public class BookService {

    @Autowired  // interface 일 경우 구현체를 자동으로 지정해서 DI 설정
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBook(){
        return bookDAO.selectBookList();
    }

    public BookDTO selecOneBook(int seq){
        return bookDAO.selectOneBook(seq);
    }


}
