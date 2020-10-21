java -Xms${JVM_XMS} -Xmx${JVM_XMX} -noverify -XX:TieredStopAtLevel=1 -Dspring.profiles.active=${SPRING_PROFILE} -Dlogging.level.=${SPRING_LOGGING_LEVEL} -jar /application.jar --server.port=${PORT}
