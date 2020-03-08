package org.apache.ibatis.demo;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {

  public static void main(String[] args) throws Exception{
      String resource = "mybatis-config.xml";
      InputStream is = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
      SqlSession sqlSession = sqlSessionFactory.openSession();
      Blog blog = sqlSession.selectOne("org.mybatis.example.BlogMapper.selectBlog", 1);
      System.out.println(blog);
  }
}
