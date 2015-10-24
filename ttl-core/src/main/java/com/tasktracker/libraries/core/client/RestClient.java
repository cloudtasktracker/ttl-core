package com.tasktracker.libraries.core.client;

import com.tasktracker.libraries.core.exception.FileManipulationException;
import com.tasktracker.libraries.core.logging.LoggingCodes;
import com.tasktracker.libraries.core.logging.OperationLogger;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;

import com.tasktracker.libraries.core.utils.FileUtils;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * Created by joan on 5/7/15.
 */
public class RestClient {
    final private CloseableHttpClient httpClient;
    private String response = "Undefined";
    
    public RestClient(){
        this.httpClient = HttpClientBuilder.create().build();
    }

    public String doGet(String uri){
        try {
            HttpResponse httpResponse = httpClient.execute(new HttpGet(uri));
            response = FileUtils.streamToString(httpResponse.getEntity().getContent());
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_GET.getCode().replace("%1", uri).replace("%2",httpResponse.getStatusLine().toString()),false);
            operationLogger.operationFinished();
        } catch (IOException | FileManipulationException e) {
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_GET_EXCEPTION.getCode().replace("%1", e.getMessage()),true);
            operationLogger.operationFinished();
        }
        return response;
    }

    public String doPost(String uri){
        try {
            HttpResponse httpResponse = httpClient.execute(new HttpPost(uri));
            response = FileUtils.streamToString(httpResponse.getEntity().getContent());
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_POST.getCode().replace("%1", uri).replace("%2",httpResponse.getStatusLine().toString()),false);
            operationLogger.operationFinished();
        } catch (IOException | FileManipulationException e) {
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_POST_EXCEPTION.getCode().replace("%1", e.getMessage()),true);
            operationLogger.operationFinished();
        }
        return response;
    }

    public String doDelete(String uri){
        try {
            HttpResponse httpResponse = httpClient.execute(new HttpDelete(uri));
            response = FileUtils.streamToString(httpClient.execute(new HttpDelete(uri)).getEntity().getContent());
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_DELETE.getCode().replace("%1", uri).replace("%2",httpResponse.getStatusLine().toString()),false);
            operationLogger.operationFinished();
        } catch (IOException | FileManipulationException e) {
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_DELETE_EXCEPTION.getCode().replace("%1", e.getMessage()),true);
            operationLogger.operationFinished();
        }
        return response;
    }

    public String doPut(String uri){
        try {
            HttpResponse httpResponse = httpClient.execute(new HttpPut(uri));
            response = FileUtils.streamToString(httpResponse.getEntity().getContent());
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_PUT.getCode().replace("%1", uri).replace("%2",httpResponse.getStatusLine().toString()),false);
            operationLogger.operationFinished();
        } catch (IOException | FileManipulationException e) {
            OperationLogger operationLogger = new OperationLogger(LoggingCodes.TTL_REST_PUT_EXCEPTION.getCode().replace("%1", e.getMessage()),true);
            operationLogger.operationFinished();
        }
        return response;
    }

}
