package com.codeclan.filesystem.repositories;

import com.codeclan.filesystem.models.User;
import com.codeclan.filesystem.projections.EmbedFolderInUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolderInUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
