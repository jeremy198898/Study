--测试表
CREATE TABLE
IF NOT EXISTS t_users (
  id       BIGINT UNIQUE NOT NULL AUTO_INCREMENT,
  username VARCHAR(100)  NOT NULL,
  password VARCHAR(50)   NOT NULL,
  time     TIMESTAMP(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

---- 部门
CREATE TABLE
IF NOT EXISTS t_department (
  id   INT UNIQUE NOT NULL AUTO_INCREMENT,
  name VARCHAR(100)  NOT NULL,
  createtime TIMESTAMP(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

---- 职位
CREATE TABLE
IF NOT EXISTS t_position (
  id   INT UNIQUE NOT NULL AUTO_INCREMENT,
  name VARCHAR(100)  NOT NULL,
  createtime TIMESTAMP(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

-- RBAC(role based )  用户
CREATE TABLE
IF NOT EXISTS t_access_user (
  id         BIGINT UNIQUE NOT NULL AUTO_INCREMENT,
  username   VARCHAR(100)  NOT NULL,
  name       VARCHAR(100)  NOT NULL,
  sex        SMALLINT      NOT NULL,
  birthday   TIMESTAMP     NOT NULL,
  department INT           NOT NULL,
  position   INT           NOT NULL,
  email      VARCHAR(100)  NOT NULL,
  mobile     VARCHAR(13)   NOT NULL,
  phone      VARCHAR(13)   NOT NULL,
  createtime TIMESTAMP(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

CREATE TABLE
IF NOT EXISTS t_access_action (
  id   BIGINT UNIQUE NOT NULL AUTO_INCREMENT,
  name VARCHAR(100)  NOT NULL,
  time TIMESTAMP(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

CREATE TABLE
IF NOT EXISTS t_access_role (
  id   BIGINT UNIQUE NOT NULL AUTO_INCREMENT,
  name VARCHAR(100)  NOT NULL,
  time TIMESTAMP(0)  NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);