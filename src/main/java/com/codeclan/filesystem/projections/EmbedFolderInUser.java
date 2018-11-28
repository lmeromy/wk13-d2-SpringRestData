package com.codeclan.filesystem.projections;

import com.codeclan.filesystem.models.Folder;
import com.codeclan.filesystem.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolderInUser", types = User.class)
public interface EmbedFolderInUser {

    String getName();
    List<Folder> getFolders();
}
