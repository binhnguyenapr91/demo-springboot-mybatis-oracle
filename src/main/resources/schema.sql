create table USER
(
    id int generated as identity,
    name varchar(256)
)
/

create unique index USER_ID_UINDEX
    on USER (id)
/

alter table USER
    add constraint TEST_PK
        primary key (id)
/