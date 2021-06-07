package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.pojo.Books;
import com.example.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    // controller调service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    // 查询全部到书籍,并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    // 跳转增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    // 添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        int ret = bookService.addBook(books);
        if (ret > 0) {
            System.out.println("新增Book成功");
        } else {
            System.err.println("新增Book失败");
        }
        return "redirect:/book/allBook";// 重定向
    }

    // 跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id, Model model) {
        Books record = bookService.queryBookById(id);
        model.addAttribute("record", record);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook=>" + books);
        int ret = bookService.updateBook(books);
        if (ret > 0) {
            System.out.println("添加Book成功");
        } else {
            System.err.println("添加Book失败");
        }
        return "redirect:/book/allBook";// 重定向
    }

    // 删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {
        int ret = bookService.deleteBookById(id);
        if (ret > 0) {
            System.out.println("删除Book成功");
        } else {
            System.err.println("删除Book失败");
        }
        return "redirect:/book/allBook";// 重定向
    }

    // 查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        List<Books> list = new ArrayList<Books>();
        Books record = bookService.queryBookByName(queryBookName);
        if (record == null) {
            model.addAttribute("error", "未查到书籍"+"《"+queryBookName+"》");
            list = bookService.queryAllBook();
        } else {
            System.out.println("queryBook=>" + record);
            list.add(record);
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}
