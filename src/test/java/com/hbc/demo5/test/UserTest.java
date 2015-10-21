//package com.hbc.demo5.test;
//
//
//
//
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.hbc.demo5.mapper.UserMapper;
//import com.hbc.demo5.model.User;
//
//public class UserTest {
//
//	
//	private UserMapper userMapper;
//    
//	@SuppressWarnings("resource")
//    private ClassPathXmlApplicationContext context;
//    @Before
//    public void before(){                                                                   
//    	System.out.println("classpath");
//    	
//    	context = new ClassPathXmlApplicationContext(new String[]{"conf/spring-mvc.xml"
//                ,"conf/spring-mysql.xml"});
//    	System.out.println("test");        
//        userMapper =(UserMapper)context.getBean("userServiceImpl");
//        System.out.println("test2");
//        
//    }
//    
//    @After
//    public void after(){
//    	context.close();
//    	System.out.println("END");
//    }
//    
//
//    @Test
//    public void addUser() throws Exception{
//    	System.out.println(111); 
//        User user = new User();
//        user.setNickname("ÄãºÃ");
//        user.setState(2);
//        System.out.println(userMapper.insertUser(user));
//        System.out.println(user.getId()); 
//        
//        
//        User user2=  userMapper.selectUser(12);
//        System.out.println(user2.getNickname()); 
//        
//        System.out.println(111); 
//    }
//}
