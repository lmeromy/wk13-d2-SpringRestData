package com.codeclan.filesystem.projections;

import com.codeclan.filesystem.models.File;
import com.codeclan.filesystem.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolderInFile", types = File.class)
public interface EmbedFolderInFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
