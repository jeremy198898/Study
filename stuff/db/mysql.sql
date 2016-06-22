--Mysql

--- table t_department

CREATE TABLE t_department
(
  id									BIGINT UNIQUE DEFAULT NEXTVAL('seq_users') NOT NULL ,

  orgid								INTEGER NOT NULL DEFAULT 0,															-- 组织ID

  username            VARCHAR(100) NOT NULL,                                  -- 用户名
  nickname            VARCHAR(100) DEFAULT '',                                -- 昵称
  password            VARCHAR(50) DEFAULT '',                                 -- 密码

  del									BOOLEAN NOT NULL DEFAULT false ,
  time								TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP , 		  -- 订单生成时间
  PRIMARY KEY (id)
);