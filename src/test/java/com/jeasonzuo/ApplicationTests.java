package com.jeasonzuo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeasonzuo.dao.BookDao;
import com.jeasonzuo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private BookDao bookDao;

	@Test
	void selectByIdTest() {
		System.out.println(bookDao.selectById(1));
	}

	@Test
	void saveTest() {
		Book b = new Book();
		b.setName("哈哈书");
		b.setNumber(999);
		bookDao.insert(b);
	}

	@Test
	void updateByIdTest() {
		Book b = new Book();
		b.setId(10);
		b.setName("哈哈书");
		b.setNumber(998);
		bookDao.updateById(b);
	}

	@Test
	void deleteByIdTest() {
		Book b = new Book();
		b.setId(10);
		bookDao.deleteById(b);
	}

	//分页查询
	@Test
	void getPageTest() {
		IPage ipage = new Page(1,5);
		System.out.println(bookDao.selectPage(ipage, null));
	}

	//按条件查询



}
