package com.jason.springboot.dao;
 
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
 
import com.jason.springboot.pojo.Category;
 
public interface CategoryDAO extends ElasticsearchRepository<Category,Integer>{
 
}