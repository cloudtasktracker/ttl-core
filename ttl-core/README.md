# ttl-commons

Commons and utils for Task Tracker application.

## Deploying Locally

Make sure you have Java and Maven installed. This is the script to deploy the library on the api and task service module:

```
    cd ${WORKSPACE_TASK_TRACKER}/ttl-commons && mvn clean install &&
    cd ${WORKSPACE_TASK_TRACKER}/ttl-commons/target &&
    mv ttl-commons-$VERSION-jar-with-dependencies.jar ttl-commons-$VERSION.jar &&
    rm -rf ${WORKSPACE_TASK_TRACKER}/tta-api/src/main/resources/repo/* &&
    rm -rf ${WORKSPACE_TASK_TRACKER}/tts-task/src/main/resources/repo/* &&
    mvn deploy:deploy-file -Durl=file:${WORKSPACE_TASK_TRACKER}/tta-api/src/main/resources/repo/ -Dfile=ttl-commons-$VERSION.jar -DgroupId=com.tasktracker -DartifactId=ttl-commons -Dpackaging=jar -Dversion=$VERSION &&
    mvn deploy:deploy-file -Durl=file:${WORKSPACE_TASK_TRACKER}/tts-task/src/main/resources/repo/ -Dfile=ttl-commons-$VERSION.jar -DgroupId=com.tasktracker -DartifactId=ttl-commons -Dpackaging=jar -Dversion=$VERSION &&
    cd ${WORKSPACE_TASK_TRACKER}/tta-api/src/main/resources/ && git add . &&
    cd ${WORKSPACE_TASK_TRACKER}/tts-task/src/main/resources/ && git add .
```

## Deploying on Heroku

The dependency is included on the jar for the final module: api or service, so no extra effort is needed.
