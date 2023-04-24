FROM java:8
VOLUME /Users/wangjk/work/temp
ADD target/*.jar eureka-server.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","/eureka-server.jar"]