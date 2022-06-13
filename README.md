GraalVMでコンパイルはコンテナ上ではできた。

```sh
docker run -it --rm \
--mount type=bind,source="$(pwd)"/,target=/app \
ghcr.io/graalvm/graalvm-ce:ol8-java17-22.1.0 bash
```