#!/bin/sh
rm -rf /tmp/kafka-logs /tmp/zookeeper
echo 'starting zookeper'
source $KAFKA_HOME/bin/zookeeper-server-start.sh $KAFKA_HOME/config/zookeeper.properties &
echo 'started zookeper'
echo 'starting Kafka broker'
source $KAFKA_HOME/bin/kafka-server-start.sh $KAFKA_HOME/config/server.properties &
echo 'started Kafka broker'
