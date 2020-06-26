build with SBT

``` bash
sbt assembly
```

once the jar is built, you can run it with just plain old java command (which is easier when packaged in a bash script with contents like this:)

```bash
#!/usr/bin/env bash
java -jar target/scala-2.12/dummy-service_2.12-0.1.0-SNAPSHOT-one-jar.jar $@
```

or use SBT

