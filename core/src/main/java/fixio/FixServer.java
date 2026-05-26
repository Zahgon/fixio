/*
 * Copyright 2014 The FIX.io Project
 *
 * The FIX.io Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package fixio;

import fixio.handlers.FixApplication;
import fixio.netty.pipeline.SessionRepository;
import fixio.netty.pipeline.server.FixAcceptorChannelInitializer;
import fixio.netty.pipeline.server.FixAuthenticator;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.InetSocketAddress;

public class FixServer extends AbstractFixConnector {

    private static final Logger LOGGER = LoggerFactory.getLogger(FixServer.class);

    private final int port;

    private Channel channel;

    private EventLoopGroup bossGroup;

    private EventLoopGroup workerGroup;

    private FixAuthenticator authenticator;

    public FixServer(int port, FixApplication fixApplication, FixAuthenticator authenticator, SessionRepository sessionRepository) {
        super(fixApplication, sessionRepository);
        assert (authenticator != null) : "Authenticator is required";
        this.authenticator = authenticator;
        this.port = port;
    }

    public void start() throws InterruptedException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void stop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
