#!/bin/bash

DYNAMODB_PATH="./dynamodb"

if [ ! -d "$DYNAMODB_PATH" ]; then
  echo -e "Unzipping DynamoDB local"
  unzip dynamodb_local_latest.zip -d $DYNAMODB_PATH
  echo -e "Done"
fi

echo "Starting DynamoDB local"
  java -Djava.library.path=$DYNAMODB_PATH/DynamoDBLocal_lib -jar $DYNAMODB_PATH/DynamoDBLocal.jar -sharedDb -inMemory &
  DYNAMODB_PID=$!
  SLEEP 2
echo -e "Done"

echo "Creating local table"
  aws dynamodb create-table --cli-input-json file://table.json --endpoint-url=http://localhost:8000
echo -e "\nDone"

echo "DynamoDB started successfully"
echo "DynamoDB table created successfully"
echo "To kill this instance of DynamoDB, just hit 'kill -9 $DYNAMODB_PID'"
