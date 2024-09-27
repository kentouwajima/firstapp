package in.techcamp.firstapp;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PostRepository {
  @Select("select * from posts")
  List<PostEntity> findAll();

  @Insert("insert into posts (memo) values (#{memo})")
  void insert(String memo);

}
