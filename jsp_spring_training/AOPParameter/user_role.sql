
CREATE TABLE user_role (
    user_id VARCHAR2(30) NOT NULL,
    role_nm VARCHAR2(30) NOT NULL,
    CONSTRAINT pk_user_role PRIMARY KEY (user_id, role_nm)
);

-- 모든 사용자 에게 "MEMBER" 
INSERT INTO user_role ( user_id , role_nm)
select mem_id , 'MEMBER' from member ; 




