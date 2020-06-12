package com.bigd.wj.dao;

import com.bigd.wj.pojo.Book;
import com.bigd.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book,Integer> {

    List<Book> findAllByCategory(Category category);
    List<Book> findByTitleLikeOrAuthorLike(String keyword1,String keyword2);
}
