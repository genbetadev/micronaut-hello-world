package example

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.Client

@Client('/hello')
interface HelloClient {

    @Get("/{name}")
    String hello(String name)

//    @Get("/{name}")
//    Single<String> hello(String name)
}