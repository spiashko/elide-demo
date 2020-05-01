/*
 * Copyright 2019, Verizon Media.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.spiashko.elidedemo.models;

import com.yahoo.elide.annotation.Include;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Include(type = "product")
@Entity
public class ArtifactProduct {
    @Id
    private String name = "";

    private String commonName = "";

    private String description = "";

    @ManyToOne(fetch = FetchType.LAZY)
    private ArtifactGroup group = null;

    @OneToMany(mappedBy = "artifact", fetch = FetchType.LAZY)
    private List<ArtifactVersion> versions = new ArrayList<>();
}
