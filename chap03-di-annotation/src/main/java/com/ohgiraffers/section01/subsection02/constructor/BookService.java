package com.ohgiraffers.section01.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    // 순환 참조의 에러를 좀 더 잘 잡아준다.(안전성 보장, 프로그램 실행시 에러 발생)
    // 필드에 autowired 시 메소드 호출시에 에러 발생

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectBookById(int seq){
        return bookDAO.selectOneBook(seq);
    }

}
