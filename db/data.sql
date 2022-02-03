/*
 * Encoded version of [pass] with BCrypt Password Encoder
 * Just for testing
 * ENCODED_PASSWORD = "$2a$10$5CU./i2Ge5iZxWhZgxVsPu43vkP7hFoZfZnHJgXaQhQbrDKyf.K.a";
*/

INSERT INTO roles
VALUES (1, 'ROLE_ADMIN');

INSERT INTO roles
VALUES (2, 'ROLE_USER');


INSERT INTO account
VALUES (1, 'admin', '$2a$10$5CU./i2Ge5iZxWhZgxVsPu43vkP7hFoZfZnHJgXaQhQbrDKyf.K.a');

INSERT INTO account_role
VALUES (1, 1);
