package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "bucket_folder")
public class BucketFolder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "folder_name")
    private String folderName;
    @Column(name="description")
    private String description;
    @Column(name="image_for_folder")
    private String imageForFolder;
    @Column(name = "image_file_name")
    private String imageFileName;

    public BucketFolder(String folderName, String description, String imageForFolder, String imageFileName) {
        this.folderName = folderName;
        this.description = description;
        this.imageForFolder = imageForFolder;
        this.imageFileName = imageFileName;
    }

    public BucketFolder(Long id, String folderName, String description, String imageForFolder, String imageFileName) {
        this.id = id;
        this.folderName = folderName;
        this.description = description;
        this.imageForFolder = imageForFolder;
        this.imageFileName = imageFileName;
    }

    public BucketFolder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageForFolder() {
        return imageForFolder;
    }

    public void setImageForFolder(String imageForFolder) {
        this.imageForFolder = imageForFolder;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    @Override
    public String toString() {
        return "BucketFolder{" +
                "id=" + id +
                ", folderName='" + folderName + '\'' +
                ", description='" + description + '\'' +
                ", imageForFolder='" + imageForFolder + '\'' +
                ", imageFileName='" + imageFileName + '\'' +
                '}';
    }
}
