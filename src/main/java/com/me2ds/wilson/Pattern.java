package com.me2ds.wilson;

/**
 * Created by w3kim on 15. 6. 26..
 */
public class Pattern {
    private String src_ip;
    private String dst_ip;
    private int dst_port;
    private int period;

    @Override
    public String toString() {
        return "Pattern{" +
                "src_ip='" + src_ip + '\'' +
                ", dst_ip='" + dst_ip + '\'' +
                ", dst_port=" + dst_port +
                ", period=" + period +
                '}';
    }
}
