package com.codeclan.example.filemanagement;

import com.codeclan.example.filemanagement.Repositories.FileRepository;
import com.codeclan.example.filemanagement.Repositories.FolderRepository;
import com.codeclan.example.filemanagement.Repositories.PersonRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.example.filemanagement.Models.Folder;
import com.codeclan.example.filemanagement.Models.File;
import com.codeclan.example.filemanagement.Models.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemanagementApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFolderandFile(){
		Person person = new Person("Steve");
		personRepository.save(person);
		Folder folder = new Folder("Important Stuff",person);
		folderRepository.save(folder);

		File file1 = new File("SpongeBob", "ext", 32, folder);
		fileRepository.save(file1);
	}

//	@Test
//	public void addFilesAndRaids(){
//		Folder folder = new Folder("The Flying Dutchman");
//		folderRepository.save(folder);
//
//		File file1 = new File("Jack", "Sparrow", 32, folder);
//		fileRepository.save(file1);
//
//		Raid raid1 = new Raid("Tortuga", 100);
//		raidRepository.save(raid1);
//
//		raid1.addFile(file1);
//		raidRepository.save(raid1);
//
//	}

}
