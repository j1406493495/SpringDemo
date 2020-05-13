package cn.woong.springDemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import cn.woong.springDemo.beans.Book;

/**
 * @author Woong on 2020/5/13
 * @website http://woong.cn
 * 定义仓库接口, Book 对象持久化到数据库的仓库
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
