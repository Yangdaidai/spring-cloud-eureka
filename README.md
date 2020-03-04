**spring-cloud-eureka**
* spring-cloud-eureka demo
* eureka服务注册中心 提供服务注册和发现
* Eureka通过互相注册的方式来实现高可用的部署，所以我们只需要将Eureka Server配置其他可用的serviceUrl就能实现高可用部署。

##模拟注册中心集群: 
   - 分别以peer1、peer2、peer3的配置参数启动eureka注册中心。
     -  java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
     -  java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
     -  java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer3