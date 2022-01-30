#!/usr/bin/env bash

curl -d '{"username":"some_user","password":"pass"}' \
    -H 'Content-Type: application/json' \
    -H 'auth: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjpbIlJPTEVfQURNSU4iXSwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo5MTkxL2F1dGgvbG9naW4iLCJleHAiOjE2NDM1NTEwODl9.VpxQWn6ixqhWBl66uBLJMBvsRz5jrEr5KPHDok7AXBM' \
    --verbose http://localhost:8088/auth/user

# For now, auth is used instead of Authorization
# Because somehow, Authorization header not sent to server, which I couldn't solve reason
