package com.ferhad.accountservice.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * Account login, registration, logout starts here...
 * After registration, login;
 * Generated Token will be sent to auth service (which it stores it in Redis)
 *
 * So only /login, /register will happen here
 *
 * In Registration, Message about User will be written into kafka topic
 * In terms of Kafka,
 * Producer is account-service
 * Consumer is report-service
 *
 * Message will be:
 * User login, logout time, registration time
 *
 * And only authenticated user can access this resource
 */
@RestController
public class AccountController {

}
