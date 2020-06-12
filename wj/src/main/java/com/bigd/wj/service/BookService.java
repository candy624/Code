package com.bigd.wj.service;

import com.bigd.wj.dao.BookDAO;
import com.bigd.wj.pojo.Book;
import com.bigd.wj.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;
    @Autowired
    private CategoryService categoryService;

    public List<Book> list(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return bookDAO.findAll(sort);
    }

    public void addOrUpdate(Book book){
        bookDAO.save(book);
    }

    public void deleteById(int id){
        bookDAO.deleteById(id);
    }

    public List<Book> listByCategory(int cid){
        Category category = categoryService.get(cid);
        return bookDAO.findAllByCategory(category);
    }

    public List<Book> Search(String keywords){
        return bookDAO.findByTitleLikeOrAuthorLike('%' + keywords + '%','%' + keywords + '%');
    }

}
