alter table addresses add state varchar (255) not null;
alter table users drop column state;