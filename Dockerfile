#Build con Gradle
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon

#Ejecucion con OpenJDK
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

# Comando de ejecucion
ENTRYPOINT ["java", "-jar", "app.jar"]
