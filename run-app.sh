#!/bin/bash

docker-compose down
docker image rm gatewaysofhelluser_gateways-user:latest
docker-compose up