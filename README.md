# code-alticci project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package                                         
```

The application, packaged as an _code_alticci-jar, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-alticci-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

# Then, build the image with:
#
```shell script
docker build -f src/main/docker/Dockerfile.legacy-jar -t quarkus/quarkus-code-alticci-jar .
```
#
# Then run the container using:
#
```shell script
docker run -i --rm -p 8080:8080 quarkus/quarkus-code-alticci-jar
```
### Access by swagger ui
http://localhost:8080/q/swagger-ui

### Access by browser or curl
http://localhost:8080/v1/alticci/10000

Ex: 9348093064170902965919423830711056645546310450015589695113445137062714304042188401021641096916880085862353680228072
77827723134431411826756528361469053094324293207003449763706168181085935430314549128576352436030901601291712108192990167
52054210282983187571385119134266889324662942405154900484396140543917271979293981273601871610164376137166801969200573559
18908625402987640044776357837672716038708579844257122325350484831384766333422365351156291203817552625147204442668860414
48397947443348024570802104899883861056662849228527139945511514642420495455568317751233672577066231195609646535582392092
12393742779985776940847215990089219440563061157619974875522288643525834371501751605977408816178172343057654189225251782
189558582970932996304747066978954181455806612175373514285866914524501301598311231876686828835999721491447398811866129764
24398468804942907329648065046350864371326044168938537920239218712628244371447311437962352406851065059389042724996193695
20742835275047869345242022143048357017492485544202176379406264771312671673533281906780966083197039410692631491903917465
66604866131257949389151008940636049397223890876019645931450913081215795982991849497772061758150014490131788943867008075
3948890248660224527998836773426074
