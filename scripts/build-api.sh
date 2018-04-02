#!/bin/bash
set -ev
cd cmi-api;
./gradlew clean build -x generateCmiJooqSchemaSource