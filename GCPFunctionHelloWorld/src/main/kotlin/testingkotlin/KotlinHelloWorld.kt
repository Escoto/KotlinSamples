package testingkotlin

import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import java.io.IOException
import java.util.logging.Logger

public class KotlinHelloWorld : HttpFunction {
    @Throws(IOException::class)
    override fun service(request: HttpRequest, response: HttpResponse) {
        response.writer.write("Hello World!")
    }
}