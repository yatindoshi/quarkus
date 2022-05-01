#!/bin/sh
echo 'Creating topic'
source $KAFKA_HOME/bin/kafka-topics.sh --create --topic $1 --bootstrap-server localhost:9092
echo '$0 topic created'