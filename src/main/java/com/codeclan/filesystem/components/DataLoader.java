package com.codeclan.filesystem.components;

import com.codeclan.filesystem.models.File;
import com.codeclan.filesystem.models.Folder;
import com.codeclan.filesystem.models.User;
import com.codeclan.filesystem.repositories.FileRepository;
import com.codeclan.filesystem.repositories.FolderRepository;
import com.codeclan.filesystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepo;

    @Autowired
    FolderRepository folderRepo;

    @Autowired
    FileRepository fileRepo;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User leah = new User("Leah");
        userRepo.save(leah);

        Folder folder1 = new Folder("Documents", leah);
        folderRepo.save(folder1);

        Folder folder2 = new Folder("Budget", leah);
        folderRepo.save(folder2);

        File file1 = new File("recipes", "txt", 100, folder1);
        fileRepo.save(file1);

        File file2 = new File("DecemberBudget", "txt", 500, folder2);
        fileRepo.save(file2);

        File file3 = new File("AnnualBudget", "txt", 900, folder2);
        fileRepo.save(file3);
    }
}
