package cn.woong.springDemo;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.woong.springDemo.beans.Reader;

/**
 * @author Woong on 2020/5/13
 * @website http://woong.cn
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
