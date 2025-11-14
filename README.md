# Getting Started


Run remote config Server
```shell
./gradlew :server:bootRun
```

Run Spring Boot Application
```shell
./gradlew :client:bootRun
```

Call endpoint
```shell
curl localhost:8080/local
```

Expected response value: "local"

Actual response value: "default"
