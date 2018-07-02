package com.banff.mongo.repository;

import com.banff.mongo.model.UserBean;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserBean, String> {

    UserBean findByUsername(String username);

    List<UserBean> findTop10ByUsernameLikeOrNicknameLike(String username, String nickname);

}
