package com.example.demo.service.serviceImpl;

import com.example.demo.model.BucketFolder;

import java.util.List;

public interface BucketFolderService {

    List<BucketFolder> getAllFromBucketFolder();
    void sageBucketFolder(BucketFolder bucketFolder);
    BucketFolder getBucketFolderById(Long id);
}
