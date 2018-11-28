package com.codeclan.filesystem.repositories;

import com.codeclan.filesystem.models.Folder;
import com.codeclan.filesystem.projections.EmbedUserInFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUserInFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
