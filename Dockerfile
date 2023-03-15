FROM openjdk:8
WORKDIR /usr/local
ADD ./target/jvmdebugdemo*.jar /app/jvmdebugdemo.jar
CMD ["java", "-Xmx1024m", "-XX:-UseGCOverheadLimit", "-jar", "/app/jvmdebugdemo.jar"]

EXPOSE 8081
