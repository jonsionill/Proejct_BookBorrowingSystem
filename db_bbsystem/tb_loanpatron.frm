TYPE=VIEW
query=select `db_bbsystem`.`tb_loan`.`loan_id` AS `loan_id`,`db_bbsystem`.`tb_loan`.`stf_id` AS `stf_id`,`db_bbsystem`.`tb_loan`.`library_id` AS `library_id`,`db_bbsystem`.`tb_loan`.`release_date` AS `release_date`,`db_bbsystem`.`tb_loan`.`release_time` AS `release_time`,`db_bbsystem`.`tb_patron`.`patron_fname` AS `patron_fname`,`db_bbsystem`.`tb_patron`.`patron_mname` AS `patron_mname`,`db_bbsystem`.`tb_patron`.`patron_lname` AS `patron_lname`,`db_bbsystem`.`tb_user`.`stf_fname` AS `stf_fname`,`db_bbsystem`.`tb_user`.`stf_mname` AS `stf_mname`,`db_bbsystem`.`tb_user`.`stf_lname` AS `stf_lname` from `db_bbsystem`.`tb_loan` join `db_bbsystem`.`tb_patron` join `db_bbsystem`.`tb_user` where ((`db_bbsystem`.`tb_loan`.`stf_id` = `db_bbsystem`.`tb_user`.`stf_id`) and (`db_bbsystem`.`tb_loan`.`library_id` = `db_bbsystem`.`tb_patron`.`library_id`))
md5=043e67f043595ab15517fb434aa28cd6
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
revision=1
timestamp=2020-12-26 17:58:40
create-version=1
source=SELECT \n  `tb_loan`.`loan_id`,\n  `tb_loan`.`stf_id`,\n  `tb_loan`.`library_id`,\n  `tb_loan`.`release_date`,\n  `tb_loan`.`release_time`,\n  `tb_patron`.`patron_fname`,\n  `tb_patron`.`patron_mname`,\n  `tb_patron`.`patron_lname`,\n  `tb_user`.`stf_fname`,\n  `tb_user`.`stf_mname`,\n  `tb_user`.`stf_lname`\nFROM\n  `tb_loan`,\n  `tb_patron`,\n  `tb_user`\nWHERE\n  `tb_loan`.`stf_id` = `tb_user`.`stf_id` AND \n  `tb_loan`.`library_id` = `tb_patron`.`library_id`
