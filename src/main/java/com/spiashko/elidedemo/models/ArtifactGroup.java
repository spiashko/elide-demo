package com.spiashko.elidedemo.models;

import com.yahoo.elide.annotation.Include;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Include(rootLevel = true, type = "group")
@Entity
public class ArtifactGroup {
    @Id
    private String name = "";

    private String commonName = "";

    private String description = "";

    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    private List<ArtifactProduct> products = new ArrayList<>();
}
