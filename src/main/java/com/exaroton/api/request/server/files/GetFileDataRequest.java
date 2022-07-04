package com.exaroton.api.request.server.files;

import com.exaroton.api.ExarotonClient;

import java.util.HashMap;
import java.util.Map;

public class GetFileDataRequest extends FileDataRequest {
    protected String responseType;
    public GetFileDataRequest(ExarotonClient client, String serverId, String path, String responseType) {
        super(client, serverId, path);
        this.responseType = responseType;
    }

    @Override
    protected HashMap<String, String> getHeaders() {
        HashMap<String, String> map = super.getHeaders();
        map.put("Response-Type", this.responseType);
        return map;
    }
}
