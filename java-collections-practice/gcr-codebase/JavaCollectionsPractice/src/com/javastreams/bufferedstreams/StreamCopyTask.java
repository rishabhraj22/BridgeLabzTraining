package com.javastreams.bufferedstreams;
import java.io.IOException;

public interface StreamCopyTask {
    long copy(String source, String destination) throws IOException;
}
