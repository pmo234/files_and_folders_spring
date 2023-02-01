package com.codeclan.example.filemanagement.Repositories;

import com.codeclan.example.filemanagement.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
