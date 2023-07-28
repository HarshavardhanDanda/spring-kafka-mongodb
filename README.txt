KAFKA START SERVICES:

1. To start ZOO keeper for kafka:
  --> go into kafka folder in terminal
  --> run `bin/zookeeper-server-start.sh config/zookeeper.properties`
2. To start broker service for kafka:
  --> go into kafka folder in terminal
  --> run `bin/kafka-server-start.sh config/server.properties`
3. To see consumed messages in terminal:
  --> go into kafka folder in terminal
  --> run `bin/kafka-console-consumer.sh --topic kafkatopic_json --from-beginning --bootstrap-server localhost:9092`
  --> replace kafkatopic_json with your topic name


MONGODB QUERY REFERENCE:

1. update query:
  db.student.update(
    {
        "name": "peter"
    },
    {
        $set: {
            "mail": "peter123@gmail.com"
        }
    }
)

2. update many query:(this updates all the results)
  db.student.updateMany(
    {
        "name": "peter"
    },
    {
        $set: {
            "mail": "peter123@gmail.com"
        }
    }
)

3. to remove/delete document in mongodb( it will remove multiple documents)
  db.student.remove(
    {
        "name": "harsha"
    }
)

4. get query for mongodb documents:
  db.student.find(
    {
        "name": "harsha"
    }
)
  db.student.find(
    {
    $and: [....]
    }
)

5. to find/get sub-documents:
  {
    "department.department_name" : "computer science"
  }

6. like query:
  {
    "mail": /gmail/  **gets all the emails which have gmail in it**
  }

7. starts with query:
  {
    "name": /^John/
  }

MONGODB SERVICE COMMANDS:
1. To Start mongo service on device, run:
  `sudo service mongod start`  ** similarly for stop and restart**
2. If you face any issue(if the start command fails):
   `sudo rm -rf /tmp/mongodb-27017.sock`  try this and start again

INFORMATION REGARDING FOLDERS IN THIS REPO:
1. kafka-mongodb: This is a project which uses kafka, springboot and mongodb, basically
   we post data into kafka producer and then we consume it and post it into mongodb.

2. kafka: This is the standard folder for kafka, if we want to start zookeeper service and broker and
   consumer etc, we should go into this folder and use the commands.

3. mongospringboot: This is a springboot project which used mongo repository and it contains
   all CRUD operations for mongodb.

4. springboot-kafka-realworld project: This is kafka-springboot project where we publish data 
   using wikimedia data and then we save into mysql database.

5. springboot-kafka: This project contains, how to produce and consume messages(string and json type)
   using spring boot.