create table t_msg(
	id int(10) primary key auto_increment,
	title varchar(255),
	content text,
	post_data datetime,
	user_id int(10) ,
	constraint foreign key(user_id) references t_user(id)
)

create table t_commet(
	id int(10) primary key auto_increment,
	content text,
	post_date datatime,
	user_id int(10),
	msg_id int(10),
	constraint foreign key(user_id) references t_user(id),
	constraint foreign key(msg_id) references t_msg(id)
)