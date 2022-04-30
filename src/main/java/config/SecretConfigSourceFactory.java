package config;

import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalInt;

public class SecretConfigSourceFactory implements ConfigSourceFactory {

    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext configSourceContext) {
        var password = configSourceContext.getValue("quarkus.datasource.password").getValue();
        if (password.startsWith("Encoded")) {
            password = "Hiymd123";
        }
        var map = new HashMap<String, String>();
        map.put("quarkus.datasource.password", password);
        List<ConfigSource> configSources1 = Collections.singletonList(new InMemoryConfigSource(map));
        List<ConfigSource> configSources = configSources1;
        return configSources;
    }

    @Override
    public OptionalInt getPriority() {
        return ConfigSourceFactory.super.getPriority();
    }
}
