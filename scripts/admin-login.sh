#!/usr/bin/env bash

curl -d '{"username":"admin","password":"pass"}' -H 'Content-Type: application/json' --verbose http://localhost:8088/auth/login
