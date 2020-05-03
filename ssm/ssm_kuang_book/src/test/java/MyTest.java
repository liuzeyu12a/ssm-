import com.liuzeyu.pojo.Books;
import com.liuzeyu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liuzeyu on 2020/5/1.
 */
public class MyTest {

    @Test
    public void myTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ac.getBean("bookService");
        List<Books> list = bookService.findAll();
        System.out.println(list);
    }
}
