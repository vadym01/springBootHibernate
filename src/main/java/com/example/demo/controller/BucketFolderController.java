package com.example.demo.controller;

import com.example.demo.model.BucketFolder;
import com.example.demo.service.serviceImpl.BucketFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bucket-folder")
public class BucketFolderController {

    @Autowired
    private BucketFolderService bucketFolderService;

    @GetMapping()
    public ResponseEntity<List<BucketFolder>> getAllFromBucketFolder(){
        List<BucketFolder> allFromBucketFolder = bucketFolderService.getAllFromBucketFolder();
        return new ResponseEntity<>(allFromBucketFolder, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveBucketFolder(@RequestBody BucketFolder bucketFolder){
        bucketFolderService.sageBucketFolder(bucketFolder);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("{Id}")
//    @ResponseBody
    public ResponseEntity<BucketFolder> getOneById(@PathVariable("Id") Long id){
        BucketFolder getOneById = bucketFolderService.getBucketFolderById(id);
        return new ResponseEntity<>(getOneById,HttpStatus.OK);
    }
}
