# ms-quarkus-kafka-streams-monitor-prevention

Monitoreo de Prevención de Fraude utilizando Kafka Streams y Quarkus.

If you want to learn more about Quarkus, please visit its website: [ms-quarkus-kafka-streams-monitor-prevention](https://github.com/ZOMELI/ms-quarkus-kafka-streams-monitor-prevention)

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/ms-quarkus-kafka-streams-monitor-prevention-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

### Provided Example Input Message to Kafka
```json
{
  "aws_request_id": "b92a3869-fee6-42ba-9b92-b61365ec5b7c",
  "processing_type": "ONLINE",
  "resource_name": "qa03-DemandDepositsCreditNotesPSTByIdentifier",
  "resource_version": "26",
  "module": "DemandDeposits",
  "successful": true,
  "process_date": "2022-04-08 00:00:00",
  "authentication": {
    "login": "aplach",
    "subsidiary_code": "1",
    "branch_code": "101",
    "role_code": "99",
    "channel_code": "",
    "terminal": "term1",
    "session_id": "2d032cd6-1033-47ad-ab91-b0c8484bf16e"
  },
  "header": {
    "aws_request_id": "84257ef2-7046-45eb-b2d5-dfdc97018528",
    "x_request_id": "bb299583-9daf-4b5a-9503-bbade259ec69",
    "x_end_user_login": "USERACH",
    "x_end_user_request_date_time": "2019-10-11T23:00:27Z",
    "x_end_user_terminal": "terminaldemo",
    "x_end_user_last_logged_date_time": "",
    "x_authorization": "******1BHeHg",
    "x_financial_id": "",
    "x_reverse": "false",
    "x_requestId_to_reverse": "",
    "x_channel": "9",
    "accept_Language": "ES-EC"
  },
  "status_code": "201",
  "transaction_code": "4600",
  "ssn": "2612616",
  "transaction_name": "CREDIT NOTE POST BY ACCOUNT ID AUTHORIZATION",
  "execution_type": "NORMAL",
  "additional_data": {
    "businessEvent": {
      "id": "DDA.TransactionAccount-CreditNotes.Created",
      "type": "notification",
      "correlationId": "bb299583-9daf-4b5a-9503-bbade259ec69",
      "data": {
        "transactionAccount": [
          {
            "code": 16195,
            "postingDate": "2022-04-08",
            "originalTransaction": 4600,
            "subsidiary": {
              "code": 1
            },
            "branch": {
              "code": 101
            },
            "transactionUser": {
              "code": 3481,
              "user": "aplach"
            },
            "terminal": "term1",
            "operation": "C",
            "totalAmount": "500.00",
            "currency": {
              "code": 0
            },
            "nature": {
              "code": "140",
              "description": "CODE 140"
            },
            "accountingBalance": "511.66",
            "availableBalance": "511.66",
            "account": {
              "number": "3080001290",
              "product": {
                "code": 3
              },
              "originationDate": "2022-04-08",
              "customer": {
                "code": 1,
                "names": "FABRICIO JAVIER VELA OÑATE",
                "category": {
                  "description": "STA"
                }
              },
              "availableBalance": "1011.66",
              "accountSubtype": {
                "code": 8
              }
            },
            "concept": "NC 215 TOWER BANK-44379-JUAN PEREZ",
            "transactionTime": "2023-07-04T10:42:59Z",
            "channel": {
              "code": "9"
            },
            "transaction": 253,
            "sourceFile": "COREB",
            "voucherId": "bb299583-9daf-4b5a-9503-bbade259ec69"
          }
        ]
      }
    }
  }
}
```

### Provided Example Output Message to Kafka

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
