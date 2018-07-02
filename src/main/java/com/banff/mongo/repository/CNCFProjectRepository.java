package com.banff.mongo.repository;

import com.banff.bean.CNCFProject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CNCFProjectRepository extends MongoRepository<CNCFProject, String> {

}