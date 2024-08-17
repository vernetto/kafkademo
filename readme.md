# to start kafka and zookeeper:

./kafka-server-start.sh ../config/server.properties

./zookeeper-server-start.sh ../config/zookeeper.properties

# to get a list of all topics:

./kafka-topics.sh --list --bootstrap-server localhost:9092

# to manually create events:

./kafka-console-producer.sh --topic my-topic --bootstrap-server localhost:9092

# to read events

./kafka-console-consumer.sh --topic my-topic --from-beginning --bootstrap-server localhost:9092


