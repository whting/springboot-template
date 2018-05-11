package com.wht.template.core.aerospike;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Host;
import com.aerospike.client.policy.ClientPolicy;
import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;

/****************************************
 * @@CREATE : 2018-03-31 下午3:07
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION : 获取Aerospike客户端连接
 * @@VERSION :
 *
 *****************************************/
public class AerospikeSource implements  DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(AerospikeSource.class);

    private String host;
    private int port;
    private  AerospikeClient client;

    public AerospikeSource(String host,int port){
        Preconditions.checkNotNull(host);
        Preconditions.checkNotNull(port);
        this.host = host;
        this.port = port;
    }




    public AerospikeClient getClient(){
        Host[] hosts = Host.parseHosts(host, port);
        client = new AerospikeClient(new ClientPolicy(), hosts);
        logger.info("Aerospike init success");
        return client;
    }


    @Override
    public void destroy() throws Exception {
        if (client != null) {
            logger.info("Aerospike destroyed");
            client.close();
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
