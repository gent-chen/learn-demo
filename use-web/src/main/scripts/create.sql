CREATE TABLE muti_key
(
  id      INT(32) DEFAULT '0'    NOT NULL,
  name    VARCHAR(50) DEFAULT '' NOT NULL,
  id_card INT(32) DEFAULT '0'    NOT NULL,
  remark  VARCHAR(50)            NULL,
  PRIMARY KEY (id, name, id_card)
)
  ENGINE = InnoDB
  CHARSET = utf8;