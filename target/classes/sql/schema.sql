CREATE database orderdb;

CREATE TABLE `order_core_product_info_tab` (
	`product_id` INT(11) NOT NULL COMMENT '产品编号',
	`product_name` VARCHAR(128) NOT NULL COMMENT '产品名称',
	`product_type` VARCHAR(32) NOT NULL COMMENT '产品类型',
	`status` INT(4) NOT NULL COMMENT '产品状态 1：有效 0：无效',
	`operater` VARCHAR(128) NOT NULL COMMENT '操作人员',
	`create_time` DATETIME NOT NULL COMMENT '创建时间',
	`update_time` DATETIME NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`product_id`),
	INDEX `create_time` (`create_time`)
)COMMENT='产品信息表' COLLATE='utf8_general_ci' ENGINE=InnoDB;
