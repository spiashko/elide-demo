#!/bin/bash

create_db_user_pass() {
    psql -Upostgres -dpostgres -c "CREATE USER $2 WITH PASSWORD '$3'"
    psql -Upostgres -dpostgres -c "CREATE DATABASE $1 OWNER=$2"
}

create_db_user_pass elide_demo_db elide_demo_user elide_demo_pass