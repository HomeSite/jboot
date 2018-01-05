/**
 * Copyright (c) 2015-2018, 徐海峰 (27533892@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 *  http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.core.mq.qpidmq;

import io.jboot.config.annotation.PropertyConfig;

@PropertyConfig(prefix = "jboot.mq.qpid")
public class JbootQpidmqConfig {
    private String username = "admin";
    private String password = "admin";

    private String host = "127.0.0.1:5672";
    private String virtualHost;

    private boolean serializerEnable = true;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getVirtualHost() {
        return virtualHost;
    }

    public void setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
    }

    public boolean isSerializerEnable() {
        return serializerEnable;
    }

    public void setSerializerEnable(boolean serializerEnable) {
        this.serializerEnable = serializerEnable;
    }
}
