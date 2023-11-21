package api;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

class HttpClientService$1 implements JsonDeserializer<LocalDateTime> {
    private final HttpClientService this$0;

    HttpClientService$1(HttpClientService this$0) {
        this.this$0 = this$0;
    }

    public LocalDateTime deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        long dateTimeJson = json.getAsJsonPrimitive().getAsLong();
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(dateTimeJson), ZoneId.systemDefault());
    }
}
