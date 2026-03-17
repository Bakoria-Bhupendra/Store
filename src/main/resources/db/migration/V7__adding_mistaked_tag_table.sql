create table user_tag (
                          user_id bigint not null,
                          tag_id int not null,
                          primary key (user_id, tag_id),
                          foreign key (user_id) references users(id) on delete cascade,
                          foreign key (tag_id) references tag(id) on delete cascade
);