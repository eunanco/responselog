package com.allstate.xp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<OurReqParams, String>{

}
