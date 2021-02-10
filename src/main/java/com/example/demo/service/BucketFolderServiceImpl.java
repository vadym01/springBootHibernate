package com.example.demo.service;

import com.example.demo.model.BucketFolder;
import com.example.demo.repository.BucketFolderRepository;
import com.example.demo.service.serviceImpl.BucketFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketFolderServiceImpl implements BucketFolderService {

    @Autowired
    BucketFolderRepository bucketFolderRepository;


    @Override
    public List<BucketFolder> getAllFromBucketFolder() {
        List<BucketFolder> allFromBucketFolder = bucketFolderRepository.getAll();
        return allFromBucketFolder;
    }

    @Override
    public void sageBucketFolder(BucketFolder bucketFolder) {
        bucketFolderRepository.save(bucketFolder);
    }

    @Override
    public BucketFolder getBucketFolderById(Long id) {
        BucketFolder getBucketFolderById = bucketFolderRepository.getOneById(id);
        return getBucketFolderById;
    }
}
