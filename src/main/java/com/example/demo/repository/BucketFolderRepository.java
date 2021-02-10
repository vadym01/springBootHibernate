package com.example.demo.repository;

import com.example.demo.model.BucketFolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BucketFolderRepository {

    List<BucketFolder> getAll();
    BucketFolder getOneById(Long id);
    void save(BucketFolder bucketFolder);
    void deleteById(Long id);

}
