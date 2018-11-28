package com.codeclan.filesystem;

import com.codeclan.filesystem.models.File;
import com.codeclan.filesystem.models.Folder;
import com.codeclan.filesystem.models.User;
import com.codeclan.filesystem.repositories.FileRepository;
import com.codeclan.filesystem.repositories.FolderRepository;
import com.codeclan.filesystem.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesystemApplicationTests {

    @Autowired
    UserRepository userRepo;

    @Autowired
    FolderRepository folderRepo;

    @Autowired
    FileRepository fileRepo;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUserFoldersFiles(){

	    User leah = new User("Leah");
	    userRepo.save(leah);

	    Folder folder1 = new Folder("Documents", leah);
	    folderRepo.save(folder1);

	    File file1 = new File("recipes", "txt", 100, folder1);
	    fileRepo.save(file1);

    }

}
