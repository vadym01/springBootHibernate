package com.example.demo.repository.repositoryImpl;

import com.example.demo.model.BucketFolder;
import com.example.demo.repository.BucketFolderRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class BucketFolderRepositoryImpl implements BucketFolderRepository {

    @Autowired
    private EntityManager entityManager;


    @Transactional
    @Override
    public List<BucketFolder> getAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<BucketFolder> query = session.createQuery("from BucketFolder",BucketFolder.class);
        List<BucketFolder> bucketFolderList = query.getResultList();
        return bucketFolderList;
    }

    @Transactional
    @Override
    public BucketFolder getOneById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        BucketFolder bucketFolderGetById = session.get(BucketFolder.class,id);
        return bucketFolderGetById;
    }


    //Put id in the body for update(PutMapping)
    @Transactional
    @Override
    public void save(BucketFolder bucketFolder) {
        Session session = entityManager.unwrap(Session.class);
        session.save(bucketFolder);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
    Session session = entityManager.unwrap(Session.class);
    BucketFolder bucketFolder = session.get(BucketFolder.class,id);
    session.delete(bucketFolder);
    }
}
