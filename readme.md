### Required Tools
* Java 17
* Maven above version 3.6
* Kafka
* Postgres Database
* Postman or any API testing tool
* Intellij or any preferred IDE

### Kafka Installation
* Download the archived file from https://kafka.apache.org/downloads
* Unzip the file into your preferred location
* Set $KAFKA_HOME environment variable to installation folder
* Copy the shell scripts inside $KAFKA_HOME/bin folder
* update .bash_profile and add aliases as below

```bash
alias create-topic='sh /Users/yatin/Documents/workspace/kafka_2.13-3.1.0/bin/create-topic.sh > topic-logs.txt'
alias kafka-start='sh /Users/yatin/Documents/workspace/kafka_2.13-3.1.0/bin/kafka-start.sh > logs.txt'
```

* Now the kafka can be started using below command
```bash
kafka-start
```

* Topic can be created using
```bash
create-topic <topic name>
```

### Useful Links
* https://quarkus.io/guides/datasource
* https://www.guru99.com/download-install-postgresql.html
* https://quarkus.io/guides/getting-started-reactive
* https://www.sqlshack.com/setting-up-a-postgresql-database-on-mac/
* https://www.tutorialspoint.com/postgresql/postgresql_create_table.htm
* https://kafka.apache.org/quickstart
* https://quarkus.io/guides/kafka-reactive-getting-started