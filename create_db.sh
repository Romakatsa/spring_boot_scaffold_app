#!/usr/bin/env bash

echo "
create database spring_boot_scaffold_app CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
grant all privileges on spring_boot_scaffold_app.* to 'spring_boot_scaffold_app'@'%' identified by 'spring_boot_scaffold_app';
flush privileges;
" | mysql -uroot -p
