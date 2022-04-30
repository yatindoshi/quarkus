package config;

import lombok.AllArgsConstructor;
import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
public class InMemoryConfigSource implements ConfigSource {

    private Map<String,String> config;

    @Override
    public Map<String, String> getProperties() {
        return config;
    }

    @Override
    public Set<String> getPropertyNames() {
        return config.keySet();
    }

    @Override
    public int getOrdinal() {
        return 275;
    }

    @Override
    public String getValue(String s) {
        return config.get(s);
    }

    @Override
    public String getName() {
        return InMemoryConfigSource.class.getName();
    }
}
