package com.codeclan.example.filemanagement.Repositories;

import com.codeclan.example.filemanagement.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
