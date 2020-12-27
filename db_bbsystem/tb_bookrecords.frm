TYPE=VIEW
query=select `db_bbsystem`.`tb_book`.`title` AS `title`,`db_bbsystem`.`tb_book`.`edition` AS `edition`,`db_bbsystem`.`tb_book`.`isbn` AS `isbn`,`db_bbsystem`.`tb_book`.`material_type` AS `material_type`,`db_bbsystem`.`tb_book`.`copyright` AS `copyright`,`db_bbsystem`.`tb_book`.`place_publisher` AS `place_publisher`,`db_bbsystem`.`tb_book`.`pages` AS `pages`,`db_bbsystem`.`tb_book`.`price` AS `price`,`db_bbsystem`.`tb_book`.`images` AS `images`,`db_bbsystem`.`tb_book`.`author` AS `author`,`db_bbsystem`.`tb_bookcopy`.`accession_no` AS `accession_no`,`db_bbsystem`.`tb_bookcopy`.`book_id` AS `book_id`,`db_bbsystem`.`tb_bookcopy`.`call_no` AS `call_no`,`db_bbsystem`.`tb_bookcopy`.`copy_number` AS `copy_number`,`db_bbsystem`.`tb_bookcopy`.`location` AS `location`,`db_bbsystem`.`tb_bookcopy`.`funding_source` AS `funding_source`,`db_bbsystem`.`tb_bookcopy`.`status` AS `status` from `db_bbsystem`.`tb_book` join `db_bbsystem`.`tb_bookcopy` where (`db_bbsystem`.`tb_book`.`book_id` = `db_bbsystem`.`tb_bookcopy`.`book_id`)
md5=a3a9cf182e65e9319a51138c92f984a7
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
revision=1
timestamp=2020-12-25 22:17:37
create-version=1
source=SELECT \n  `tb_book`.`title`,\n  `tb_book`.`edition`,\n  `tb_book`.`isbn`,\n  `tb_book`.`material_type`,\n  `tb_book`.`copyright`,\n  `tb_book`.`place_publisher`,\n  `tb_book`.`pages`,\n  `tb_book`.`price`,\n  `tb_book`.`images`,\n  `tb_book`.`author`,\n  `tb_bookcopy`.`accession_no`,\n  `tb_bookcopy`.`book_id`,\n  `tb_bookcopy`.`call_no`,\n  `tb_bookcopy`.`copy_number`,\n  `tb_bookcopy`.`location`,\n  `tb_bookcopy`.`funding_source`,\n  `tb_bookcopy`.`status`\nFROM\n  `tb_book`,\n  `tb_bookcopy`\nWHERE\n  `tb_book`.`book_id` = `tb_bookcopy`.`book_id`
